package part6;

public class part6Main {
    public static void main(String[] args) {
        Staff company = new Staff();

        Employee empl1 = new Employee("Jonas", "Jonaitis", "861515515",1234, 1000);
        company.addStaffMember(empl1);

        Employee empl2 = new Employee("Petras", "Petraitis", "861512315",1235, 900);
        company.addStaffMember(empl2);

        Trainee tr = new Trainee("Lukas", "Lukaitis", "861123315");
        company.addStaffMember(tr);

        Executive exe = new Executive("Marytė", "Marytytė", "861233315", 1236, 1100, 150);
        company.addStaffMember(exe);

        Hourly hour1 = new Hourly("Rimas", "Rimaitis","861233515", 1237, 10, 5.5);
        company.addStaffMember(hour1);

        Hourly hour2 = new Hourly("Ona", "Onaitė","861235925", 1238, 20, 5.5);
        company.addStaffMember(hour2);

        System.out.println(company.payDay());

    }
}
