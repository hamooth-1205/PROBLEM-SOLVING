 public static List<Integer> jimOrders(List<List<Integer>> orders) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<orders.size();i++)
        {
            int sum=orders.get(i).get(0)+orders.get(i).get(1);
            arr.add(sum);
        }
        List<Integer> cp=(ArrayList<Integer>)arr.clone();
        Collections.sort(cp);
        List<Integer> res=new ArrayList<Integer>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.size();i++)
        {
            int ind=arr.indexOf(cp.get(i));
            res.add(ind+1);
            arr.set(ind,-1);
        }
        return res;
    }
