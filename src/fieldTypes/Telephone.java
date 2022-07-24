package fieldTypes;

public class Telephone {
    public String number;
    public static int quantity;
    public static double total = 15658.92;
    static {
        quantity = 250;
        total = 15658.92;
    }

    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return this.number;
    }

    public static void main(String[] args) {
        Telephone telephone = new Telephone();
        System.out.println(telephone.total);
        telephone.setNumber("123-123-345-45");
        System.out.println("telephone.getNumber() " + telephone.getNumber());

        System.out.println("Telephone.total " + Telephone.total);

    }



}

/*


    Write the definition of a class Telephone.
The class has no constructors, one instance variable of type String called number, and two public static variables.
One is of type int called quantity, initialized to 250;
the other is of type double called total, initialized to 15658.92.
Create getNumber() and setNumber() methods that will manipulate with number instance variable.

 */
