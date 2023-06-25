package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.api.restassured.petstoreRestAssuredAction;

public class PetstoreApiSteps {

	petstoreRestAssuredAction PetstoreRestAssuredActionsObj = new petstoreRestAssuredAction();
	
	@Given("Create pet")
	public void create_pet() throws Throwable {
		PetstoreRestAssuredActionsObj.createPet();
	    
	}

	@Given("Get pet")
	public void get_pet() throws Throwable {
		PetstoreRestAssuredActionsObj.getPet();
	}

	@When("Update pet")
	public void update_pet() throws Throwable {
		PetstoreRestAssuredActionsObj.updatePet();
	}

	@When("Delete pet")
	public void delete_pet() throws Throwable {
		PetstoreRestAssuredActionsObj.deletePet();
	}

}
