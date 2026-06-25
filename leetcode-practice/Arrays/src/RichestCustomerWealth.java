//1672. Richest Customer Wealth
//https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int richCus = 0;
        for(int i=0;i<accounts.length;i++){
            int wealth = 0;
            for(int j=0;j<accounts[i].length;j++){
                wealth += accounts[i][j];
            }
            richCus = Math.max(richCus, wealth);
        }
        return richCus;
    }
}
