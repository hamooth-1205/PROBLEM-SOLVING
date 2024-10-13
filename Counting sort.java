public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> ar=new ArrayList<Integer>(100);
        for (int i = 0; i<100; i++) {
            ar.add(0);
        }
        for(int i:arr)
        {
            int num=ar.get(i);
            ar.set(i,++num);
        }
        return ar;
    }
