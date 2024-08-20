package modals;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddRecordModal {

    private SelenideElement firstNameInput = $(By.xpath("//*[@id='firstName']"));
    private SelenideElement lastNameInput = $(By.xpath("//*[@id='lastName']"));
    private SelenideElement emailInput = $(By.xpath("//*[@id='userEmail']"));
    private SelenideElement ageInput = $(By.xpath("//*[@id='age']"));
    private SelenideElement salaryInput = $(By.xpath("//*[@id='salary']"));
    private SelenideElement departmentInput = $(By.xpath("//*[@id='department']"));
    private SelenideElement submitButton = $(By.xpath("//*[@id='submit']"));

    public void addRecord(String firstName, String lastName, String email, String age, String salary, String department) {
        firstNameInput.setValue(firstName);
        lastNameInput.setValue(lastName);
        emailInput.setValue(email);
        ageInput.setValue(age);
        salaryInput.setValue(salary);
        departmentInput.setValue(department);
        submitButton.click();
    }

    public void editRecord(String firstName, String newFirstName) {
        SelenideElement editButton = $(By.xpath("//div[contains(@class, 'rt-tr-group')]//div[text()='" + firstName + "']//following-sibling::div//span[@title='Edit']"));
        editButton.click();
        firstNameInput.clear();
        firstNameInput.setValue(newFirstName);
        submitButton.click();
    }

    // Bu metotların assert'ları test sınıfına taşındı, burada sadece element varlığını döndürüyoruz
    public SelenideElement getAddedRecord(String expectedFirstName) {
        return $(By.xpath("//div[contains(@class, 'rt-tr-group')]//div[text()='" + expectedFirstName + "']"));
    }

    public SelenideElement getEditedRecord(String newFirstName) {
        return $(By.xpath("//div[contains(@class, 'rt-tr-group')]//div[text()='" + newFirstName + "']"));
    }
}
