public class SearchInsertPosition {
    class Solution {
        public int searchInsert(int[] nums, int target) {
         int low=0;
         int high = nums.length-1;
         //looping through the array
         while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high = mid-1;
            }
            
         } 
         return low;
        }
        
    }
    
}
