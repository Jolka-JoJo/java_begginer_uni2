package part6;

public class Employee extends StaffMember{
    int socInsuranceNr;
    double salary;

    Employee(String _name, String _surname, String _phone, int _socInsuranceNr, double _salary) {
        super(_name, _surname, _phone);
        socInsuranceNr = _socInsuranceNr;
        salary = _salary;
    }

    Employee(String _name, String _surname, String _phone, int _socInsuranceNr) {
        super(_name, _surname, _phone);
        socInsuranceNr = _socInsuranceNr;
    }

    @Override
    public double pay() {
        return salary;
    }
}
