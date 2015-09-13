package football;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int td;
		double total_yards;
		int interceptions;
		int completions;
		int att;

		System.out.print("Total number of touch downs: ");
		td = sc.nextInt();

		System.out.print("Totla number of yards: ");
		total_yards = sc.nextDouble();

		System.out.print("Total nuber of interceptions: ");
		interceptions = sc.nextInt();

		System.out.print("Total number of completions: ");
		completions = sc.nextInt();

		System.out.print("Total number of pass attempts: ");
		att = sc.nextInt();

		System.out.print("Passer rating is "
				+ passerRating(A(completions, att), B(total_yards, att), C(td, att), D(interceptions, att)));
	}

	public static double A(int comp, int att) {
		double a = ((comp / att) - 0.3) * 5;
		if (a > 2.375) {
			a = 2.375;
		} else if (a < 0) {
			a = 0;
		}
		return a;
	}

	public static double B(double yards, int att) {
		double b = ((yards / att) - 3) * 0.25;
		if (b > 2.375) {
			b = 2.375;
		} else if (b < 0) {
			b = 0;
		}
		return b;

	}

	public static double C(int td, int att) {
		double c = (td / att) * 20;
		if (c > 2.375) {
			c = 2.375;
		} else if (c < 0) {
			c = 0;
		}
		return c;
	}

	public static double D(int interceptions, int att) {
		double d = 2.375 - ((interceptions / att) * 25);
		if (d > 2.375) {
			d = 2.375;
		} else if (d < 0) {
			d = 0;
		}
		return d;
	}

	public static double passerRating(double a, double b, double c, double d) {
		double p = ((a + b + c + d) / 6) * 100;

		return p;
	}

}
