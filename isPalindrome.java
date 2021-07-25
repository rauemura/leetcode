class Solution {
    public boolean isPalindrome(int x) {
        //反転させて同じか確認する。
        if(0<=x && x<10)return true;
        if(x<0)return false;
        
        String x_reversed_str = reverseAsString(String.valueOf(x));
        
        if(x_reversed_str.equals(String.valueOf(x))){
            return true;
        }else{
            return false;
        }
    }
    
    private String reverseAsString(String str){

        StringBuilder strb = new StringBuilder(str);
        str = strb.reverse().toString();
        return str;
    }
}