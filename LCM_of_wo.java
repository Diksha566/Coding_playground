// Problem Description: We are given two numbers. The task is to find the LCM of the numbers.

// smallest no which is divisible by both numbers

//note LCM of two nums when one divids other, then LCM will be largest of two numbers.
// if nums have no factor common then LCM iis multipication of two numbers.

import java.util.Scanner;
public class LCM_of_wo {
    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1= sc.nextInt();
        System.out.println("Enter the second number");
        int num2= sc. nextInt();

        System.out.println(LCM_of_wo(num1, num2));
        

    }

    public static int LCM_of_wo(int num1,int num2)
    {
        int result= Math.max(num1, num2);
        while(num1!=num2){ // MM while(num1!=num2), while(num1>0)  loop not runing
             if((num1%result==0) && (num2%result==0))
        {
             System.out.print("LCM of two numbers is ");
                return result;
                        

        }
        System.out.print("LCM of two numbers is ");
        return result;

        }
       
        result++;
        return -1;
        

    }
    
}
// O(max(num1,num2))