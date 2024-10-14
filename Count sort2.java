public static List<Integer> countingSort(List<Integer> arr) {
       ArrayList<Integer> res=new ArrayList<Integer>();
       int a[]=new int[100];
        for(int i:arr)
        {
            a[i]++;
        }
        for(int i=0;i<100;i++)
        {
            for(int j=0;j<a[i];j++)
            {
                res.add(i);
            }
        }
        return res;
    }
