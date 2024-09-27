package session07.Bai5;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public double calculateSalary() {
        return  8 * paymentPerHour;
    }
}
