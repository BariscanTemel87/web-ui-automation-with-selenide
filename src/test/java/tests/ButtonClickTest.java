package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.ButtonsPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class ButtonClickTest {

    private ElementsPage elementsPage;
    private ButtonsPage buttonsPage;

    @BeforeClass
    public void setUp() {
        open("https://demoqa.com/elements");
        elementsPage = new ElementsPage();
    }

    @Test
    public void testButtonClick() {
        buttonsPage = elementsPage.goToButtonsSection();
        buttonsPage.clickClickMeButton();

        buttonsPage.getClickMeMessageElement().shouldBe(visible).shouldHave(text("You have done a dynamic click"));
    }
}
