// Problem Description: We are given an n-digit number. The task is to find the number of digits in the number, provided that, n>0.
public class Counting_digits{
          public static void main(String args[]){
                    int num = 567, count=0;
                    System.out.println(num);
                    
                    while(num>0){
                              num=num/10;
                              count++;
                    }

                    System.out.println("No of ditigs is "+count);
          }

}
