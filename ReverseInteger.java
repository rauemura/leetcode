class Solution {
    public int reverse(int x) {
        boolean isMinus = false;
        
        if(-10<x && x<10)return x;
        if(x<0) isMinus = true;  
        if(isMinus) x *= -1;
        
        String x_reversed_str = reverseAsString(String.valueOf(x));
        
        int x_reversed = 0;
        try{
            x_reversed = Integer.valueOf(x_reversed_str).intValue();
        } catch(NumberFormatException e){
            return 0;
        }
        
        return isMinus ? x_reversed*(-1) : x_reversed;

    }
    
    private String reverseAsString(String str){

        StringBuilder strb = new StringBuilder(str);
        str = strb.reverse().toString();
        return str;
    }
    
    
    /*
    
    x=-321
    pop = x % 10; //   1
    x = /= 10;    // -32
    
    rev = rev * 10 + pop; //rev=0 0+1 = 1 
                          //rev=1 10+2 = 12 
                          //rev=12 120+3 = 123     
    
    */
    
    
    
}