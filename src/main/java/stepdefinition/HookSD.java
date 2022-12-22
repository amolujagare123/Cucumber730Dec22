package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookSD {

    @Before ("@blank")
    public void beforeMyScenario()
    {
        System.out.println("*********** before blank Scenario");
    }

    @After ("@blank")
    public void afterMyScenario()
    {
        System.out.println("*********** after blank Scenario");
    }

    @Before ("@invalid")
    public void beforeMyScenario2()
    {
        System.out.println("*********** before @invalid Scenario");
    }

    @After ("@invalid")
    public void afterMyScenario2()
    {
        System.out.println("*********** after @invalid Scenario");
    }
}
