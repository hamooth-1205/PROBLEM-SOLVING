public static String balancedSums(List<Integer> arr) {
        int sum=0;
        int l=0;
        for(int i:arr)
        {
            sum=sum+i;
        }
        for(int i=0;i<arr.size();i++)
        {
            int r=sum-l-arr.get(i);
            if(r==l)
                return "YES";
            l=l+arr.get(i);
        }
        return "NO";

    }
