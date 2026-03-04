/**
 * File: Converting Data Types
 * Author: Naren Nades
 * Date Created: Mar 4, 2026
 * Date Last Modified: Mar 4, 2026
 */

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String num = s.nextLine();

		int i = Integer.parseInt(num);
		i = i+3;
		System.out.println(i);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		String num = s.nextLine();

		num = num + 4;
		Double i = Double.parseDouble(num);
		System.out.println(i+2);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a radius: ");
		String num = s.nextLine();

		Double i = Double.parseDouble(num);
		System.out.println(3.14*(Math.pow(i,2)));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		String num = s.nextLine();

		Double i = Double.parseDouble(num);
		System.out.println(Math.floor(i*12));
	}

}
