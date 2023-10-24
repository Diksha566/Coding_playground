import java.util.Scanner;

public class Bitwise_OR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int n1 = sc.nextInt(); //ex- 4 binary 100
        System.out.println("enter the second number");
        int n2 = sc.nextInt(); // ex- 5 binary 101
        System.out.println( n1 | n2); // OR means + add koi bhi eak one toh one 
    }
    
}
