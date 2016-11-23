import com.sun.deploy.util.StringUtils;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;

import javax.xml.parsers.*;

import org.xml.sax.helpers.*;

import java.util.Scanner;
import java.io.*;
import java.util.logging.FileHandler;

import java.util.*;
import java.io.*;

public class querytwo extends DefaultHandler
{

    HashMap<String, Integer> hm = new HashMap<String, Integer>();
    boolean auname;

    public void query2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of publications for query2 : ");
        int pubvalue = sc.nextInt();   /** Int to hold user input value of no of publications('k')*/

        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
        {
            if (qName.equalsIgnoreCase("author")) {
                auname = true;
            }
        }

        public void characters(char ch[], int start, int length) throws SAXException
        {
            if (auname)
            {
                int key;
                String author_name = new String(new String(ch,start,length));
                if(checkmap(author_name))
                {
                    hm.put(author_name,hm.get(author_name)+1);
                }
                else
                {
                    hm.put(author_name,1);
                }
            }
        }
        public boolean checkmap(String s)
        {
            Set set = hm.entrySet();
            Iterator i = set.iterator();
            while(i.hasNext())
            {
                Map.Entry me = (Map.Entry)i.next();
                if (s.toLowerCase().contains(me.getKey().toString().toLowerCase()))
                {
                    return true;
                }
            }
        }
    }
}
