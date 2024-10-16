public static String encryption(String s) {
        s=s.replaceAll("\\s","");
        int len=s.length();
        int r=(int)Math.floor(Math.sqrt(len));
        int c=(int)Math.ceil(Math.sqrt(len));
        if(r*c < len)
            r++;
        List<StringBuilder> arr=new ArrayList<StringBuilder>();
        for(int i=0;i<c;i++)
        {
            arr.add(new StringBuilder());
        }
        for(int i=0;i<len;i++)
        {
            arr.get(i%c).append(s.charAt(i));
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder i:arr)
        {
            res.append(i).append(" ");
        }
        String ret=res.toString().trim();
        return ret;
    }
