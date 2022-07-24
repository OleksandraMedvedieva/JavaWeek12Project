package fieldTypes;

public class StaticMethods {
    public int num =10;
    public static int count= 6;
    public static void displayMessage (String message){
        System.out.println("message = " + message);
        System.out.println("count = " + count);
    }

    public void instanceMethod(){
        System.out.println("Instance Method Called");
        System.out.println("num = " + num);
        System.out.println("count = " + count);
        displayMessage(" Hello from instance method ");
    }


}
