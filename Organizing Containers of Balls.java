public static String organizingContainers(List<List<Integer>> container) {
        int n=container.size();
        int s[]=new int[n];
        int count[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                s[i]=s[i]+container.get(i).get(j);
                count[j]=count[j]+container.get(i).get(j);
            }
        }
        Arrays.sort(s);
        Arrays.sort(count);
        for(int i=0;i<n;i++)
        {
            if(s[i]!=count[i])
            {
                return "Impossible";
            }
        }
        return "Possible";
    }
