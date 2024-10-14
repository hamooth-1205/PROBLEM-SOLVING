public static int introTutorial(int V, List<Integer> arr) {
        int ind=0;
        for(int i=0,j=arr.size()-1;i<=j;i++,j--)
        {
            if(arr.get(i)==V)
            {
                ind=i;
                break;
            }
            if(arr.get(j)==V)
            {
                ind=j;
                break;
            }
        }
        return ind;
    }
