import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testByAmazon extends TestInit {

    public AmazonSiteHeader amazonSiteHeader;

    @BeforeMethod
    public void getHeaderSideOfSite() {
        amazonSiteHeader = new AmazonSiteHeader(driver);
        driver.get(amazonSiteHeader.site);
        sleep(2);
        if (amazonSiteHeader.getNoChangasYourAdressBtn().size() > 0) {
            amazonSiteHeader.getNoChangasYourAdressBtn().get(0).click();
        }
    }

    @Test
    public void todaysDealsOnHeaderTest(){
        amazonSiteHeader.getToodaysDealsHeader().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb"));
    }

    @Test
    public void customerServiceOnHeaderTest(){
        amazonSiteHeader.getCustomerServiceOnHeader().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_customerservice"));
    }

    @Test
    public void registyOnHeaderTest(){
        amazonSiteHeader.getRegistryOnHeader().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/registries?ref_=nav_cs_registry"));
    }

    @Test
    public void giftCardsOnHeaderTest(){
        amazonSiteHeader.getGiftCardsOnHeader().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc"));
    }

    @Test
    public void sellOnHeaderTest(){
        amazonSiteHeader.getSellOnHeader().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/b/?_encoding=UTF8&ld=AZUSSOA-sell&node=12766669011&ref_=nav_cs_sell"));
    }
}
