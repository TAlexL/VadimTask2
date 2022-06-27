import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testByAmazon extends TestInit {

    @Test
    public void todaysDealsOnHeaderTest(){
        AmazonSiteHeader amazonSiteHeader = new AmazonSiteHeader(driver);
        driver.get(amazonSiteHeader.site);
        sleep(2);
        if(amazonSiteHeader.getNoChangasYourAdressBtn().size()>0){
            amazonSiteHeader.getNoChangasYourAdressBtn().get(0).click();
        }
        amazonSiteHeader.getToodaysDealsHeader().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb"));
    }

    @Test
    public void customerServiceOnHeaderTest(){
        AmazonSiteHeader amazonSiteHeader = new AmazonSiteHeader(driver);
        driver.get(amazonSiteHeader.site);
        sleep(2);
        if(amazonSiteHeader.getNoChangasYourAdressBtn().size()>0){
            amazonSiteHeader.getNoChangasYourAdressBtn().get(0).click();
        }
        amazonSiteHeader.getCustomerServiceOnHeader().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_customerservice"));
    }

    @Test
    public void registyOnHeaderTest(){
        AmazonSiteHeader amazonSiteHeader = new AmazonSiteHeader(driver);
        driver.get(amazonSiteHeader.site);
        sleep(2);
        if(amazonSiteHeader.getNoChangasYourAdressBtn().size()>0){
            amazonSiteHeader.getNoChangasYourAdressBtn().get(0).click();
        }
        amazonSiteHeader.getRegistryOnHeader().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/registries?ref_=nav_cs_registry"));
    }

    @Test
    public void giftCardsOnHeaderTest(){
        AmazonSiteHeader amazonSiteHeader = new AmazonSiteHeader(driver);
        driver.get(amazonSiteHeader.site);
        sleep(2);
        if(amazonSiteHeader.getNoChangasYourAdressBtn().size()>0){
            amazonSiteHeader.getNoChangasYourAdressBtn().get(0).click();
        }
        amazonSiteHeader.getGiftCardsOnHeader().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc"));
    }

    @Test
    public void sellOnHeaderTest(){
        AmazonSiteHeader amazonSiteHeader = new AmazonSiteHeader(driver);
        driver.get(amazonSiteHeader.site);
        sleep(2);
        if(amazonSiteHeader.getNoChangasYourAdressBtn().size()>0){
            amazonSiteHeader.getNoChangasYourAdressBtn().get(0).click();
        }
        amazonSiteHeader.getSellOnHeader().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/b/?_encoding=UTF8&ld=AZUSSOA-sell&node=12766669011&ref_=nav_cs_sell"));
    }
}
