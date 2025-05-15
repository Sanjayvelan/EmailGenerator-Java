package EmailGeneratorUsingJAVA;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String fName = in.nextLine();

        System.out.print("Enter Last Name: ");
        String lName = in.nextLine();

        System.out.print("Select Department (1-AE, 2-BT, 3-CS, 4-CI, 5-MC, 6-ME, 7-TT, 8-EE, 9-EC, 10-EI, 0-Other): ");
        int deptChoice = in.nextInt();

        System.out.print("Enter Batch (Ex: 2021 -> 21): ");
        int batch = in.nextInt();

        Email em1 = new Email(fName,lName,deptChoice,batch);
        System.out.println(em1.showInfo());
    }
}
