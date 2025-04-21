class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector <bool> ans;

        for (int i = 0; i < candies.size(); i++) {
            bool test = false;

            for (int j = 0; j < candies.size(); j++) {
                if (candies[i] + extraCandies < candies[j]) {
                    test = true;
                    break;
                }
            }

            if (test) {
                ans.push_back(false);
            }

            else {
                ans.push_back(true);
            }
        }

        return ans;
    }
};