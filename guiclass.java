import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.Font;
public class guiclass
{
    void drawframe()
    {
        // Frame , label , Scrollpanes

        JFrame frame = new JFrame(" ");
        JLabel label = new JLabel("DBLP Query Engine",JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setFont(new Font("Consolas",Font.PLAIN,30));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.add(label);

        //tabs for queries

        JPanel query1 =new JPanel();
        JPanel query2 = new JPanel();
        JPanel query3 = new JPanel();
        /*
        JLabel query1label =new JLabel("Query 1");
        JLabel query2label =new JLabel("Query 2");
        JLabel query3label =new JLabel("Query 3");
        */
        JTabbedPane tabpane = new JTabbedPane();

        /*
        query1.add(query1label);
        query2.add(query2label);
        query3.add(query3label);
        */

        tabpane.add("Query One" , query1);
        tabpane.setFont(new Font("Consolas", Font.ITALIC ,24));
        tabpane.add("Query Two" , query2);
        tabpane.add("Query Three" , query3);
        frame.add(tabpane);

    }
}
