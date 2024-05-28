import java.util.*;
public class Employee {
    private String firstName;
    private String address;
    private  String  email;
    private  String pesel;
    private  int yearOfEmployment;

    public Employee(String firstName, String address, String email, String pesel, int yearOfEmployment){
        this.firstName = firstName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.yearOfEmployment = yearOfEmployment;
    }
    public int calculateSalary(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearsOfService = currentYear - yearOfEmployment;
        return  3000 + (yearsOfService * 1000);
    }
}

