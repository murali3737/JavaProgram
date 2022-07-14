package Java;

import java.util.Random;
import java.util.Scanner;

public class Test {

	int userinput = 12;
	long digit = 0;
	long product = 0;
	long X = 0;

	public long getX(long n) {
		while (userinput >= 1) {
			digit = n % 10;
			n = n / 10;
			product = digit * userinput;
			X = X + product;
			userinput = userinput - 1;
		}
		return X;
	}

	public long getNumber(long n) {
		if (X % 11 == 10) {
			String n1 = String.valueOf(n);
			String n2 = String.valueOf(1);
			String s = n1 + n2;
			long i = Integer.parseInt(s);
			return i;
		} else {
			String n1 = String.valueOf(n);
			String n2 = String.valueOf(X % 11);
			String s = n1 + n2;
			long i = Long.parseLong(s);
			return i;
		}
	}

	public static void main(String[] args) {

		Test userinput = new Test();
		// object of the Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a 9 digit number: ");
		Long ninenum = sc.nextLong();
		// 3 Digit random number generate
		Random rnd = new Random();
		int randomthreenumber = rnd.nextInt(999);
		// num+3digit num
		String r1 = String.valueOf(ninenum);
		String r2 = String.valueOf(randomthreenumber);
		String f = r1 + r2;
		long outputrnumber = Long.parseLong(f);
		userinput.getX(outputrnumber);
		System.out.println(userinput.getNumber(outputrnumber));

	}

}
