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

    public String toString(){

        String info = "Įmonės pavadinimas: " + title + "\n";
        info = info + "Įmonės kodas: " + companyCode + "\n";
        info = info + "" + "\n";
        info = info +  "Darbuotojai:" + "\n";
        for (int i=0; i<employees.length; i++){
            if(employees[i] != null) {
                int index = i+1;
                info = info + index + " " +employees[i].getName()
                        + " " + employees[i].getSurname()
                        + " " + employees[i].getSalary() + "\n";
            }

        }

        return info;
    }
}
