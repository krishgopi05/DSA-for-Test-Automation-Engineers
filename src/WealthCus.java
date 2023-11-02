public class WealthCus {

    // LeetCode : find wealthiest customer given that of account numbers
    // input = accounts = [1,2,3],[3,2,2]
    // output = 6

    public static void main(String[] args) {
        int [][] Acc = {{121,255,355 },
                {3,2,1}};
             int ans = Integer.MIN_VALUE;
        for (int i = 0; i < Acc.length ; i++) {
                   int sum  = 0;
            for (int j = 0; j < Acc[i].length; j++) {
                  sum =sum+Acc[i][j];
            }
            if (sum>ans){
                ans = sum;
            }
        }
        System.out.println(ans);
    }
}
