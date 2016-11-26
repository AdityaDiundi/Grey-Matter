import javax.xml.parsers.*;
import java.io.*;

//! Parser class for parsing dblp.xml.
/*!
    This class contains handler class which contains functions for solving queries and also to drive the gui upon execution
 */
public class parser {
    /**
     * 'MAIN' function containing object declaration for sax parser and to drive gui
     */
    public static void main(String[] args) {
        guiclass obj = new guiclass();
        obj.drawframe();
        System.setProperty("jdk.xml.entityExpansionLimit", "0");
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
