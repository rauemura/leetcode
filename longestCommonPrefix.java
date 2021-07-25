class Solution {
    public String longestCommonPrefix(String[] strs) {
        //一個目とn個目を比較していく
        String commonPrefix = strs[0];
        for(int i=1;i<strs.length;i++){
            commonPrefix = getSamePrefix(commonPrefix,strs[i]);
        }
        return commonPrefix;
    }
    
    private String getSamePrefix(String first, String second){
        StringBuilder samePrefix = new StringBuilder();
        int i = 0;
        while(i<first.length() && i<second.length()){
            if(first.substring(i,i+1)==second.substring(i,i+1)){
                samePrefix.append(first.substring(i,i+1));
            }else{
                break;
            }
            i++;
        }
        return samePrefix.toString();
    }
}