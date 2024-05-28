import java.util.*;
public class Manager extends Employee{
    private  ArrayList<Goal>goals = new ArrayList<>();
    public Manager(String firstName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, address, email, pesel, yearOfEmployment);
    }
    public  void addGoal(Goal goal){
        goals.add(goal);
    }
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        int bonus = 0;
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        int currentMonth = calendar.get(Calendar.MONTH);
        int currentYear = calendar.get(Calendar.YEAR);

        for (Goal goal: goals){
            calendar.setTime(goal.getDate());
            int goalMonth = calendar.get(Calendar.MONTH);
            int goalYear = calendar.get(Calendar.YEAR);
            if (goalMonth == currentMonth && goalYear == currentYear){
                bonus += goal.getBonus();
            }
        }
        return baseSalary + bonus;
        }
    }

