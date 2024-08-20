package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.WebTablesPage;
import modals.AddRecordModal;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.visible;

public class AddRecordTest {

    private WebTablesPage webTablesPage;
    private AddRecordModal addRecordModal;

    @BeforeClass
    public void setUp() {
        open("https://demoqa.com/webtables");
        webTablesPage = new WebTablesPage();
    }

    @Test
    public void testAddAndEditRecord() {
        addRecordModal = webTablesPage.clickAddButton();

        addRecordModal.addRecord("Bariscan", "TEMEL", "bariscan.temel@gmail.com", "37", "10000", "IT");
        addRecordModal.getAddedRecord("Bariscan").shouldBe(visible);

        addRecordModal.editRecord("Bariscan", "Baris");
        addRecordModal.getEditedRecord("Baris").shouldBe(visible);
    }
}
