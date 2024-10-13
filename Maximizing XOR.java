public static int maximizingXor(int l, int r) {
        int max=Integer.MIN_VALUE;
        for(int i=l;i<=r;i++)
        {
            for(int j=i;j<=r;j++)
            {
                int num=i^j;
                if(num>max)
                    max=num;
            }
        }
        return max;
    }
