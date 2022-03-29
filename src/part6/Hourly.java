package part6;

public class Hourly extends Employee{

    int hoursWorked;
    double rate;

    Hourly(String _name, String _surname, String _phone, int _socInsuranceNr, int _hoursWorked, double _rate) {
        super(_name, _surname, _phone, _socInsuranceNr);
        hoursWorked = _hoursWorked;
        rate = _rate;
    }

    void addHours(int hours){
        hoursWorked+=hours;
    }

    @Override
    public double pay() {
        double pay = rate * hoursWorked;
        hoursWorked = 0;
        return pay;
    }
}
