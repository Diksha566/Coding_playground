public class Delete_Operation {
    public static void main(String[] args) {
        int i;
        int[] arr = new int[]{ 1,2,3,4,5,6}; 
        int d = 6; //element to be deleted 

        int n = 6; // no. elements in the array
        System.out.println(n);
        

        // searching if that element is present or not
        for( i=0; i<arr.length; i++)
            if(arr[i]== d)
            break;
        

        //deleting the element 
        for(int j=i; j<arr.length-1; j--)
            arr[j] = arr[j+1]; //element hatane ke baad shifting the element 
        System.out.println(n-1);
        
        

}

}