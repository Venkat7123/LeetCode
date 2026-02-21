class Solution {
    public String convert(String s, int numRows) {
        int num1 = (2*numRows)-2;
        int num2 = 0;
        int itr;
        int len = s.length();
        if(len <= numRows || numRows == 1) return s;
        
        char[] arr = s.toCharArray();
        StringBuilder res = new StringBuilder();
       
        for(itr = 0 ; itr < numRows; itr++){
            

            int end = itr;          
            res.append(arr[end]);          
            while(end < len){
                if(itr == 0){
                    end+= num1;
                    if(end > len-1) break;
                    res.append(arr[end]);
                }
                else if(itr == numRows -1 ){
                    end+= num2;
                    if(end > len-1) break;
                    res.append(arr[end]);
                }
                else{
                    end+= num1;
                    if(end > len-1) break;
                    res.append(arr[end]);
                    end+= num2;
                    if(end > len-1) break;
                    res.append(arr[end]);
                }
            }
            num1 -= 2;
            num2 += 2;
        }
        return res.toString();

    }
}