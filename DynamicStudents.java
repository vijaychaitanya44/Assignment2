package com.assignment2;

import java.util.Scanner;

public class DynamicStudents {

	String stu;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter number of students");

		int students = sc.nextInt();
		String stu[] = new String[students];

		for (int i = 0; i < students; i++) {

			System.out.println("Please enter  name: ");
			String sName = sc.next();

			System.out.println("Please enter email: ");
			String sEmail = sc.next();

			stu[i] = sName + "\n" + sEmail;

		}

		System.out.println("Please enter which student details you looking for: ");
		students = sc.nextInt();
		System.out.println(stu[students - 1]);

		sc.close();
	}

}
