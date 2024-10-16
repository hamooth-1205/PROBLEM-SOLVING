public static String gridSearch(List<String> G, List<String> P) {
        int R = G.size();
        int C = G.get(0).length();
        int r = P.size();
        int c = P.get(0).length();
        for (int i = 0; i <= R - r; i++) 
        {
            for (int j = 0; j <= C - c; j++) 
            {
                boolean found = true;
                for (int k = 0; k < r; k++) 
                {
                    if (!G.get(i + k).substring(j, j + c).equals(P.get(k))) 
                    {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    return "YES";
                }
            }
        }
        return "NO";
    }
