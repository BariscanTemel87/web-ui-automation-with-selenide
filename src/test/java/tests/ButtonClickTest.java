package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class ButtonClickTest {

    @BeforeClass
    public void setUp() {
        open("https://demoqa.com/elements");
    }

    @Test
    public void testButtonClick() {
        ElementsPage elementsPage = new ElementsPage();
        ButtonsPage buttonsPage = elementsPage.goToButtonsSection();
        buttonsPage.clickClickMeButton()
                .verifyClickMeMessage();
    }
}
