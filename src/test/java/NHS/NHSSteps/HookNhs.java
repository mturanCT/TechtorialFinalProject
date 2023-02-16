package NHS.NHSSteps;

import Utils.DriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;





    public class HookNhs {
        @Before
        public void beforeScenario(){
            System.out.println("it runs before eachScenario");
        }
        @After
        public void afterScenario(){
            DriverHelper.tearDown();
            System.out.println("it runs after eachScenario");
        }
    }


