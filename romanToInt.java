class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        /*  
        IV   = 4
        IX   = 9
        XL   = 40
        XC   = 90
        CD   = 400
        CM   = 900      
        ↑先に減算則のこいつらを抜く
        */
        
        sum = convert(s);
        
        return sum;
        
    }
    
    private enum Subtraction {
        FOUR("IV",4),
        NINE("IX",9),
        FOURTY("XL",40),
        NINETY("XC",90),
        FOURHND("CD",400),
        NINEHND("CM",900);
            
        private final String roman; 
        private final int value; 

        Subtraction(String roman, int value) {  
           this.roman = roman;
           this.value = value;
        }
    }
    
    private enum Addition {
        ONE("I",1),
        FIVE("V",5),
        TEN("X",10),
        FIFTY("L",50),
        HND("C",100),
        FIVEHND("D",500),
        THD("M",1000);
            
        private final String roman; 
        private final int value; 

        Addition(String roman, int value) {  
           this.roman = roman;
           this.value = value;
        }
    }
    
    private int convert(String input){
        int sum = 0;
        for(Subtraction sub: Subtraction.values()){
            while(input.contains(sub.roman)){
               input = input.replaceFirst(sub.roman,"");
               sum += sub.value; 
            }
        }

        for(Addition adt: Addition.values()){
            while(input.contains(adt.roman)){
               input = input.replaceFirst(adt.roman,"");
               sum += adt.value;
            }
        }
        return sum;
    }

}