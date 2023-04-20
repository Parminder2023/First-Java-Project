package stringMethod;


public class StringDemo {

	String cityName;
	int i;

	String[] cityNames = { "Toronto", "Ottawa", "Brampton", "Hamilton", "London", "Mississauga", "Burlington",
			"Kingston", "kitchener" };
	

	int doesStringContainGivencity(String cityToCheck) {
		int count = 0;
		for (int i = 0; i < cityNames.length; i++) {
			if (cityNames[i].contains(cityToCheck)) {
				count += 1;
			}
		}
		return count;
	}

	void checkCitiesEndingwithTon() {
		for (i = 0; i < cityNames.length; i++) {
			if (cityNames[i].contains("ton")) {
				System.out.println(cityNames[i]);

			}

		}
	}

	void replaceTonWithFunInTheseCityNames() {
		for(int i = 0; i< cityNames.length; i++) {
			if(cityNames[i].contains("ton")){
				String replacedString = cityNames[i].replace("ton","fun");
				System.out.println("Replaced City Names: " +replacedString);
			}
		}
	}
	
	void splitAddress()
	{
		String address = "100 Queen Street, Toronto, M5V 3E3";
	    String[] splitAddress = address.split(",");
	    for (int i = 0; i<splitAddress.length; i++) {
	    	if(i==0) {
	    		System.out.println("Street Address: "+splitAddress[i]);
	    	}
	    	else if (i == 1) {
	    		System.out.println("City: "+splitAddress[i]);
	    	}
	    	else {
	    		System.out.println("Zip: "+splitAddress[i]);
	    	}
	    	
	    }
	}

	
		
	}
		
	


