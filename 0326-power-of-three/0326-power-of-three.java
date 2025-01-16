class Solution {
    public boolean isPowerOfThree(int n) {
        //without using any loops;
        return (Math.log10(n) / Math.log10(3)) % 1==0;




    //using loop statement;   
    // if (n>1){
    //     while (n%3==0){
    //          n/=3;
    //     }
    // }
    // return n ==1;
}
}