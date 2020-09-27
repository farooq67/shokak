package JavaJourneyPackage;

public class AccountHolder {

	String firstName;
	String lastName;
	int age;
	float accountbalance;
	boolean eligblecreaditcard;
		

	public void creditcardeligibilty() {
		
		if (age>25 && accountbalance>=20000) {
			eligblecreaditcard=true;
			
		
		}
			
	}
}

