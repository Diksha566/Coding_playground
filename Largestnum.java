public class Largestnum {

    public static int getsmallest(int num[]){
        int smallest = Integer.MAX_VALUE; 

         for(int i=0; i<num.length; i++){
            if(num[i]< Integer.MAX_VALUE){
                smallest = num[i];
            }

         }

         return smallest;

    }
       

    public static int getLargest(int num[]){ // LARGEST VALUE
        int largest = Integer.MAX_VALUE; // - infinity

        for(int i =0; i<num.length; i++){
            if(largest > num[i]){ // num at i index
                largest = num[i]; // value store
            }
        }

        return largest;

    }
    public static void main(String[] args){
        int num[]={1,2,6,3,5};

        System.out.println("Smallest value = " + getLargest(num));

        System.out.println("Largest number =  " + getsmallest(num));

    }
    
}