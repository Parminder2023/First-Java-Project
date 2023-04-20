package stringMethod;

import java.util.Scanner;

public class StringDemoMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StringDemo stringDemo = new StringDemo();
		System.out.println("enter name of city");
		String cityTosearch = sc.nextLine();

		int cityFound = stringDemo.doesStringContainGivencity(cityTosearch);
		if (cityFound>0) {
			System.out.println("city found as " + cityTosearch);
		} else {
			System.out.println("city not found");

		}
		System.out.println("cities ending with ton are");
		stringDemo.checkCitiesEndingwithTon();

		stringDemo.replaceTonWithFunInTheseCityNames();
		
		stringDemo.splitAddress();
		
	}
}
