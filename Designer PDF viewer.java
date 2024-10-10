public static int designerPdfViewer(List<Integer> h, String word) {
        int len=word.length();
        int max=0;
        for(int i=0;i<len;i++)
        {
            int v=word.charAt(i)-97;
            if(max<h.get(v))
                max=h.get(v);
        }
        return len*max;
    }

}
