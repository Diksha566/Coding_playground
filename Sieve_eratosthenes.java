//Problem Description: Given a number n, print all primes smaller than or equal to n. 
//It is also given that n is a small number.
import java.util.Scanner;

public class Sieve_eratosthenes{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        System.out.print("prime factors of "+ n + " is: ");

      

        for(int i =2; i<=n;i++){

             
        if(i%2==0){
            //not prime 
            //System.out.println("not prime");
        }

        if(i%3==0){
            // not prime
          //  System.out.println("not prime");
        }

        

        while(n%i==0){
          //  System.out.println("prime");
            System.out.print(i+ " ");
            n=n/i;
        }

        }
       


    }

}

//O(n)