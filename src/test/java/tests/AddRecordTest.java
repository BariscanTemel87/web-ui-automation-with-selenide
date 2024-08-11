package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class AddRecordTest {

    @BeforeClass
    public void setUp() {
        open("https://demoqa.com/webtables");
    }

    @Test
    public void testAddAndEditRecord() {

        WebTablesPage webTablesPage = new WebTablesPage();
        AddRecordPage addRecordPage = webTablesPage.clickAddButton();

        addRecordPage.addRecord("Bariscan", "TEMEL", "bariscan.temel@gmail.com", "37", "10000", "IT");
        addRecordPage.verifyRecordAdded("Bariscan");

        addRecordPage.editRecord("Bariscan", "Baris");
        addRecordPage.verifyRecordEdited("Baris");
    }
}
