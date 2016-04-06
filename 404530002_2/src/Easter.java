
public class Easter {

	public static String calculateEaster(int aYear) {
		int year, month, day = 0, a, b, c, k, p, q, M, N, d, e;

		year = aYear;
		a = aYear % 19;
		b = aYear % 4;
		c = aYear % 7;
		// 這邊強制轉型要注意, 或許在別的case會有些微差距喔!
		k = (int) Math.floor(aYear / 100);
		p = (int) Math.floor((13 + (8 * k)) / 25);
		q = (int) Math.floor(k / 4);
		M = (15 - p + k - q) % 30;
		N = (4 + k - q) % 7;
		d = (19 * a + M) % 30;
		e = (2 * b + 4 * c + 6 * d + N) % 7;
		if ((d + e) > 9) {
			month = 4;
		} else {
			month = 3;
		}
		// month==4, 這個判斷是多餘的.
		if (month == 4) {
			if (d == 29 && e == 6) {
				day = 19;
				// 應該是(11 * M + 11) % 30 < 19, -2
			} else if (d == 28 && e == 6 && (11 * M + 11) % 30 > 19) {
				day = 18;
			} else {
				day = d + e - 9;
			}

			// 這行不會被執行到, month==4 && month==3, 這看起來是不合理的喔, -3
			if (month == 3) {
				day = 22 + d + e;
			}
		}
		String result = "In" + year + ", Easter Sunday is: month = " + month + " , and day is:" + day;
		return result;
	}
}
