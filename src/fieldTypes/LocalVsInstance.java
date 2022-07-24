package fieldTypes;

public class LocalVsInstance {
    public int a = 10;
    
    public void showDifference(){
        int a = 5;
        System.out.println("a = " + a);
    }

    public void showDifference(int number){
        int a = number;
        System.out.println(a);
    }

    public static void main(String[] args) {
        LocalVsInstance obj = new LocalVsInstance();
        System.out.println("---coming for a method: local ---");
        obj.showDifference();

        System.out.println("---coming from instance variable -----");
        System.out.println(obj.a);

        obj.a = 1;

        System.out.println(obj.a);

        obj.showDifference(8);

    }
    
}
