package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class xyzBankHomePage {
    public xyzBankHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[.='Bank Manager Login']")
    public WebElement bankManagerLoginButon;

    @FindBy(xpath = "//button[.='Customer Login']")
    public WebElement customerLoginButton;
}
