package E2E_Admin;

public class E2E_Admin_Project {

	public static void main(String[] args) throws InterruptedException {
		
		//Browser Instances
		System.setProperty("webdriver.chrome.driver","C:\\Users\\durgasi.jagadish\\Desktop\\Selenium Data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		Driver_Setup setup = new Driver_Setup();
		setup.browserInstance();
		Thread.sleep(5000);
		
		//Login to Salesforce
		Salesforce_Login_Credentials cred = new Salesforce_Login_Credentials();
		cred.loginToSalesforce();
		Thread.sleep(10000);
		
		//Login as ICIS Sales User
		loginAsICIS_SalesUser ICIS_Sales = new loginAsICIS_SalesUser();
		ICIS_Sales.loginAsICISSalesUser();
		ICIS_Sales.createNewLead();
		
		//Create a lead and convert 
		Create_Lead newLead = new Create_Lead();
		Thread.sleep(5000);
		newLead.ICISsearchFilter();
		newLead.enterLeadDetails();
		newLead.BillingAddress();
		newLead.convertLead();
		
		//Logout as ICIS Sales User
		ICIS_Sales.logoutAsICIS_SalesUser();
		
		//Login as Admin User
		Thread.sleep(5000);
		System.out.println("Account link: "+newLead.account_link);
		Driver_Setup.driver.navigate().to(newLead.account_link);
		Thread.sleep(10000);
		
		
		//Verify the Account
		Account account = new Account();
		Thread.sleep(5000);
		account.editAndVerifyAccount();
		
		//Add New Address
		account.accountLocationsList();
		account.setNewAddress();
		account.UnitedStatesAddress();
		
		//Back to Account
		Driver_Setup.driver.navigate().to(newLead.account_link);
		
		
		//Opportunity
		Opportunity opportunity = new Opportunity();
		opportunity.createNewStandardOpportunity();
		opportunity.enterOpportunityDetails();
		opportunity.openOpportunity();
		opportunity.createProposal();
		
		//Proposal
		Proposal proposal = new Proposal();
		proposal.editProposal();
		proposal.soldToContactAndExpectedStartDate();
		
		//Close all instances
		setup.breakDown();
	}

}
