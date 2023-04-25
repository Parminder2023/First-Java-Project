package week5Assignment;

import java.util.Scanner;

public class GuessTheStudent {

	// words: 
	// points: 5
	// Input: x
	//points : o o o

	String[] studentNames = { "aleena", "angel", "asha", "clemin", "gopesh", "hamneet", "jimna", "jobin", "jude",
			"kamaldeep", "manpreet k", "manpreet s", "mariya", "namitha", "neelam", "nisha", "parminder", "rajat",
			"rojy", "sojan", "sucharita", "vinduja" };

	String randomWords = studentNames[(int) (Math.random() * studentNames.length)];
	char[] letters = new char[randomWords.length()];

	Scanner sc = new Scanner(System.in);

	void GuessNameOfStudent() {

		for (int i = 0; i < letters.length; i++) {
			letters[i] = '_';
		}
		System.out.print("The word has " + randomWords.length() + " letters. ");
		int points = 5;

		while (points > 0 ) {
			System.out.print("points: ");
			for (int i = 0; i < points; i++) {

				System.out.print("o");
				

				break;
			}
			 System.out.println();
			System.out.print("Guess a letter: ");

			String GuessALetter = sc.nextLine();

			char letter = GuessALetter.charAt(0);
			boolean isGuessCorrect = false;
			for (int count = 0; count < randomWords.length(); count++) {
				char l = randomWords.charAt(count);
				if (l == letter) {
					letters[count] = l;
					isGuessCorrect = true;
				}
			}
			if (!isGuessCorrect) {
				points = points - 1;
			}
			

			boolean isGameFinished = true;

		
			for (int i = 0; i < letters.length; i++) {
				if (letters[i] == '_') {
					isGameFinished = false;
				}

				System.out.print(letters[i]);
			}
			{
				System.out.println();
				if (isGameFinished) {
					System.out.println("you win!");
					System.out.println("you have guessed " + randomWords + " correctly");
					break;

				}
			}
			if (points == 0) {
				System.out.println("you lost! the word was:" + randomWords);

				System.out.println("Game over");

			}

		}
	}
}
