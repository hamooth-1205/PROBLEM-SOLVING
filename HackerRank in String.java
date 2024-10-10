public static String hackerrankInString(String s) {
        char c[]={'h','a','c','k','e','r','r','a','n','k'};
        int len=s.length();
        char ch[]=s.toCharArray();
        int j=0;
        for(int i=0;i<len && j<10;i++)
        {
            if(ch[i]==c[j])
                j++;
        }
        if(j==10)
            return "YES";
        return "NO";
    }
