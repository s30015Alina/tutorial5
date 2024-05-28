import java.util.*;
public class Tester extends Employee{
    private ArrayList<String>testTypes = new ArrayList<>();
    public Tester(String firstName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, address, email, pesel, yearOfEmployment);
    }
    public void addTestTypes(String  testType){
        testTypes.add(testType);
    }
    public int calculateSalary(){
        int baseSalary = super.calculateSalary();
        int bonus = testTypes.size() * 300;
        return  baseSalary + bonus;
    }
}
