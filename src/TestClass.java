import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by student on 9/7/17.
 */
public class TestClass{

//    public static final int FRAMEWIDTH = 1000, FRAMEHEIGHT = 600;
    private SAT sat;
    private int eng;
    private int math;
//    private Timer timer;
//
    public TestClass(){
        sat = new SAT();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number of Questions Wrong in the Reading Section");
        int reading = Integer.parseInt(input.next());

        System.out.println("Enter Number of Questions Wrong in the Writing Section");
        int writing = Integer.parseInt(input.next());

        eng = sat.scaleEnglish(reading) + sat.scaleEnglish(writing);

        System.out.println("Enter Number of Questions Wrong in the Math (non calc) Section");
        int mathNonCalc = Integer.parseInt(input.next());

        System.out.println("Enter Number of Questions Wrong in the Math (calc) Section");
        int mathCalc = Integer.parseInt(input.next());

        math = sat.scaleMath(mathNonCalc)+sat.scaleMath(mathCalc);

        System.out.println("English Score: " + eng + " Math Score: " + math);

//        setSize(FRAMEWIDTH, FRAMEHEIGHT);
//
//        timer = new Timer(40, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                repaint();
//            }
//        });
//        timer.start();
//
    }
//
//    public void paintComponent(Graphics g){
//        super.paintComponent(g);
//        Graphics2D g2 = (Graphics2D)g;
//    }


    public static void main(String[] args) {


//        JFrame window = new JFrame("Something");
//        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        window.setBounds(0, 0, FRAMEWIDTH, FRAMEHEIGHT + 22); //(x, y, w, h) 22 due to title bar.
//
//        TestClass panel = new TestClass();
//        panel.setSize(FRAMEWIDTH, FRAMEHEIGHT);
//
//        panel.setFocusable(true);
//        panel.grabFocus();
//
//        window.add(panel);
//        window.setVisible(true);
//        window.setResizable(false);
    }

}