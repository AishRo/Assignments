package assignment7ConditionalStatements;

public class LoanApprovalProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int creditScrore =655;
		int income =50000;
		double dtiRatio = 35.0;
		String employmentStatus = "Employed";
		
		if(creditScrore>750) {
			System.out.println( "The loan is automatically approved.");
		}
		else if(creditScrore >= 650 & creditScrore<=750) {
			if(income >= 50000) {
				if(employmentStatus == "Employed") {
					if(dtiRatio<40.0) {
						System.out.println("The loan is approved.");
					}else {
						System.out.println("The loan is denied.");
					}
				}
				else {
					System.out.println("The loan is denied.");
				}
			}
			else {
				System.out.println("The loan is denied.");
			}
			
		}
		else {
			System.out.println("The loan is denied.");
		}

	}

}
