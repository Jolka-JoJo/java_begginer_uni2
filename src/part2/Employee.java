package part2;

public class Employee {
    private String name;
    private String surname;
    private Double salary;

    Employee(){ }

    Employee(String _name, String _surname, Double _salary){
        name = _name;
        surname = _surname;
        salary = _salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public Double getSalary(){
        return salary;
    }

    public Double incomeTax(){
        return salary * 0.15;
    }

    public Double sodraTax(){
        return salary * 0.09;
    }
}
