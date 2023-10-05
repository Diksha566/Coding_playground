//Problem Description: We are given a number. The task is to check if the number is prime or not.
import java.util.Scanner;
public class Check_for_prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(Check_for_prime(num));
        
    }

    public static boolean  Check_for_prime(int num){
        if(num==0){
            System.out.println("NO, it is NOT prime.");   
            return false;
        } // #bhuli gayi ti
        

        if(num%2==0){ //This check will save irration for large n
            System.out.println("NO, it is NOT prime.");   
            return false;
        }

            if(num%3==0){ //This check will save irration for large n
            System.out.println("NO, it is NOT prime.");   
            return false;
        }
        
        for(int i=2;i*i<=num;i++){
            if (num%i==0){
                System.out.println("NO, it is NOT prime.");   
                 return false;
            }
           

            else{
            System.out.println("YES, it is prime.");  
            System.out.println("time complexcity is O(root n)");  
            return true;
            }
            
        }

        return false;

    }
}