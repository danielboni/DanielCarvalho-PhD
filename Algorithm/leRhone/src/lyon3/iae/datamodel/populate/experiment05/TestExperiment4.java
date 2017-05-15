package lyon3.iae.datamodel.populate.experiment05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

import org.dom4j.DocumentException;

import lyon3.iae.parser.InputHandler;
import lyon3.iae.rhone.Rhone;

public class TestExperiment4 {

	public static void main(String[] args) throws DocumentException, SQLException, IOException {
		
		String resultFileName = "rewriting_3_100.txt";
		File file = new File(resultFileName);
		FileWriter writer = new FileWriter(file, true);
		
		writer.write("Results from rewriting queries with 3 abstract services and 100 matches.\n");

		Rhone rhone = InputHandler.handleArguments("R-T9.xml", "1");

		long tempInicial = System.currentTimeMillis();

		rhone.selectCandidateServicesFromDB("query_history_26");
//		System.out.println(rhone.getCadidateConcreteServices().size());

		rhone.divideGroups3_NEW();
		rhone.combine3_NEW();
		
		//			if (i == 1) {
		//				rhone.divideGroups2_NEW();
		//				rhone.combine2_NEW();
		//			} else if (i == 2) {
		//				rhone.divideGroups3_NEW();
		//				rhone.combine3_NEW();
		//			} else if (i == 3) {
		//				rhone.divideGroups4_NEW();
		//				rhone.combine4_NEW();	
		//			} else if (i == 4) {
		//				rhone.divideGroups5_NEW();
		//				rhone.combine5_NEW();
		//			}

		long tempFinal = System.currentTimeMillis();
		long dif = (tempFinal - tempInicial);

		writer.write("Done in: \t" + dif + "\t Number of matchings " + rhone.getCadidateConcreteServices().size() + "\t Number of rewritings " + rhone.getCombinations().size());

		writer.close();
		System.out.println("Process Finished");
	}

}
