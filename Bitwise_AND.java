import java.util.Scanner;

public class Bitwise_AND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int n1 = sc.nextInt(); // ex- n1 =3 in binary its 101
        System.out.println("enter the second number");
        int n2 = sc.nextInt(); // ex- n2 =6 in binary its = 110

        System.out.println(n1 & n2); // this AND jaha dono mein 1 tabh hi 1 hoga -its like A.B

    }
}
