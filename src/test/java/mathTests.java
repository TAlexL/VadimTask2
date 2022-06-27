import PackageDivisionMethods.OverloadsMethodsDivision;
import PackageMultiplaceMethods.OverloadsMethodsMultiplace;
import PackageSummMethods.OverloadsMethodsSumm;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mathTests {

    OverloadsMethodsDivision overloadsMethodsDivision = new OverloadsMethodsDivision();
    OverloadsMethodsMultiplace overloadsMethodsMultiplace = new OverloadsMethodsMultiplace();
    OverloadsMethodsSumm overloadsMethodsSumm = new OverloadsMethodsSumm();

    @Test
    public void testSumm11 () {

        Assert.assertTrue(30 == overloadsMethodsSumm.methodSumm(5, 10, 15));
    }

    @Test
    public void testSumm12 () {

        Assert.assertTrue(60 == overloadsMethodsSumm.methodSumm(10, 20, 30));
    }

    @Test
    public void testSumm21 () {

        Assert.assertEquals(30, overloadsMethodsSumm.methodSumm(5,10,15));
    }

    @Test
    public void testSumm22 () {

        Assert.assertEquals(60, overloadsMethodsSumm.methodSumm(10,20,30));
    }

    @Test
    public void testSumm31 () {

        Assert.assertFalse(50 == overloadsMethodsSumm.methodSumm(5, 10, 15));
    }

    @Test
    public void testSumm32 () {

        Assert.assertFalse(50 == overloadsMethodsSumm.methodSumm(10, 20,30));
    }

    @Test
    public void testSumm41 () {

        Assert.assertTrue(15 == overloadsMethodsSumm.methodSumm(5, 10));
    }

    @Test
    public void testSumm42 () {

        Assert.assertTrue(30 == overloadsMethodsSumm.methodSumm(10,20));
    }

    @Test
    public void testSumm51 () {

        Assert.assertEquals(15, overloadsMethodsSumm.methodSumm(5,10));
    }
    @Test
    public void testSumm52 () {

        Assert.assertEquals(30, overloadsMethodsSumm.methodSumm(10,20));
    }

    @Test
    public void testSumm61 () {

        Assert.assertFalse(50 == overloadsMethodsSumm.methodSumm(5, 10));
    }
    @Test
    public void testSumm62 () {

        Assert.assertFalse(50 == overloadsMethodsSumm.methodSumm(10,20));
    }

    @Test
    public void testMultiplace11(){

        Assert.assertTrue(750 == overloadsMethodsMultiplace.multiplaceMathods(5, 10,15));
    }

    @Test
    public void testMultiplace12(){

        Assert.assertTrue(6000 == overloadsMethodsMultiplace.multiplaceMathods(10,20,30));
    }

    @Test
    public void testMultiplace21(){

        Assert.assertEquals(750, overloadsMethodsMultiplace.multiplaceMathods(5,10,15));
    }

    @Test
    public void testMultiplace22(){

        Assert.assertEquals(6000, overloadsMethodsMultiplace.multiplaceMathods(10,20,30));
    }

    @Test
    public void testMultiplace31(){

        Assert.assertFalse(1750 == overloadsMethodsMultiplace.multiplaceMathods(5, 10,15));
    }

    @Test
    public void testMultiplace32(){

        Assert.assertFalse(1750 == overloadsMethodsMultiplace.multiplaceMathods(10,20,30));
    }

    @Test
    public void testMultiplace41(){

        Assert.assertTrue(50 == overloadsMethodsMultiplace.multiplaceMathods(5, 10));
    }

    @Test
    public void testMultiplace42(){

        Assert.assertTrue(200 == overloadsMethodsMultiplace.multiplaceMathods(10,20));
    }

    @Test
    public void testMultiplace51(){

        Assert.assertEquals(50, overloadsMethodsMultiplace.multiplaceMathods(5, 10));
    }

    @Test
    public void testMultiplace52(){

        Assert.assertEquals(200, overloadsMethodsMultiplace.multiplaceMathods(10,20));
    }

    @Test

    public void testMultiplace61(){

        Assert.assertFalse(1750 == overloadsMethodsMultiplace.multiplaceMathods(5, 10));
    }

    @Test
    public void testMultiplace62(){

        Assert.assertFalse(1750 == overloadsMethodsMultiplace.multiplaceMathods(10,20));
    }

    @Test
    public void testDivision11(){

        Assert.assertTrue(5 == overloadsMethodsDivision.divisionMethods(50,5,2));
    }

    @Test
    public void testDivision12(){

        Assert.assertTrue(2 == overloadsMethodsDivision.divisionMethods(100,10,5));
    }

    @Test
    public void testDivision21(){

        Assert.assertEquals(5, overloadsMethodsDivision.divisionMethods(50,5,2));
    }

    @Test
    public void testDivision22(){

        Assert.assertEquals(2, overloadsMethodsDivision.divisionMethods(100,10,5));
    }

    @Test
    public void testDivision31(){

        Assert.assertFalse(15 == overloadsMethodsDivision.divisionMethods(50,5,2));
    }

    @Test
    public void testDivision32(){

        Assert.assertFalse(15 == overloadsMethodsDivision.divisionMethods(100,10,5));
    }

    @Test
    public void testDivision41(){

        Assert.assertTrue(10 == overloadsMethodsDivision.divisionMethods(50,5));
    }

    @Test
    public void testDivision42(){

        Assert.assertTrue(10 == overloadsMethodsDivision.divisionMethods(100,10));
    }

    @Test
    public void testDivision51(){

        Assert.assertEquals(10, overloadsMethodsDivision.divisionMethods(50,5));
    }

    @Test
    public void testDivision52(){

        Assert.assertEquals(10, overloadsMethodsDivision.divisionMethods(100,10));
    }

    @Test
    public void testDivision61(){

        Assert.assertFalse(15 == overloadsMethodsDivision.divisionMethods(50,5));
    }

    @Test
    public void testDivision62(){

        Assert.assertFalse(15 == overloadsMethodsDivision.divisionMethods(100,10));
    }
}
