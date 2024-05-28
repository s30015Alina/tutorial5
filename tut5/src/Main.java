import  java.util.*;
public class Main {
    public static void main(String[] args) {
       ArrayList<Employee> employees = new ArrayList<>();
       Developer dev = new Developer("John", "New York", "john@doe.com", "123456789", 2020);
       Technology t = new Technology("Java", 800);
       dev.addTechnology(t);
       employees.add(dev);
       Tester tester = new Tester("Jane", "Los Angeles", "jane@smith.com", "987654321", 2021);
       tester.addTestTypes("UI/UX");
       employees.add(tester);

       Manager manager = new Manager("Bob", "Chicago", "bob@johnson.com", "1122334455", 2019);
       Goal g = new Goal("Implementing FB Login", 2024, 5, 15, 1000);
       manager.addGoal(g);
       employees.add(manager);

       int totalAmount = 0;
           for (Employee employee: employees){
               totalAmount += employee.calculateSalary();
           }
           System.out.println("Total amount to be paid this month" + totalAmount+ "USD");
       }
    }
