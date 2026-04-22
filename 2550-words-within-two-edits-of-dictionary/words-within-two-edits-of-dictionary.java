class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> words = new ArrayList<>();
        for(String que : queries){
            for(String dic : dictionary){
                int mismatch = 0;
                if (que.length() != dic.length()) break;
                else{
                    for(int i = 0; i < que.length(); i++){
                        if(que.charAt(i) != dic.charAt(i)){
                            mismatch++;
                            System.out.println(que + " " + mismatch);
                            if(mismatch > 2) break;
                        }
                    }
                    if(mismatch < 3){ 
                        System.out.println(que);
                        words.add(que);
                        break;
                    }
                }
            }
        }
        return words;
    }
}