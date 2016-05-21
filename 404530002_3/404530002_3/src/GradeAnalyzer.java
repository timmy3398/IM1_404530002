
import java.util.ArrayList;

class Count {
	String name;
	int mgra;

	Count() {
	}

	Count(String _name, int _mgra) {
		this.name = _name;

		this.mgra = _mgra;
	}

	public String toString() {
		return this.name + "=" + this.mgra;
	}
}

public class GradeAnalyzer {

	int UserInput = 0;
	double TNum = 0, SD = 0, Avg = 0, GetNum = 0, SDtemp = 0;
	ArrayList<Double> NumScore = new ArrayList<Double>();
	Count[] GradeD = new Count[11];
	boolean FirstTime = true;

	static boolean isVGrade(double aGrade) {
		if (aGrade >= 0 && aGrade <= 110)
			return true;
		return false;
	}

	void addGrade(double aGrade) {
		// Good, +2
		if (FirstTime) {
			GradeD[0] = new Count("A+", 0);
			GradeD[1] = new Count("A", 0);
			GradeD[2] = new Count("A-", 0);
			GradeD[3] = new Count("B+", 0);
			GradeD[4] = new Count("B", 0);
			GradeD[5] = new Count("B-", 0);
			GradeD[6] = new Count("C+", 0);
			GradeD[7] = new Count("C", 0);
			GradeD[8] = new Count("C-", 0);
			GradeD[9] = new Count("D", 0);
			GradeD[10] = new Count("F", 0);
			FirstTime = false;
		}

		if (!isVGrade(aGrade)) {
			return;
		}
		NumScore.add(aGrade);
		TNum += aGrade;
		UserInput++;
		if (aGrade <= 110 && aGrade >= 98) {
			GradeD[0].mgra++;
		}

		else if (aGrade < 98 && aGrade >= 92) {
			GradeD[1].mgra++;
		}

		else if (aGrade < 92 && aGrade >= 90) {
			GradeD[2].mgra++;
		}

		else if (aGrade < 90 && aGrade >= 88) {
			GradeD[3].mgra++;
		}

		else if (aGrade < 88 && aGrade >= 82) {
			GradeD[4].mgra++;
		}

		else if (aGrade < 82 && aGrade >= 80) {
			GradeD[5].mgra++;
		}

		else if (aGrade < 80 && aGrade >= 78) {
			GradeD[6].mgra++;
		}

		else if (aGrade < 78 && aGrade >= 72) {
			GradeD[7].mgra++;
		}

		else if (aGrade < 72 && aGrade >= 70) {
			GradeD[8].mgra++;
		}

		else if (aGrade < 70 && aGrade >= 60) {
			GradeD[9].mgra++;
		}

		else if (aGrade < 60 && aGrade >= 0) {
			GradeD[10].mgra++;
		}

	}

	void analyzeGrades() {
		Avg = TNum / UserInput;

		for (int i = 0; i < NumScore.size(); i++) {

			SDtemp += (NumScore.get(i) - Avg) * (NumScore.get(i) - Avg);
		}
		SD = Math.round((Math.sqrt(SDtemp / UserInput)));
	}

	public String toString() {
		String point = "";
		for (int i = 0; i < GradeD.length; i++) {

			point += GradeD[i] + "\n";
		}

		return "The grade distribution is:\n\n" + point;
	}
}
