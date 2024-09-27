package session07.Bai5;

public class PartTimeEmployee extends Employee {
    private int workingHours;
    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        return workingHours * paymentPerHour;
    }
}
