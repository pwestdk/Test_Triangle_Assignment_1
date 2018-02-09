package test_triangle_assignment_1;

import java.util.Scanner;

/*

Assignment description

• Step 1: Design test cases (on paper) for both successful and unsuccessful scenarios
• Step 2: Design and implement the Triangle program in aprogramming language (e.g. Java or C#)
– you don’t have to write unit tests, but you may do so 
– No need for nice GUI, just console app is fine

•Bring the code next time
• Have an IDE installed on your computer
• Read Black chap. 3

 */
public class Test_Triangle_Assignment_1 {

    // Fields
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Welcome print
        System.out.println("***************************************");
        System.out.println("*** Welcome to the Triangle program ***");
        System.out.println("***************************************");

        // Input values for triangle
        System.out.print("Input value: A - ");
        int a = sc.nextInt();
        System.out.print("Input value: B - ");
        int b = sc.nextInt();
        System.out.print("Input value: C - ");
        int c = sc.nextInt();
        
        if (a <= 0 || b <= 0 || c <= 0 || a + b < c || a + c < b || b + c < a) {
            System.out.println("Not a T1riangle");
        } else if (a == b && a == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b && a != c || b == c && b != a || a == c && a != b) {
            System.out.println("Isosceles Triangle");
        } else if (a != b && b != c){
            System.out.println("Scalene Triangle");
        } 
    }
}