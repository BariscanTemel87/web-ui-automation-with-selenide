package tests;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ElementsPage {

    private SelenideElement buttonsSection = $(By.xpath("//*[@id='item-4']//span"));

    public ButtonsPage goToButtonsSection() {
        buttonsSection.click();
        return page(ButtonsPage.class);
    }
}
