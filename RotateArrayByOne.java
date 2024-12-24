public class RotateArrayByOne {
    class Solution {
        public void rotateArrayByOne(int[] nums) {
            int temp = nums[0];
    
            //looping through the array
            for(int i=1; i<nums.length; i++){
                nums[i-1]=nums[i];
            }
            //putting the first element at the last as we are rotating left
            nums[nums.length-1]= temp;
        }
    }
}
