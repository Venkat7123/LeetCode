class Solution {
    public String convert(String s, int numRows) {
        int gap1 = (numRows - 1) * 2;
        int gap2 = 0;
        int len = s.length();
        if(len < numRows || numRows == 1){
            return s;
        }

        char[] str = s.toCharArray();
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < numRows; i++){
            int ind = i;
            res.append(s.charAt(ind));
            while(ind < len){
                if(i == 0){
                    ind += gap1;
                    if(ind > len - 1) break;
                    res.append(s.charAt(ind));
                }
                else if(i == numRows - 1){
                    ind += gap2;
                    if(ind > len - 1) break;
                    res.append(s.charAt(ind));
                }
                else{
                    ind += gap1;
                    if(ind > len - 1) break;
                    res.append(s.charAt(ind));
                    ind += gap2;
                    if(ind > len - 1) break;
                    res.append(s.charAt(ind));
                }
            }
            gap1-=2;
            gap2+=2;
        }
        return res.toString();

    }
}