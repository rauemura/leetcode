class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

         if(nums.length == 2){
             answer[0] = 0;
            answer[1] = 1;
             return answer;
         }   
          for (int i=0; i < nums.length; i++){  
            for (int j=i+1; j < nums.length; j++){
                if(i<j && (nums[i] + nums[j] == target)){  
                    answer[0] = i;
                    answer[1] = j;
                    break;
                } 
            }
    }
    return answer;
    }
}