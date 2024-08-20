package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static java.time.Duration.ofSeconds;

public class ButtonsPage {

    private SelenideElement clickMeButton = $(By.xpath("(//*[@class='btn btn-primary'])[3]"));
    private SelenideElement dynamicClickMessage = $(By.xpath("//p[@id='dynamicClickMessage']"));

    public ButtonsPage clickClickMeButton() {
        clickMeButton.shouldBe(visible, ofSeconds(5)).click();
        return this;
    }

    // Assert işlemi test sınıfında yapılacak
    public SelenideElement getClickMeMessageElement() {
        return dynamicClickMessage;
    }
}
