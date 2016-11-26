import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.util.Stack;
import java.io.*;

//! GUI class for handling UI.
/*!
    This class contains swing library functions used to create the gui for the query engine
 */
public class guiclass {
    public JPanel query1;
    public JPanel query2;
    public JPanel query3;

    void drawframe() {
        // Frame , label , Scrollpanes

        JFrame frame = new JFrame("DBLP Query Engine");
        JLabel label = new JLabel("DBLP Query Engine", JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setFont(new Font("Consolas", Font.PLAIN, 30));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.add(label);

        //tabs for queries

        query1 = new JPanel();
        query1.setLayout(null);
        query2 = new JPanel();
        query2.setLayout(null);
        query3 = new JPanel();
        query3.setLayout(null);
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

        tabpane.add("Query One", query1);
        tabpane.setFont(new Font("Consolas", Font.ITALIC, 24));
        tabpane.add("Query Two", query2);
        tabpane.add("Query Three", query3);
        frame.add(tabpane);

        // buttons for different queries
        JButton button1 = new JButton("Search by Author Name"); // For returning results based on author name
        button1.setFont(new Font("Consolas", Font.BOLD, 20));
        button1.setBounds(40,100,500,50);
        JButton button2 = new JButton("Search by Title Tag");   // For returning results based on title tag
        button2.setFont(new Font("Consolas", Font.BOLD, 20));
        button2.setBounds(40,160,500,50);

        query1.add(button1);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    query1.removeAll();
                } catch (Exception ef) {
                }
                JButton button1 = new JButton("Search by Author Name"); // For returning results based on author name
                button1.setFont(new Font("Consolas", Font.BOLD, 20));
                button1.setBounds(40,100,500,50);
                JButton button2 = new JButton("Search by Title Tag");   // For returning results based on title tag
                button2.setFont(new Font("Consolas", Font.BOLD, 20));
                button2.setBounds(40,160,500,50);
                query1.add(button1);
                query1.add(button2);

                JLabel label1 = new JLabel("Author Name :");
                label1.setBounds(40, 300, 200, 40);
                label1.setFont(new Font("Consolas", Font.PLAIN, 20));

                JTextField jtf1 = new JTextField();
                jtf1.setBounds(300, 300, 248, 30);
                jtf1.setFont(new Font("Consolas", Font.PLAIN, 20));

                JLabel label2 = new JLabel("Since year :");
                label2.setBounds(40, 340, 150, 40);
                label2.setFont(new Font("Consolas", Font.PLAIN, 20));

                JTextField jtf2 = new JTextField();
                jtf2.setBounds(300, 340, 100, 30);
                jtf2.setFont(new Font("Consolas", Font.PLAIN, 20));

                JLabel label3 = new JLabel("Between years :");
                label3.setBounds(40, 380, 200, 40);
                label3.setFont(new Font("Consolas", Font.PLAIN, 20));

                JTextField jtf3 = new JTextField();
                jtf3.setBounds(300, 380, 100, 30);
                jtf3.setFont(new Font("Consolas", Font.PLAIN, 20));

                JLabel label4 = new JLabel("-");
                label4.setBounds(405, 385, 150, 20);
                label4.setFont(new Font("Consolas", Font.PLAIN, 20));

                JTextField jtf4 = new JTextField();
                jtf4.setBounds(420, 380, 100, 30);
                jtf4.setFont(new Font("Consolas", Font.PLAIN, 20));


                query1.add(label1);
                query1.add(jtf1);
                query1.add(label2);
                query1.add(jtf2);
                query1.add(label3);
                query1.add(jtf3);
                query1.add(label4);
                query1.add(jtf4);

                frame.validate();
                frame.repaint();
                JButton search = new JButton("SEARCH");
                search.setBounds(40, 420, 85, 35);
                search.setForeground(Color.black);
                JButton reset = new JButton("RESET");
                reset.setBounds(150, 420, 85, 35);
                reset.setForeground(Color.black);
                query1.add(search);
                query1.add(reset);

            }

        });
        query1.add(button2);
        button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try {
                     query1.removeAll();
                } catch (Exception ef) {
                }

                JButton button1 = new JButton("Search by Author Name"); // For returning results based on author name
                button1.setFont(new Font("Consolas", Font.BOLD, 20));
                button1.setBounds(40,100,500,50);
                JButton button2 = new JButton("Search by Title Tag");   // For returning results based on title tag
                button2.setFont(new Font("Consolas", Font.BOLD, 20));
                query1.add(button1);
                query1.add(button2);

                button2.setBounds(40,160,500,50);
                JLabel label1 = new JLabel("Title Tag :");
                label1.setBounds(40, 300, 200, 40);
                label1.setFont(new Font("Consolas", Font.PLAIN, 20));

                JTextField jtf1 = new JTextField();
                jtf1.setBounds(300, 300, 248, 30);
                jtf1.setFont(new Font("Consolas", Font.PLAIN, 20));

                JLabel label2 = new JLabel("Since year :");
                label2.setBounds(40, 340, 150, 40);
                label2.setFont(new Font("Consolas", Font.PLAIN, 20));

                JTextField jtf2 = new JTextField();
                jtf2.setBounds(300, 340, 100, 30);
                jtf2.setFont(new Font("Consolas", Font.PLAIN, 20));

                JLabel label3 = new JLabel("Between years :");
                label3.setBounds(40, 380, 200, 40);
                label3.setFont(new Font("Consolas", Font.PLAIN, 20));

                JTextField jtf3 = new JTextField();
                jtf3.setBounds(300, 380, 100, 30);
                jtf3.setFont(new Font("Consolas", Font.PLAIN, 20));

                JLabel label4 = new JLabel("-");
                label4.setBounds(405, 385, 150, 20);
                label4.setFont(new Font("Consolas", Font.PLAIN, 20));

                JTextField jtf4 = new JTextField();
                jtf4.setBounds(420, 380, 100, 30);
                jtf4.setFont(new Font("Consolas", Font.PLAIN, 20));

                query1.add(label1);
                query1.add(jtf1);
                query1.add(label2);
                query1.add(jtf2);
                query1.add(label3);
                query1.add(jtf3);
                query1.add(label4);
                query1.add(jtf4);

                frame.validate();
                frame.repaint();
                JButton search = new JButton("SEARCH");
                search.setBounds(40, 420, 85, 35);
                search.setForeground(Color.black);
                JButton reset = new JButton("RESET");
                reset.setBounds(150, 420, 85, 35);
                reset.setForeground(Color.black);
                query1.add(search);
                query1.add(reset);

            }
        });

        // For query 2
        JLabel enterpubl = new JLabel("Enter Number of Publications ( k ) : ");
        enterpubl.setBounds(40, 40, 500, 40);
        enterpubl.setFont(new Font("Consolas", Font.PLAIN, 20));
        JTextField tfpubl = new JTextField();
        tfpubl.setBounds(500, 40, 50, 40);
        tfpubl.setFont(new Font("Consolas", Font.PLAIN, 20));
        query2.add(enterpubl);
        query2.add(tfpubl);

    }
}
