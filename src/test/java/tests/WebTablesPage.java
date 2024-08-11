package tests;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class WebTablesPage {

    private SelenideElement addButton = $(By.xpath("//button[@id='addNewRecordButton']"));

    public AddRecordPage clickAddButton() {
        addButton.click();
        return page(AddRecordPage.class);
    }
}
