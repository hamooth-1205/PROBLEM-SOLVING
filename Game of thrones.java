 public static String gameOfThrones(String s) {
        int a[]=new int[26];
        for(char c:s.toCharArray())
        {
            a[c-'a']++;
        }
        int count=0;
        for(int i:a)
        {
            if(i%2!=0)
                count++;
        }
        if(count>1)
            return "NO";
        return "YES";
    }
