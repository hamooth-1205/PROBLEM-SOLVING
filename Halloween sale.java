public static int howManyGames(int p, int d, int m, int s) {
        int amount=p;
        int count=0;
        while(amount<=s)
        {
            s=s-amount;
            count++;
            amount=Math.max(m,amount-d);
        }
        return count;
