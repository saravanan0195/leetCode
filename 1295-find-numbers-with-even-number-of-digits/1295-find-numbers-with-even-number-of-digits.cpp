class Solution {
public:
    int findNumbers(vector<int>& nums) {
       int count=0;
        for(int i=0 ; i<nums.size() ; i++)
        {
            int x=0;
            int z=nums[i];
            while(z){
                x++;
                z/=10;
            }
            if(x%2==0)
                count++;
        }
        return count; 
    }
};