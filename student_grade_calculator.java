import java.util.Scanner;

public class student_grade_calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Student Name : ");
        String name = scan.nextLine();
        System.out.println("Enter The Subject Length.");
        int n = scan.nextInt();
        int num[] = new int[n];
        String str[] = new String[n];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter The Subject Name : ");
            scan.nextLine();
            str[i] = scan.nextLine();
            System.out.println("Enter The Subject Mark : ");
            num[i] = scan.nextInt();
            if(num[i]<=100)
            {
            	
            }
            else {
            	System.out.println("Invalid mark Enter Again.");
            	num[i] = scan.nextInt();
            }
        }

        int totalMark = 0;
        int i =0;
        
        System.out.println("Student " + name + " Marks Are :");
        
        for (i = 0; i < num.length; i++) {
            System.out.print("Subject : ");
            System.out.print(str[i] +  " : " + num[i]);
            System.out.println();

            totalMark += num[i];

            if(num[i] < 50)
            {
                System.out.println("Fail");
            }
            else if (num[i] < 60) {
                System.out.println("C Grade");
            }
            else if (num[i] < 70) {
                System.out.println("B Grade");
            }
            else if (num[i] < 80) {
                System.out.println("A Grade");
            }
            else if (num[i] < 90) {
                System.out.println("A+ Grade");
            }
            else if (num[i] <= 100) {
                System.out.println("O Grade");
            }
            else{
                System.out.println("Invalid Marks Please Check It.");
            }
        }   

        float percentage = totalMark/num.length;

        System.out.println("Total Mark Of The Student Is : " + totalMark);
        System.out.println("The Average percentage Of the Student Is : " + percentage + "%");
    }
}
