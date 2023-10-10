//Problem Description: We are given two numbers. The task is to find the GCD / HCF of the numbers.
//approach:- largest num jo dono ko divide kare completely. if we take a=100, b=200 then gcd can never be greater than 100(dono ko divide kerna chahiye na!) 
// mymistake -- MM
import java.util.Scanner;

public class GCD_of_two {
          public static void main(String args[]){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("enter first number");
                    int num1 = sc.nextInt();
                    System.out.println("enter second number");
                    int num2 = sc.nextInt();

                    System.out.println(gcd(num1, num2));

          }

          public static int gcd(int num1, int num2){
                    int result = Math.min(num1, num2); // cal min of two
                    while(result>0){ // MM  while(num!=0)... chal nhi raha tha loop                    
                    if(num1%result==0 && num2%result==0){  // dono ko divide kerna chahiye na
                              // MM mistake lol result%num1==0 && result%num2==0
                              System.out.print("gcd of two number is ");// if that min divides both return result
                              return result;
                    }

                    result--; // dec 1 from that reult

                    }
                   

                    return -1;
          }
    
}

// O(min(mun1,num2))
