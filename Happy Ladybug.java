public static boolean happy(String s)
    {
        char c[]=s.toCharArray();
        System.out.println(c);
        for(int i=0;i<c.length;i++)
        {
            if(i==0){
                if(c[i]!=c[i+1])
                {
                    System.out.println(c[i]+" "+c[i+1]);
                    return false;
                }
            }
            else if(i==c.length-1){
                if(c[i]!=c[i-1])
                {
                    System.out.println(c[i]+" "+c[i-1]);
                    return false;
                }
            }
            else if(c[i]!=c[i-1] && c[i]!=c[i+1])
            {
                return false;
            }
        }
        return true;
    }

    public static String happyLadybugs(String b) {
        boolean dash=false;
        int a[]=new int[26];
        for(char c:b.toCharArray())
        {
            if(c=='_')
            {
                dash=true;
                continue;
            }
            a[c-'A']++;
        }
        for(int i:a)
        {
            if(i==1)
            {
                return "NO";
            }
        }
        if(dash==true)
            return "YES";
        else if(dash==false && happy(b))
            return "YES";
        return "NO";
    }
