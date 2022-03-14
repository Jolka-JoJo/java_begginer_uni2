package part4;

import part2.Employee;

import java.util.Scanner;


public class part4Main {

    public static void main(String[] args) {
        Employee person[] = new Employee[10];
        person[0] = new Employee("Jonas", "Jonaitis", 900.00);
        person[1] = new Employee("Petras", "Petraitis", 1000.00);
        person[2] = new Employee("Kazys", "Kaziukas", 800.00);

        Company company = new Company("Įmonė", 123456789, person);


        String[] menu = {
                "0 - Baigti darbą",
                "1 - Išvesti įmonės informaciją",
                "2 - Įtraukti naują darbuotoją",
                "3 - Ištrinti darbuotoją"
        };
        boolean work = true;


        while (work) {
            for (String menuPoint : menu) {
                System.out.println(menuPoint);
            }
            Scanner input = new Scanner(System.in);
            int menuInput = input.nextInt();
            switch (menuInput) {
                case 0: {
                    work = false;
                    break;
                }
                case 1: {
                    company.toStringCompany();
                    break;
                }
                case 2: {
                    System.out.println("Įveskite vardą:");
                    String name = input.next();
                    System.out.println("Įveskite pavardę:");
                    String surname = input.next();
                    System.out.println("Įveskite atlyginimą:");
                    Double salary = input.nextDouble();

                    Employee newPerson = new Employee(name, surname, salary);
                    company.addEmployee(newPerson);

                    company.toStringCompany();
                    break;
                }
                case 3: {
                    System.out.println("Įveskite darbuotojų numerį, kurį norite pašalinti");
                    int index = input.nextInt();
                    company.deleteEmployee(index-1);

                    company.toStringCompany();
                    break;
                }
                default:
                    System.out.println("Įvesta netinkama reikšmė");
                    System.out.println("");
            }

        }

    }
    }

