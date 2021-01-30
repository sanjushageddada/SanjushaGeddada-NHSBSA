package steps;


import cucumber.api.java8.En;
import pages.Page;

public class StepDefs extends Page implements En {

    public StepDefs() {

        Given("^I go to url (.*)$", this::getUrl);
        When("^the user clicks on the Start button$", this::setStartButton);
        And("^the user select the Country as Wales and click on the next button$", this::setCountryButton);
        And("^The user enter valid date of birth as '(.*) (.*) (.*)'$", this::getDateofBirth);
        And("^The user Select live with a partner option as Yes and click on next button$", this::getPartnerOption);
        And("^The user select claim any benefits or tax credits option as No and click on next button$", this::getPartnerClaimOption);
        And("^The user selects pregnancy option as No and click on next option$", this::getPragnencyOption);
        And("^The user Selects Illness caused by serving in armed forces as No and click on Next$", this::getIllnessOption);
        And("^The user Selects Having Diabetes option as No and Click on Next Button$", this::getDaiabetesOption);
        And("^The user Selects Having Glaucoma option as No and click on Next Button$", this::getGlaucomaOption);
        And("^The user select they Live in Care Homes Permanently option as No$", this::getCareHomeOption);
        And("^The user Selects Savings investments option as No and click on Next Button$", this::getSavingsOption);
        Then("^Should get help from the NHS costs ' You get help with NHS costs '$", this::gettitle);


    }

}
