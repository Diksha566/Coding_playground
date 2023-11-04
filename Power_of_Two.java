//check whether a given number is a power of two or not 
// ex- 1,2,4,8,16,32

//Efficient Approach : Use of Brian Kerningham's Algorithm to check for single occurence of set bit.

// in powers of two we have only one set bit... if 2we unset it we will get the answer
import java.util.Scanner;

public class Power_of_Two {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number"); 
       int num = sc.nextInt();
       System.out.println(Power_of_Two(num));
    }
    
    public static boolean Power_of_Two(int num){
     if(num==0) // zero nhi hoga
     return false;

     return ((num&(num-1))==0); //Brian Kerningham's 
     // if its not power of two we will get non zero values
    }
}
