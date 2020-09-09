import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        return (a+b+c) - Math.min(Math.min(a,b),c) - Math.max(Math.max(a,b),c);
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        int x = Math.max(Math.abs(a),Math.abs(b)); // x = 7
        if (x == a){
            return a; 
        }else if (x == -a){
            return a; 
        }else{
            return b; 
        }
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        return Math.sqrt(a*a + b*b); 
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        String medi = "median";
        String magni = "magnitude";
        String pythag = "pythagoras";

        Scanner scan = new Scanner(System.in);
        System.out.println("What command would you like to carry out?");
        String command = scan.nextLine(); 
        if (command.equals(medi) == true){
            System.out.println("What is the first number?");
            int firstnum = scan.nextInt();
            System.out.println("What is the second number?");
            int secondnum = scan.nextInt();
            System.out.println("What is the third number?");
            int thirdnum = scan.nextInt();
            System.out.println("The median is " + median(firstnum, secondnum, thirdnum));
        }else if (command.equals(magni) == true){
            System.out.println("What is the first number?");
            int firstnum = scan.nextInt();
            System.out.println("What is the second number?");
            int secondnum = scan.nextInt();
            System.out.println("The number with the larger absolute value is " + magnitude(firstnum, secondnum));
        }else if (command.equals(pythag) == true){
            System.out.println("What is the first number?");
            int firstnum = scan.nextInt();
            System.out.println("What is the second number?");
            int secondnum = scan.nextInt();
            System.out.println("The c value from the pythagorean theorem is " + pythagoras(firstnum, secondnum));
        }else{
            System.out.println("The command you entered is not valid, please enter a valid command name. ");
        }   
    }
}
