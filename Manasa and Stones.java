public static List<Integer> stones(int n, int a, int b) {
    Set<Integer> res = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int value = 0;
            for (int j = 0; j < n - 1; j++) {
                if (j < i) {
                    value += b;
                } else {
                    value += a;
                }
            }
            res.add(value);
        }
        List<Integer> res1 = new ArrayList<>(res);
        Collections.sort(res1);
        return res1;
    }
