package Practice;

public class AccountsMac {
    public static void main(String[] args){
        int[][] accounts = {
                {1000, 2000, 3000},
                {32, 100, 230, 450},
                {10, 20, 30, 40},
                {1000, 2000, 3000, 4000}
        };
        maxWealthFunc(accounts);
    }

    static void maxWealthFunc(int[][] accounts){
        int max = Integer.MIN_VALUE;
        int wealthSum;
        int per = 0;

        for(int person = 0; person < accounts.length; person++){
            wealthSum = 0;
            for(int accountValue = 0; accountValue < accounts[person].length; accountValue++){
                wealthSum += accounts[person][accountValue];
            }
            if(wealthSum > max){
                max = wealthSum;
                per = person+1;
            }
        }
        System.out.println("Person: "+ per + " Max Wealth: " + max);
    }
}
