
/*
 * [A]100
 * [TA's Advise]
 * 1. 沒什麼太大問題, 很好!
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String[] args) {

		String TInput = "";
		GradeAnalyzer b = new GradeAnalyzer();

		while (true) {

			TInput = JOptionPane.showInputDialog(null, "Please enter score:");
			if (TInput.equalsIgnoreCase("q")) {
				break;
			}

			try {
				b.addGrade(Double.parseDouble(TInput));
			} catch (Exception e) {
				System.out.println("Error! Enter again!");
			}
		}
		// 缺少判斷個數, -2
		b.analyzeGrades();
		System.out.println("You entered " + b.UserInput + "Valid grades from 0 to 110.  Invalid grades are ignored! ");
		System.out.println("The average = " + (int) b.Avg + " with a standard deviation = " + (int) b.SD + "\n");
		System.out.println(b);
	}
}