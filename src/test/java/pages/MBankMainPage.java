package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.stream.Collectors;

public class MBankMainPage extends Page {

    @FindBy(xpath = "//ul[@class = 'menu']/li/div/a")
    private List<WebElement> menuCharts;

    public void clickThroughMenu() {
        for (int i = 0; i < menuCharts.size(); i++) {
            wait.until(ExpectedConditions.elementToBeClickable(menuCharts.get(i))).click();
        }
    }

    public List<String> menuChartsTexts() {
        return menuCharts.stream().map(e -> e.getText()).collect(Collectors.toList());
    }

}
