//package com.hcl.interviews;
//
import static com.hcl.interviews.support.BehaviouralTestEmbedder.aBehaviouralTestRunner;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Test;

///**
// * Acceptance test class that uses the JBehave (Gerkin) syntax for writing stories.  
// * You will notice the TimeConverter has no implementation ... (hint)
// */
public class PanDigitalRomanNumberFixtureTest {

    @Test
    public void panDigitalRomanNumberAcceptanceTests() throws Exception {
       aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("PanDigitalRomanNumber.story")
                .run();
    }

    @When("the input is $input")
    public void whenInputIs(int input) {
        
    }

    @Then("the output will be $")
   public void thenNumberShouldBe(String theExpectedBerlinClockOutput) {
    	
   }
}