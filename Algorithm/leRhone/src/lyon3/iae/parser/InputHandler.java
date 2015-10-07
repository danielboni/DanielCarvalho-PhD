package lyon3.iae.parser;

import java.io.ObjectInputStream.GetField;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lyon3.iae.datamodel.AbstractService;
import lyon3.iae.datamodel.ConcreteService;
import lyon3.iae.datamodel.Constraints;
import lyon3.iae.datamodel.InputVariable;
import lyon3.iae.datamodel.OutputVariable;
import lyon3.iae.datamodel.QualityAspect;
import lyon3.iae.datamodel.Query;
import lyon3.iae.datamodel.UserPreference;
import lyon3.iae.datamodel.Variable;
import lyon3.iae.rhone.Rhone;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class InputHandler {

	private static Rhone rhone = new Rhone();
	
/*	public static void main (String args[]) throws MalformedURLException, DocumentException{
		InputHandler handler = new InputHandler();
		Document document = handler.parse("testcases.xml");
		handler.bar(document, "0");
		Rhone parser = new Rhone();
		parser.queryParser("Q(x?, y!) := A1(x?,y!), A2(x?,y!)"
				+ "{x = \"K\", x < \"2\"}"
				+ "[availability > 98%, response time < 2s, price per call = 0.1$, totalCost < 1$]");
		parser.concreteServiceParser("C(x?, y!) := A1(x?,y!), A2(x?,y!)"
				+ "[availability > 98%, response time < 2s, price per call = 0.1$, totalCost < 1$]");
		
	}*/
	
	public static Rhone handleArguments(String url, String testID) throws DocumentException{
		Document document = getDocument(url);
		boolean check = readFile(document, testID);
		return rhone;
	}
	 
	private static Document getDocument(String url) throws DocumentException{
		SAXReader reader = new SAXReader();
        Document document = reader.read(url);
        return document;
	}
	
	private static boolean readFile(Document document, String id) throws DocumentException {

        Element root = document.getRootElement();
        
        for (Iterator<?> i = root.elementIterator(); i.hasNext(); ) {
            Element element = (Element) i.next();
            
            for (Iterator<?> cont = element.attributeIterator(); cont.hasNext(); ) {
                Attribute attribute = (Attribute) cont.next();
                
                if (attribute.getStringValue().equals(id)){
                	List<ConcreteService> concreteServices = new ArrayList<ConcreteService>();
                	
                	for (Iterator<?> j = element.elementIterator(); j.hasNext(); ) {
                        Element child = (Element) j.next();
                        
                        if (child.getName().equals("query")){
                        	rhone.setQuery(processQuery(child.getStringValue()));
                        } else if (child.getName().equals("service")) {
                        	concreteServices.add(processConcreteService(child.getStringValue()));
                        } else {
                        	System.out.println("Malformed XML");
                        }
                    }
                	rhone.setConcreteServices(concreteServices);
                	return true;
                }
            }
        }
		return false;
     }
	
	private static Query processQuery(String query){
		Query q = new Query();
		
		q.setHead(getHeadDefinition(query).trim());
		q.setBody(getBodyDefinition(query).trim());

		List<Variable> headVariables = processVariables(q.getHead());
		q.setHeadVariables(headVariables);
		
		q.setUserPreferences(getUserPreferences(q.getBody()));
		
		q.setAbstractServices(getAbstractServices(q.getBody()));
		
		q.setConstraints(getConstraints(q.getBody()));
		return q;
	}
	
	public static ConcreteService processConcreteService(String concreteService){
		ConcreteService c = new ConcreteService();
		c.setHead(getHeadDefinition(concreteService));
		c.setBody(getBodyDefinition(concreteService));
		List<Variable> headVariables = processVariables(c.getHead());
		c.setHeadVariables(headVariables);
		c.setAbstractServices(getAbstractServices(c.getBody()));
		c.setQualityAspects(getQualityAspects(c.getBody()));
		return c;
	}

	public static String getHeadDefinition(String query){
		int middle = query.indexOf(":");
		return query.substring(0, middle-1);
	}
	
	public static String getBodyDefinition(String query){
		int middle = query.indexOf("=");
		return query.substring(middle+1, query.length());
	}
	
	public static List<Variable> processVariables(String s){
		int begin = s.indexOf("(") + 1;
		int end = s.indexOf(")");
		String s1 = s.substring(begin, end);
		List<Variable> variables = new ArrayList<Variable>();
		String[] vars = s1.split(",");
		for (String var : vars) {
			int i = var.indexOf("?");
			if (i == -1){
				i = var.indexOf("!");
				OutputVariable out = new OutputVariable();
				out.setName((var.substring(0, i)).trim());
				variables.add(out);
			} else {
				InputVariable in = new InputVariable();
				in.setName((var.substring(0, i)).trim());
				variables.add(in);
			}
		}
		return variables;
	}
	
	public static List<UserPreference> getUserPreferences(String body){
		List<UserPreference> userPreferences = new ArrayList<UserPreference>();
		int begin = body.indexOf("[");
		int end = body.indexOf("]");
		String userPref = body.substring(begin+1, end);
		//System.out.println(userPref);
		String[] prefs = userPref.split(",");
		for (String pref: prefs){
			if (pref.contains("<=")){
				String[] prefParts = pref.split("<=");
				UserPreference u = new UserPreference();
				u.setMeasure(prefParts[0].trim());
				u.setOp("<=");
				u.setValue(prefParts[1].trim());
				userPreferences.add(u);
			} else if (pref.contains(">=")){
				String[] prefParts = pref.split(">=");
				UserPreference u = new UserPreference();
				u.setMeasure(prefParts[0].trim());
				u.setOp(">=");
				u.setValue(prefParts[1].trim());
				userPreferences.add(u);
			} else if (pref.contains("!=")){
				String[] prefParts = pref.split("!=");
				UserPreference u = new UserPreference();
				u.setMeasure(prefParts[0].trim());
				u.setOp("!=");
				u.setValue(prefParts[1].trim());
				userPreferences.add(u);
			} else if (pref.contains(">")){
				String[] prefParts = pref.split(">");
				UserPreference u = new UserPreference();
				u.setMeasure(prefParts[0].trim());
				u.setOp(">");
				u.setValue(prefParts[1].trim());
				userPreferences.add(u);
			} else if (pref.contains("<")){
				String[] prefParts = pref.split("<");
				UserPreference u = new UserPreference();
				u.setMeasure(prefParts[0].trim());
				u.setOp("<");
				u.setValue(prefParts[1].trim());
				userPreferences.add(u);
			} else if (pref.contains("=")){
				String[] prefParts = pref.split("=");
				UserPreference u = new UserPreference();
				u.setMeasure(prefParts[0].trim());
				u.setOp("=");
				u.setValue(prefParts[1].trim());
				userPreferences.add(u);
			}
		}
		return userPreferences;
	}
	
	private static List<AbstractService> getAbstractServices(String body) {
		List<AbstractService> abstractServices = new ArrayList<AbstractService>();
		int end = body.indexOf("{");
		if (end == -1)
			end = body.indexOf("[");
		if (end == -1)
			end = body.length();
				
		String aServices = body.substring(0, end);
		//System.out.println(aServices);
		String[] aS = aServices.split(",");
		String concat = "";
		for (String abs: aS){
			if (!abs.contains(")")){
				concat = concat + abs + ",";
			}else {
				concat = concat + abs;
				//System.out.println(concat.trim());
				AbstractService a = new AbstractService();
				a.setDescription(concat.trim());
				int i = concat.indexOf("(");
				a.setName((concat.substring(0, i)).trim());
				a.setVariables(processVariables(concat));
				abstractServices.add(a);
				concat = "";
			}
		}
		return abstractServices;
	}
	
	public static List<Constraints> getConstraints(String body){
		List<Constraints> constraints = new ArrayList<Constraints>();
		int begin = body.indexOf("{");
		int end = body.indexOf("}");
		String constraintsPart = body.substring(begin+1, end);
		//System.out.println(constraintsPart);
		String[] prefs = constraintsPart.split(",");
		for (String pref: prefs){
			if (pref.contains("<=")){
				String[] prefParts = pref.split("<=");
				Constraints u = new Constraints();
				u.setVariableName(prefParts[0].trim());
				u.setOp("<=");
				u.setValue(prefParts[1].trim());
				constraints.add(u);
			} else if (pref.contains(">=")){
				String[] prefParts = pref.split(">=");
				Constraints u = new Constraints();
				u.setVariableName(prefParts[0].trim());
				u.setOp(">=");
				u.setValue(prefParts[1].trim());
				constraints.add(u);
			} else if (pref.contains("!=")){
				String[] prefParts = pref.split("!=");
				Constraints u = new Constraints();
				u.setVariableName(prefParts[0].trim());
				u.setOp("!=");
				u.setValue(prefParts[1].trim());
				constraints.add(u);
			} else if (pref.contains(">")){
				String[] prefParts = pref.split(">");
				Constraints u = new Constraints();
				u.setVariableName(prefParts[0].trim());
				u.setOp(">");
				u.setValue(prefParts[1].trim());
				constraints.add(u);
			} else if (pref.contains("<")){
				String[] prefParts = pref.split("<");
				Constraints u = new Constraints();
				u.setVariableName(prefParts[0].trim());
				u.setOp("<");
				u.setValue(prefParts[1].trim());
				constraints.add(u);
			} else if (pref.contains("=")){
				String[] prefParts = pref.split("=");
				Constraints u = new Constraints();
				u.setVariableName(prefParts[0].trim());
				u.setOp("=");
				u.setValue(prefParts[1].trim());
				constraints.add(u);
			}
		}
		return constraints;
	}
	
	private static List<QualityAspect> getQualityAspects(String body) {
		List<QualityAspect> qualityAspects = new ArrayList<QualityAspect>();
		int begin = body.indexOf("[");
		int end = body.indexOf("]");
		String userPref = body.substring(begin+1, end);
		//System.out.println(userPref);
		String[] prefs = userPref.split(",");
		for (String pref: prefs){
			if (pref.contains("<=")){
				String[] prefParts = pref.split("<=");
				QualityAspect u = new QualityAspect();
				u.setMeasure(prefParts[0].trim());
				u.setOp("<=");
				u.setValue(prefParts[1].trim());
				qualityAspects.add(u);
			} else if (pref.contains(">=")){
				String[] prefParts = pref.split(">=");
				QualityAspect u = new QualityAspect();
				u.setMeasure(prefParts[0].trim());
				u.setOp(">=");
				u.setValue(prefParts[1].trim());
				qualityAspects.add(u);
			} else if (pref.contains("!=")){
				String[] prefParts = pref.split("!=");
				QualityAspect u = new QualityAspect();
				u.setMeasure(prefParts[0].trim());
				u.setOp("!=");
				u.setValue(prefParts[1].trim());
				qualityAspects.add(u);
			} else if (pref.contains(">")){
				String[] prefParts = pref.split(">");
				QualityAspect u = new QualityAspect();
				u.setMeasure(prefParts[0].trim());
				u.setOp(">");
				u.setValue(prefParts[1].trim());
				qualityAspects.add(u);
			} else if (pref.contains("<")){
				String[] prefParts = pref.split("<");
				QualityAspect u = new QualityAspect();
				u.setMeasure(prefParts[0].trim());
				u.setOp("<");
				u.setValue(prefParts[1].trim());
				qualityAspects.add(u);
			} else if (pref.contains("=")){
				String[] prefParts = pref.split("=");
				QualityAspect u = new QualityAspect();
				u.setMeasure(prefParts[0].trim());
				u.setOp("=");
				u.setValue(prefParts[1].trim());
				qualityAspects.add(u);
			}
		}
		return qualityAspects;
	}
}
