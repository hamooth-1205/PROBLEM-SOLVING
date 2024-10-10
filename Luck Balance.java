public static int luckBalance(int k, List<List<Integer>> contests) {
        int imp=0;
        int score=0;
        List<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<contests.size();i++)
        {
            if(contests.get(i).get(1)==1)
            {
                imp++;
                arr.add(contests.get(i).get(0));
            }
            else
                score=score+contests.get(i).get(0);
        }
        int towin=imp-k;
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++)
        {
            if(i>=towin)
                score=score+arr.get(i);
            else
                score=score-arr.get(i);
        }
        return score;
        
    }
