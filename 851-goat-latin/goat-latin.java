class Solution {
    public String toGoatLatin(String sentence) {
        String[] str = sentence.trim().split(" ");
        String a = "a";
        for(int i = 0; i < str.length; i++){
            if(!isVowel(str[i].charAt(0))){
                str[i] = str[i].substring(1) + str[i].charAt(0);
            }
            str[i] += "ma" + a;
            a+="a";
        }
        return String.join(" ", str);
    }
    static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
}