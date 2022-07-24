package fieldTypes;

public class StaticTest {
    public static void main(String[] args) {

        StaticMethods obj = new StaticMethods();

        StaticMethods.displayMessage("Hello fom Static method");
        obj.displayMessage("We are using object to call this static method");
        System.out.println("StaticMethods.count " + StaticMethods.count);
        System.out.println("obj = " + obj.num);
        System.out.println(new StaticMethods().num);


    }
}
