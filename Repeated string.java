public static long repeatedString(String s, long n) {
        long count=0;
        char c[]=s.toCharArray();
        for(char a:c)
        {
            if(a=='a')
                count++;
        }
        long d=n/c.length;
        long rem=n%c.length;
        count=count*d;
        for(int i=0;i<rem;i++)
        {
            if(c[i]=='a')
                count++;
        }
        return count;
    }
