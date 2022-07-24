package constructors;

import java.util.ArrayList;

public class Microsoft {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.salary = 120000;
        employee1.name = "Ersin";
        employee1.ID = 12345;
        employee1.jobTitle = "Technical Manager";
        System.out.println(employee1);

        Employee employee2 = new Employee("Efe", "QA Lead", 200, 110000);

        ArrayList<Employee> team = new ArrayList<>();
        team.add(employee1);
        team.add(employee2);
        team.add(new Employee("Jamal", "SDET", 300, 95000));

        double maxSalary =Double.MIN_VALUE;
        for (Employee each : team) {
            if (each.salary > maxSalary){
                maxSalary = each.salary;
            }
        }
        System.out.println("maxSalary = " + maxSalary);

        for (Employee each : team) {
            if (each.name.equalsIgnoreCase("jamal")){
                System.out.println(each.jobTitle);
            }
        }

        //employee1.companyName = "Tesla";
        Employee.companyName = "Tesla";

        for (Employee each : team) {
            System.out.println(each.name + " is working for " + each.companyName);
        }



    }
}
