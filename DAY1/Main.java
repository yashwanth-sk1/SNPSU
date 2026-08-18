package Project_Java;

import java.util.Scanner;

public class Main {

    static String name;
    static String designation;
    static int age;
    static double salary;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("Create");
            System.out.println("Display");
            System.out.println("Display Salary");
            System.out.println("Exit");

            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter name ");
                    name = sc.next();
                    System.out.print("Enter age ");
                    age = sc.nextInt();
                    System.out.print("Enter designation ");
                    designation = sc.next();
                    System.out.print("Enter salary ");
                    salary = sc.nextDouble();
                    System.out.println("Employee created successfully!");
                    break;
                    
                case 2:
                    System.out.println("Name " + name);
                    System.out.println("Age " + age);
                    System.out.println("Designation " + designation);
                    break;

                case 3:
                    System.out.println("Salary " + salary);
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid");
            }

        } while (ch != 4);

        sc.close();
    }
}