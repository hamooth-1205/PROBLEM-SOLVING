 public static int theLoveLetterMystery(String s) {
        int count=0;
        int len=s.length();
        int i=0;
        int j=0;
        if(len%2==0)
        {
            i=len/2;
            j=i-1;
        }
        else
        {
            i=(len/2)+1;
            j=(len/2)-1;
        }
        char ch[]=s.toCharArray();
        for(int m=i,n=j;i<len && j>=0;i++,j--)
        {
            int max=(int)Math.max(ch[i]-ch[j],ch[j]-ch[i]);
            count=count+max;
        }
        return count;
    }
