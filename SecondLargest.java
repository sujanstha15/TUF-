class Solution {
    public int secondLargestElement(int[] nums) {
    //if the length of array is less than 2, there exists no second largest element
    if(nums.length<2){
        return -1;
    }
    
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    //traversing the array only once to find the largest and second largest element
    for(int i=0; i<nums.length; i++){
        if(nums[i]>largest){
            secondLargest = largest;
            largest = nums[i];
        }
        else if(nums[i]>secondLargest && nums[i]!= largest){
            secondLargest = nums[i];
        }
    }

   
    //if there exists no second element
    if(secondLargest == Integer.MIN_VALUE){
        return -1;
    }

 return secondLargest;
    }
}