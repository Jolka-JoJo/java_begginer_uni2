package part6;

public class Executive extends Employee{
    double bonus = 0;

    Executive(String _name, String _surname, String _phone, int _socInsuranceNr, double _salary, double bonus) {
        super(_name, _surname, _phone, _socInsuranceNr, _salary);
        awardBonus(bonus);
    }

    void awardBonus(double bonus){
        this.bonus+=bonus;
    }

    @Override
    public double pay() {
        double paid = salary + bonus;
        bonus = 0;
        return paid;
    }
}
