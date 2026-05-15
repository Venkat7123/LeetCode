class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(0, 0, n, "", res);
        return res;
    }
    
    public void generate(int open, int close, int n, String curr, List<String> res) {
        if(open + close == n * 2){
            res.add(curr);
            return;
        }
        if(open < n){
            generate(open + 1, close, n, curr + '(', res);
        }
        if(close < open){
            generate(open, close + 1, n, curr + ')', res);
        }
    }
}