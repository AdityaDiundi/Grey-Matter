package proj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public  class tester {
	public static void main (String args[]) throws FileNotFoundException
	{
		File xmlFile=new File("dblp.xml");
		userxmlparser parser= new userxmlparser();
		ArrayList users=parser.parserxml(new FileInputStream(xmlFile));
		System.out.println(users);
		
	}
}