package utils;

import org.openqa.selenium.Capabilities;

public class CapabilityFactory {

    private Capabilities capabilities;

    public Capabilities getCapabilities(String browser) {
        if (browser.equals("firefox")) {
            capabilities = OptionManager.getFirefoxOptions();
        } else {
            capabilities = OptionManager.getChromeOptions();
        }
        return capabilities;
    }
}
