//calculate CGPA

import java.util.Scanner;
public class cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject 1");
        float sub1 = sc.nextFloat();
        System.out.println("Enter the marks of subject 2");
        float sub2 = sc.nextFloat();
        System.out.println("Enter the marks of subject 3");
        float sub3 = sc.nextFloat();
        System.out.println("Enter the marks of subject 4");
        float sub4 = sc.nextFloat();
        System.out.println("Enter the marks of subject 5");
        float sub5 = sc.nextFloat();
        System.out.println("Enter the marks of subject 6");
        float sub6 = sc.nextFloat();
         System.out.println("Enter the marks of subject 7");
        float sub7 = sc.nextFloat();
         System.out.println("Enter the marks of subject 8");
        float sub8 = sc.nextFloat();
        System.out.println("Enter the marks of subject 9");
        float sub9 = sc.nextFloat();
        System.out.println("Enter the marks of subject 10");
        float sub10 = sc.nextFloat();
        float no = (sub1 + sub2 + sub3 + sub4 + sub5 +sub6 + sub7 + sub8 +sub9 + sub10) / 100;
        System.out.println("the CGPA is "+ no);
        System.out.println("the percentage is "+ no * 9.5);
        sc.close();
        System.out.println("thank you");

    }
}
