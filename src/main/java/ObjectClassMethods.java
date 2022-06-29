public class ObjectClassMethods {

    public static void main(String[] args) {
        ObjectClassMethods objectClassMethods = new ObjectClassMethods();
        ObjectClassMethods objectClassMethods1 = new ObjectClassMethods();

        String m = new String("Mama");
        String p = new String("Papa");
        String w = "Papa";
        String r = new String("Papa");

        StringBuilder sm = new StringBuilder("Mama");
        StringBuilder sp = new StringBuilder("Papa");

        System.out.println(objectClassMethods.equals(objectClassMethods1));

        System.out.println(objectClassMethods.toString());
        System.out.println(objectClassMethods1.toString());
        System.out.println(objectClassMethods.toString().equals(objectClassMethods1.toString()));

        System.out.println(objectClassMethods.getClass());
        System.out.println(objectClassMethods1.getClass());
        System.out.println(objectClassMethods.getClass().equals(objectClassMethods1.getClass()));

        System.out.println(objectClassMethods.hashCode());
        System.out.println(objectClassMethods1.hashCode());
        System.out.println(objectClassMethods.hashCode()==objectClassMethods1.hashCode());

        System.out.println(p.equals(w));

        System.out.println(sm.equals(sp));

    }
}