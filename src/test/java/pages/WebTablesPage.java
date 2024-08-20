package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import modals.AddRecordModal;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class WebTablesPage {

    private SelenideElement addButton = $(By.xpath("//button[@id='addNewRecordButton']"));

    public AddRecordModal clickAddButton() {
        addButton.click();
        return page(AddRecordModal.class);
    }
}
