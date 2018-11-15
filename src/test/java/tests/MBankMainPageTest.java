package tests;

import core.SetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MBankMainPage;

import java.util.List;

import static java.util.Arrays.asList;

public class MBankMainPageTest extends SetUp {

    private MBankMainPage mBankMainPage;
    private List<String> expectedList = asList("mama", "tata", "dziecko"); // Lista niewłaściwa test się wyłoży :)

    @BeforeClass
    private void run() {
        mBankMainPage = openMBankMainPage();
    }

    @Test
    private void checkFirstLineMenu() {
        mBankMainPage.clickThroughMenu();
        Assertions.assertThat(mBankMainPage.menuChartsTexts()).isEqualTo(expectedList);
    }
}
