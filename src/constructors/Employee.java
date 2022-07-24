package constructors;

public class Employee {

    public String name;
    public String jobTitle;
    public int ID;
    public double salary;
    public static String companyName;

    static {
        companyName = "Microsoft";
    }

    public Employee() {
        salary = 10000;
    }
    public Employee(String name, String jobTitle, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary= $" + salary +
                '}';
    }
}

/*
``Task 1:
Employee:
    attribute/fields/variables
name, jobTitle, ID, salary

    add a constructor to initialize all the fields
    add a default constructor with no fields

    toString() method will rint out the fields
 */
