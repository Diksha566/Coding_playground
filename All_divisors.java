//Problem Description: We are given a number n. The task is to print all the divisors of n. 

import java.util.Scanner;

public class All_divisors{
          public static void main(String args[]){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("eneter the number");
                    int n = sc.nextInt();
                    if(n<=1) //if the number entered is less or equal to one print 1
                    System.out.println("1");
                    System.out.print("Factors of entred number is");
                    for(int i=2; i<=n; i++){ // int=2, condition check--run inner statnment till n 
                              if(n%i==0){
                                        System.out.print(+ i + " ");
                              }
                    }
                     
          }
}