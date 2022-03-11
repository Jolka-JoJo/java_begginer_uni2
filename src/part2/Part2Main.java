package part2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part2Main {

    public static void readFromFile(Employee[] array, Scanner data, int n){

        for (int i=0; i<n; i++) {
            String name = data.next();
            String surname = data.next();
            Double salary = Double.valueOf(data.next());
            Employee person = new Employee(name, surname, salary);
            array[i] = person;
        }

    }

    public static <T>  int lengthFilled(T[] array){
        int count = 0;
        for (T element: array ) {
            if (element != null) count++;
        }
        return  count;
    }

    public static Double averageSalary(Employee [] array, int len){
        Double sum = 0.0;
        for (Employee person: array) {
            if(person != null) sum += person.getSalary();
        }
        return sum/len;
    }

    public static void printEmployeeArrayInfo(Employee[] array, int len){

        Double salary_all = 0.0;
        Double income_tax_all = 0.0;
        Double sodra_tax_all = 0.0;

        System.out.println("Viso įmonėje darbuotojų: " + len);

        for (Employee person: array) {
            if(person != null){
                salary_all += person.getSalary();
                income_tax_all += person.incomeTax();
                sodra_tax_all += person.sodraTax();
            }
        }

        System.out.println("Įmonė sumoka darbo užmokesčius: " + salary_all);
        System.out.println("Sumokėtas pajamų mokestis: " + income_tax_all);
        System.out.println("Sumokėtas sodros mokestis: " + sodra_tax_all);

    }

    public static void main(String[] args) {

        try {
            File file = new File("src/part2/data.txt");
            Scanner data = new Scanner(file);
            int n = data.nextInt();
            Employee list[] = new Employee[n];
            readFromFile (list, data, n);
            data.close();

            for (Employee person:list) {
                if(person != null) System.out.println(person.getName() + " " + person.getSurname() + " " + person.getSalary());
            }

            int len = lengthFilled(list);

            if (len > 0) {
                System.out.println("");
                System.out.println("Vidutinis atlyginimas: " + Math.round(averageSalary(list, len)));
                printEmployeeArrayInfo(list, len);
            } else {

                System.out.println("Nėra darbuotojų");
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Nėra failo");
            e.printStackTrace();
        }

    }
}
