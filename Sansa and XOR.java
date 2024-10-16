public static int sansaXor(List<Integer> arr) {
        int n=arr.size();
        if(n%2==0)
            return 0;
        int res=0;
        for(int i=0;i<n;i=i+2)
            res=res^arr.get(i);
        return res;
    }
