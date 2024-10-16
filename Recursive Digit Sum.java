public static int find(long num)
    {
        if(num<10)
            return (int)num;
        long sum=0;
        while(num>0)
        {
            sum=sum+num%10;
            num=num/10;
        }
        return find(sum);
    }
    public static int superDigit(String n, int k) {
        long sum=0;
        for(int i=0;i<n.length();i++)
            sum=sum+n.charAt(i)-'0';
        sum=sum*k;
            return find(sum);
    }
