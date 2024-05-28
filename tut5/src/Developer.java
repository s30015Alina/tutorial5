import java.util.*;
public class Developer extends  Employee{
    private ArrayList<Technology> technologies = new ArrayList<>();
    public Developer(String firstName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, address, email, pesel, yearOfEmployment);
    }
    public  void addTechnology(Technology technology){
        technologies.add(technology);
    }
    public int calculateSalary(){
        int baseSalary = super.calculateSalary();
        int bonus = 0;
        for (Technology tech : technologies){
            bonus += tech.getBonus();
        }
        return baseSalary + bonus;
    }
}
