//  count the number of set bits ( 1's ) in the binary representation of any number.
// naive method is- ot travel to every digit and count the no set bits. time complexty will be high

// by Brian Kernigum algo it only run, the num of set digits are there. 

import java.util.Scanner;

public class Count_Set_Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        // user input in bit manipilation will be in deccimal number system
        int n = sc.nextInt();
        System.out.println(Count_Set_Bits(n));
    }

    static int Count_Set_Bits(int n){
        int res=0;
        while(n>0){
            n= n & (n-1);
           // System.out.print(n+" ");
            res++;
        }

        return res;
    }
}
