// we can only insert an element only if the array has empty space.

import java.util.*;
public class Insert_Operation {

     public static void main(String args[]) 
        { 
           int arr[] = new int[5], cap = 5, n = 3; //capacity of the array is 5
           // n is number of element in the array
    
           arr[0] = 5; arr[1] = 10; arr[2] = 20;
    
           System.out.println("Before Insertion");  // printing the before array
    
           for(int i=0; i < n; i++)
           {
                   System.out.print(arr[i]+" ");
           }
    
           System.out.println();
    
           int x = 7, pos = 2;

           //element to be inserted is 7 at 2nd position
    
           n = insert(arr, n, x, cap, pos);
    
           System.out.println("After Insertion");
    
           for(int i=0; i < n; i++)
           {
                   System.out.print(arr[i]+" ");
           }
        
    }

   
        static int insert(int arr[], int n, int x, int cap, int pos)
        {
            if(n == cap)
                return n;
    
            int idx = pos - 1;
    
            for(int i = n - 1; i >= idx; i--) // sare element ko shift kerna hoga right side to create the space
            {
                arr[i + 1] = arr[i];
                //updating the element 
            }
    
            arr[idx] = x; //pacing the inserted element in the given position
    
            return n + 1;
        } 
    
       
    }
