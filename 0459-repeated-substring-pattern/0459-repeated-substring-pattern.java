public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        boolean flag=false;
        int length=str.length();
        for(int i=length/2;i>0;i--){
            if(length%i==0){
                int n=length/i;
                String s=str.substring(0,i);
                StringBuffer b=new StringBuffer();
                for(int j=0;j<n;j++){
                    b.append(s);
                }
                if(b.toString().equals(str)){
                    flag=true;
                    return flag;
                }
            }
        }
        return flag;
    }
}