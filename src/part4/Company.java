package part4;
import part2.Employee;

public class Company {
    String title;
    int companyCode;
    Employee employees[];

    Company(String _title, int _companyCode, Employee[] _employees){
        title = _title;
        companyCode = _companyCode;
        employees = _employees;
    }

    public void addEmployee(Employee employee){
        for (int i=0; i<employees.length; i++){
            if(employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }

    public void deleteEmployee(int index){
        for (int i = index; i < employees.length - 1; i++) {
            employees[i] = employees[i + 1];
        }
    }

    public void toStringCompany(){
        System.out.println("Įmonės pavadinimas: " + title);
        System.out.println("Įmonės kodas: " + companyCode);
        System.out.println("");
        System.out.println("Darbuotojai:");
        for (int i=0; i<employees.length; i++){
            if(employees[i] != null) System.out.println(
                    i+1 + " " +employees[i].getName()
                    + " " + employees[i].getSurname()
                    + " " + employees[i].getSalary());

        }
        for (Employee person:employees) {
        }
        System.out.println("");
    }
}
