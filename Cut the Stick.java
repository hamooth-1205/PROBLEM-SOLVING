public static boolean check(List<Integer> arr)
    {
        for(int i:arr)
        {
            if(i>0)
                return true;
        }
        return false;
    }
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> a=new ArrayList<Integer>();
        a.add(arr.size());
        while(check(arr))
        {
            int min=Integer.MAX_VALUE;
            for(int i:arr)
            {
                if(min>i && i>0)
                    min=i;
            }
            System.out.println(min);
            int count=0;
            for(int j=0;j<arr.size();j++)
            {
                arr.set(j,arr.get(j)-min);
                if(arr.get(j)>0)
                    count++;
            }
            System.out.println(arr);
            min=Integer.MAX_VALUE;
            if(count>0)
             a.add(count);
        }
        return a;
    }
