package Arrays;

public class SecondLargest {


       public static int secondLarge(int arr[]){
        int largest = -1 , secondlarge =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> largest){
                secondlarge = largest;
                largest = arr[i];
            }
            else if( arr[i] < largest && arr[i] > secondlarge){
                secondlarge = arr[i];
            }
        }
        return secondlarge;
       }
    public static void main(String[] args) {
         int nums[] = { 2,15,3,18,75,90};        // Problem is to find the second largest element in an array
         System.out.println(secondLarge(nums));
    }
    
   
}
