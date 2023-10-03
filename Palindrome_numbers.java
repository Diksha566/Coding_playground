public class Palindrome_numbers {
          public static void main(String args[]){
                    int number = 66866;
                    int result = 0;
                    while(number!=0){
                              number=number%10; // we will get the reaminder digit
                              number=number/10; // we will get remove the last digit
                              result = result*10+number;
                    }

                    if(number==result)
                              System.out.println("The given number is palindrome");

                    else
                    System.out.println("Not palindrome");
          }
          
}
