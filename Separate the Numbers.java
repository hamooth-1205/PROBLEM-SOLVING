public static void separateNumbers(String s) {
        int l=s.length();
        for(int i=1;i<=l/2;i++)
        {
            String s1=s.substring(0,i);
            long num=Long.parseLong(s1);
            Long num2=num+1;
            StringBuilder s2=new StringBuilder(s1);
            while(s2.length() < l)
            {
                s2.append(num2);
                num2=num2+1;
            }
            if(s2.toString().equals(s)){
                System.out.println("YES "+s1);
                return;
            }
                
        }  
        System.out.println("NO");
    }
