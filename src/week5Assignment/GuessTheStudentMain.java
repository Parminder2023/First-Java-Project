package week5Assignment;

import java.util.Scanner;

public class GuessTheStudentMain {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		GuessTheStudent student = new GuessTheStudent();
		student.GuessNameOfStudent();
		System.out.println("Starting new game");

	}
}
