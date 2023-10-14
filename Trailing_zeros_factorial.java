import java.util.Scanner;
// this will not work for large numbers like 20..etc
public class Trailing_zeros_factorial {
          public static void main(String args[]){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the num: ");
                    int num=sc.nextInt();
                    
                    int result=1; // cal factoriL
                    for(int i=1;i<=num;i++){
                              result=result*i;
                    }

                    System.out.println("factorial of the number is "+result);

                    // cal trailing
                    int count = 0;
                    if(result %2==0 && result%5==0){
                            
                              while(num!=0){ // where is my mistake
                                        num = num/10;
                                        if(num==0){
                                                  count++;
                                        }
                              }

                    }

                    System.out.println("Number of trailing in "+ num + " is " + count);
          }
          
}
