package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class testscore {
public static void main(String[] args) {
	String t=JOptionPane.showInputDialog(null,"What was your first test score?");
	double test1=Double.parseDouble(t);
if(test1>90.0) {
	JOptionPane.showMessageDialog(null,"Wow, you did great!");
}
if(test1<90.0) {
	JOptionPane.showMessageDialog(null,"You need to do better next time.");
}
}

}

