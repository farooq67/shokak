package JavaJourneyPackage;

public class AccountHolderObjects {
	public static void main(String[] args) {
		
		AccountHolder firstperson = new AccountHolder();
		AccountHolder secondperson = new AccountHolder();
		AccountHolder thirdperson = new AccountHolder();
		
		firstperson.firstName = "Farooq";
		firstperson.lastName = "Khan";
		firstperson.age = 50;
		firstperson.accountbalance = 10000;
	
		firstperson.creditcardeligibilty();
		System.out.println("firstperson is eligble? " + firstperson.eligblecreaditcard);
		
	}

}
