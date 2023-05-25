import java.util.EmptyStackException;
import java.util.Scanner;

public class app {
    public static void main(String arg[]) {
        double homeLoan = (4.2/100)/12;
        double carLoan = (3.9/100)/12;
        double goldLoan = (5.2/100)/12;
        double studyLoan = (2.8/100)/12;
        double businessLoan = (5.8/100)/12;
        double monthlyPayment;
        double totalPayment=0;
        double subTotal=0;
        int totalMonths=0;

        System.out.println("RPG LOAN PROVIDERS");
        System.out.println("Loan Type" + "\t\tInterest Rate");
        System.out.println("1. Home Loan" + "\t\t4.2%");
        System.out.println("2. Car Loan" + "\t\t3.9%");
        System.out.println("3. Gold Loan" + "\t\t5.2%");
        System.out.println("4. Study Loan" + "\t\t2.8%");
        System.out.println("5. Business Loan" + "\t5.8%");
        System.out.println("6. Exit");

        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Your Family Income: ");
        double familyIncome = myObj.nextDouble();
        if (familyIncome < 80000) {
            System.out.println("You are not Eligible for Loan from RGP Loan Providers.");
        } else {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the Number of Types of Loan you want?");
            int numberOfLoanTypes = in.nextInt();
            if (numberOfLoanTypes < 2) {
                throw new RuntimeException("2 or More loan types should be selected.");
            }
            for (int i = 0; i < numberOfLoanTypes; i++) {
                System.out.print("Choose the Type of Loan that you Want from our seasonal menu above: ");
                int choice = in.nextInt();
                if (choice == 1) {
                    System.out.print("Enter the Number of Monthly Installments you are going to use: ");
                    int numberOfMonths = in.nextInt();
                    if (numberOfMonths < 6 || numberOfMonths > 60) {
                        throw new RuntimeException("Number of Months not valid.");
                    }
                    System.out.print("Enter the Amount of Loan: ");
                    int amount = in.nextInt();
                    if (amount > 500000) {
                        homeLoan = homeLoan - 0.001;
                    }
                    monthlyPayment=(amount*homeLoan)/(1-Math.pow(1+homeLoan,-numberOfMonths));
                    totalPayment= monthlyPayment*numberOfMonths;
                    subTotal=subTotal+totalPayment;
                    totalMonths+=numberOfMonths;
                    

                } else if (choice == 2) {
                    System.out.print("Enter the Number of Monthly Installments you are going to use: ");
                    int numberOfMonths = in.nextInt();
                    if (numberOfMonths < 6 || numberOfMonths > 60) {
                        throw new RuntimeException("Number of Months not valid.");
                    }
                    System.out.print("Enter the Amount of Loan: ");
                    int amount = in.nextInt();
                    if (amount > 500000) {
                        carLoan = carLoan - 0.001;
                    }
                    monthlyPayment=(amount*carLoan)/(1-Math.pow(1+carLoan,-numberOfMonths));
                    totalPayment= monthlyPayment*numberOfMonths;
                    subTotal=subTotal+totalPayment;
                    totalMonths+=numberOfMonths;

                } else if (choice == 3) {
                    System.out.print("Enter the Number of Monthly Installments you are going to use: ");
                    int numberOfMonths = in.nextInt();
                    if (numberOfMonths < 6 || numberOfMonths > 60) {
                        throw new RuntimeException("Number of Months not valid.");
                    }
                    System.out.print("Enter the Amount of Loan: ");
                    int amount = in.nextInt();
                    if (amount > 500000) {
                        goldLoan = goldLoan - 0.001;
                    }
                    monthlyPayment=(amount*goldLoan)/(1-Math.pow(1+goldLoan,-numberOfMonths));
                    totalPayment= monthlyPayment*numberOfMonths;
                    subTotal=subTotal+totalPayment;
                    totalMonths+=numberOfMonths;

                } else if (choice == 4) {
                    ;
                    System.out.print("Enter the Number of Monthly Installments you are going to use: ");
                    int numberOfMonths = in.nextInt();
                    if (numberOfMonths < 6 || numberOfMonths > 60) {
                        throw new RuntimeException("Number of Months not valid.");
                    }
                    System.out.print("Enter the Amount of Loan: ");
                    int amount = in.nextInt();
                    if (amount > 500000) {
                        studyLoan = studyLoan - 0.001;
                    }
                    monthlyPayment=(amount*studyLoan)/(1-Math.pow(1+studyLoan,-numberOfMonths));
                    totalPayment= monthlyPayment*numberOfMonths;
                    subTotal=subTotal+totalPayment;
                    totalMonths+=numberOfMonths;

                } else if (choice == 5) {
                    System.out.print("Enter the Number of Monthly Installments you are going to use: ");
                    int numberOfMonths = in.nextInt();
                    if (numberOfMonths < 6 || numberOfMonths > 60) {
                        throw new RuntimeException("Number of Months not valid.");
                    }

                    System.out.print("Enter the Amount of Loan: ");
                    int amount = in.nextInt();
                    if (amount > 500000) {
                        businessLoan = businessLoan - 0.001;
                    }
                    monthlyPayment=(amount*businessLoan)/(1-Math.pow(1+businessLoan,-numberOfMonths));
                    totalPayment= monthlyPayment*numberOfMonths;
                    subTotal=subTotal+totalPayment;
                    totalMonths+=numberOfMonths;

                } else if (choice == 6) {
                    break;
                }

            }
        }
        System.out.printf("The Total Amout of Loan to be paid is: %.2f \n",subTotal);
        System.out.printf("The installment amount to be paid every month is %.2f ", subTotal/totalMonths);

    }

}