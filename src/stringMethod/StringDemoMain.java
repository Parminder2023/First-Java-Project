package stringMethod;

import java.util.Scanner;

public class StringDemoMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StringDemo stringDemo = new StringDemo();
		System.out.println("enter name of city");
		String cityTosearch = sc.nextLine();

		String cityFound = stringDemo.doesStringContainGivencity(cityTosearch);
		if (cityFound.equals(cityTosearch)) {
			System.out.println("city found as" + cityFound);
		} else {
			System.out.println("city not found");

		}
		System.out.println("cities ending with ton are");
		stringDemo.checkCitiesEndingwithTon();

		
		System.out.println("replace cities ending with ton to fun ");
		stringDemo.cityName= "endingWithTon";
		stringDemo.replaceTonWithFunInTheseCityNames();
	}

}
