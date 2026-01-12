// Program of remove duplicates from sorted array
// Given an integer array
// Sorted in non decreasing order

class Duplicates {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int j=1;j<n;j++)
        {
            if(nums[j]!=nums[i])
            {
                nums[i+1]=nums[j];
                i++;
        
            }
        }
        return(i+1);
        
    }
}