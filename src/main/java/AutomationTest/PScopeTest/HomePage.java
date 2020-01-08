package AutomationTest.PScopeTest;

import static AutomationTest.PScopeTest.LoadProp.getproperty;

public class HomePage extends BasePage {

    public static void homePage() {
        driver.get(getproperty("url"));
    }
}
