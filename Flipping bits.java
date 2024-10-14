public static long flippingBits(long n) {
         long res= 0;
         long m= 1;
        for (int i = 0; i < 32; i++) {
            if (n % 2 == 0) {
                res=res+m;
            }
            n=n/2; 
            m=m*2;
        }
        
        return res;
    }
