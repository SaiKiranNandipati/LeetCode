class Solution {
    public int singleNumber(int[] nums) {

        
        int j=1;
        int res=nums[0];
        while(j<nums.length)
        {
            System.out.println("input1: "+res);
            System.out.println("input2: "+nums[j]);
            System.out.println("result: "+res);
            res=res^nums[j];
            
            j++;
        }
        return res;
    }
}