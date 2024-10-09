public static String pangrams(String s) {
        for(int i=65,j=97;i<91 && j<123;i++,j++)
        {
            if(!(s.contains(Character.toString((char)i)) || s.contains(Character.toString((char)j))))
                return "not pangram";
        }
        return "pangram";

    }
