import org.testng.Assert;
import org.testng.annotations.Test;

public class ObjektClassMethodsTests {

    String s = new String("Mama");
    String d = new String("Mama");
    String p = new String("Papa");

    @Test
    public void equalsString1() {
        Assert.assertTrue(s.equals(d));
    }

    @Test
    public void equalsString2() {

        Assert.assertFalse(s.equals(p));
    }

    @Test
    public void equalsHashCodeByString1() {

        Assert.assertFalse(s.hashCode() == (p.hashCode()));
    }

    @Test
    public void equalsHashCodeByString2() {

        Assert.assertTrue(s.hashCode() != (p.hashCode()));
    }
    @Test
    public void equalsHashCodeString3() {
        int hashCode = s.hashCode();

        Assert.assertTrue(s.hashCode() == (hashCode));
    }

    @Test
    public void equalsGetClassString1() {

        Assert.assertTrue(s.getClass().equals(p.getClass()));
    }

    @Test
    public void equelsToString1() {

        Assert.assertFalse(s.toString().equals(p.toString()));
    }
}

