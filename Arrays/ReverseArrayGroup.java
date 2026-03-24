package Arrays;

public class ReverseArrayGroup {
   
    public static void reverseGroup(int nums[] , int k){
    int n = nums.length;
    for(int i=0;i<n;i+=k){
        int left =i;
        int right = Math.min(i+k-1, n-1);
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;

        }
    }
    

    }

    public static void main(String[] args) {
          int nums[] = {2,5,6,4,7,8,9,1};
    int k = 3;
    reverseGroup(nums,k);
    for(int i=0;i<nums.length;i++){
        System.out.print(nums[i] + " ");
    }

    }
  
    
}
