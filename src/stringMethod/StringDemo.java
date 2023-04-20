package stringMethod;

public class StringDemo {

	String cityName;
	int i;

	String[] cityNames = { "Toronto", "Ottawa", "Brampton", "Hamilton", "London", "Mississauga", "Burlington",
			"Kingston", "kitchener" };
	private CharSequence fun;

	String doesStringContainGivencity(String cityToCheck) {
		String cityFound = null;
		int count = 0;

		for (int i = 0; i < cityNames.length; i++) {

			if (cityNames[i].contains(cityToCheck)) {
				cityFound = cityNames[i];

				count += 1;

			}
		}
		if (count == 1) {
			cityFound = cityToCheck;
		} else {
			cityFound = "city not found";

		}
		return cityFound;

	}

	void checkCitiesEndingwithTon() {
		for (i = 0; i < cityNames.length; i++) {
			if (cityNames[i].contains("ton")) {
				System.out.println(cityNames[i]);

			}

		}
	}

	void replaceTonWithFunInTheseCityNames() {
		for (int i = 0; i < cityNames.length; i++) {
			
			
			//if (cityNames[i].replace(cityName, fun) != "null" {
				
				//System.out.println("replaceTonWithFun" + cityNames[i]);

			}
		}
	}


