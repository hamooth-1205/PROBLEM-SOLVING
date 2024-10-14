public static void insertionSort2(int n, List<Integer> arr) {
       for(int i=0;i<n-1;i++)
       {
           int j=i;
           while(j>=0 && arr.get(j)>arr.get(j+1))
           {
               int temp=arr.get(j);
               arr.set(j,arr.get(j+1));
               arr.set(j+1,temp);
               j--;
           }
           for(int k:arr)
              System.out.print(k+" ");
           System.out.println();
       }
    }
