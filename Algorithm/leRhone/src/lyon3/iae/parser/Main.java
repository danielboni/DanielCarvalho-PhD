package lyon3.iae.parser;

import org.dom4j.DocumentException;

import lyon3.iae.rhone.Rhone;

public class Main {

	public static void main(String[] args) throws DocumentException {
		Rhone rhone = InputHandler.handleArguments("testcases.xml", "0");
		//System.out.println(rhone.toString());
		rhone.selectServices();
		rhone.printCandidateServices();
	}
}
 