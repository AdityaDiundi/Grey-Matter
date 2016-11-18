import org.xml.sax.*;

import javax.xml.parsers.*;

import org.xml.sax.helpers.*;

import java.util.Scanner;
import java.io.*;
import java.util.logging.FileHandler;

//! Parser class for parsing dblp.xml.
/*!
    This class contains handler class which contains functions for solving queries and also to drive the gui upon execution
 */
public class parser {
    /**
    *  'MAIN' function containing object declaration for sax parser and to drive gui
    */
    public static void main(String[] args) {
        guiclass obj = new guiclass();
        obj.drawframe();
        System.setProperty("jdk.xml.entityExpansionLimit", "0");

        try {
            File ifile = new File("src\\dblp.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser par = factory.newSAXParser();
            handler handle = new handler();
            par.parse(ifile, handle);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

//! Handler class for carrying out parsing operations and user queries.
/*! This class contains query functions and event based parsing functions
*/
class handler extends DefaultHandler {

    /**
     * < Boolean for the event when parser finds the (author node)
     */
    boolean auname;
    /**
     * <Boolean for the event when parser finds the (title tag node)
     */
    boolean ttag;

    /**
    *  'query2' function containing object declaration for sax parser and to drive gui
    */
    public void query2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of publications for query2 : ");
        int pubvalue = sc.nextInt();   /** Int to hold user input value of no of publications('k')*/

    }




    /*
    public void filework(char[] content)
    {
        try
        {
            File file = new File("src\\aunamettag.txt");
            if (!file.exists())
            {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.write("\n");
            bw.close();
            fw.close();
        }
        catch (IOException f)
        {
            f.printStackTrace();
        }
    }


    @Override
    public void startElement(String uri , String localName , String qName , Attributes attributes) throws SAXException
    {
        if (qName.equalsIgnoreCase ("author"))
        {
            auname = true;
        }
        else if (qName.equalsIgnoreCase("title"))
        {
            ttag = true;
        }

    }

    @Override
    public void characters(char ch[] , int start , int length) throws SAXException
    {
        int iterator = 0;
        int iterator1 = 0;
        if (auname)
        {
            String s1 = new String("Author name : " + new String(ch,start,length));
            char[] forfile = s1.toCharArray();
            filework(forfile);
            int sum = iterator + 1;
            System.out.println("Wrinting Author name : Iterator :"+ sum);
            auname = false;
        }
        else if (ttag)
        {

            String s2 = new String("Title Tag : " + new String(ch,start,length));
            char[] forfile2 = s2.toCharArray();
            filework(forfile2);
            int sum1  = iterator1 + 1;
            System.out.println("Writing TitleTag name : Iterator :"+sum1);
            ttag = false;
        }
    }

*/
}

