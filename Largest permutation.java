public static List<Integer> largestPermutation(int k, List<Integer> arr) {
        int n = arr.size();
        int ind[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            ind[arr.get(i)] = i;
        }
        for (int i = 0; i < n && k > 0; i++) {
            int val = n - i;
            if (arr.get(i) == val) {
                continue;
            }
            int vi = ind[val];
            ind[arr.get(i)] = vi;
            ind[val] = i;
            Collections.swap(arr, i, vi);
            k--;
        }
        return arr;
    }
