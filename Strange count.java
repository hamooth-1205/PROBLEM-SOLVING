 public static long strangeCounter(long t) {
        long v=3;
        while(t>v)
        {
            t=t-v;
            v=v*2;
        }
        return v-(t-1);
    }
