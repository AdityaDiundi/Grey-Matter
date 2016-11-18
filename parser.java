import org.xml.sax.*;
import javax.xml.parsers.*;
import org.xml.sax.helpers.*;
import java.util.*;
import java.io.*;

public class parser
{
    public static void main(String[] args)
    {
        guiclass obj = new guiclass();
        obj.drawframe();
        System.setProperty("jdk.xml.entityExpansionLimit", "0");
       /*
       try
        {
            File ifile = new File ("src\\dblp.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser par = factory.newSAXParser();
            handler handle  = new handler();
            par.parse(ifile , handle);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        */
    }
}
/*
class handler extends DefaultHandler
{
    boolean auname;
    boolean ttag;

    public void filework(char[] content)
    {
        try
        {
            File file = new File("src\\aunamettag.txt");
            if (!file.exists())
            {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
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
        if (auname)
        {
            System.out.println("Author name : " + new String(ch, start, length));
            filework(ch);
            auname = false;
        }
        else if (ttag)
        {
            System.out.println("Title name : " + new String(ch,start,length));
            filework(ch);
            ttag = false;
        }
    }
}
*/
