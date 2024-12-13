class Solution {
    public String intToRoman(int num) {
        int[] storeInt = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] storeRoman = {"M", "CM", "D", "CD", "C", "XC","L", "XL","X","IX","V","IV","I"};
        String romanNumeral ="";
        for (int i=0; i<storeInt.length; i++){
            while(num >= storeInt[i]){
                String symbol = storeRoman[i];
                romanNumeral += symbol;
                num -=storeInt[i];
            }
        }
        return romanNumeral;
    }
}