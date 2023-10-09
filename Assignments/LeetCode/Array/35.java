class Demo {
    public int searchInsert(int[] nums, int target) {
        int left = 0,right = nums.length-1;
        int mid=0;
        while(left<=right){
            mid=left+right-left/2;
            if(nums[mid]==target){
                return mid;
            }                                   // 1,3,5   4
            else if(target>nums[mid]){
                left = mid+1;
            }
            else{
                right=mid-1;
            }
            
        }
        if(target>nums[mid]){
            return mid+1;
        }
        else if(target==nums[0]){
            return 0;
        }
        // else if(target==2){
        //     return 1;
        // }
        // else if(target<nums[mid])
        //     return mid-1;
        else
            return 0;
    }
}

