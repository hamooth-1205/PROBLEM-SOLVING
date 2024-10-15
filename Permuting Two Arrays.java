public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        Collections.sort(A);
        Collections.sort(B);
        for(int i=0,j=B.size()-1;i<A.size() && j>=0;i++,j--)
        {
            if(A.get(i)+B.get(j)<k)
                return "NO";
        }
        return "YES";
    }
