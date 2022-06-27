import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AmazonSiteHeader extends BasePage {

        AmazonSiteHeader(WebDriver driver){

            super(driver);
        }
        String site = "https://www.amazon.com/";

    public WebElement getToodaysDealsHeader() {
        return driver.findElement(By.xpath("//a[@class='nav-a  ' and @data-csa-c-type='link' and @data-csa-c-slot-id = 'nav_cs_0']"));
    }

    public WebElement getCustomerServiceOnHeader() {
        return driver.findElement(By.xpath("//a[contains(text(),'Customer Service') and @class = 'nav-a  ']"));
    }

    public WebElement getRegistryOnHeader() {
        return driver.findElement(By.xpath("//a[contains(text(),'Registry') and @class = 'nav-a  ']"));
    }

    public WebElement getGiftCardsOnHeader() {
        return driver.findElement(By.xpath("//a[contains(text(),'Gift Cards') and @class = 'nav-a  ']"));
    }

    public WebElement getSellOnHeader() {
        return driver.findElement(By.xpath("//a[contains(text(),'Sell') and @class = 'nav-a  ']"));
    }
    public List<WebElement> getNoChangasYourAdressBtn(){
        return driver.findElements(By.xpath("//span[@class='a-button a-spacing-top-base a-button-base glow-toaster-button glow-toaster-button-dismiss']"));
    }
}
