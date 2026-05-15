class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            pascal.add(generateRow(i));
        }
        return pascal;
    }
    private List<Integer> generateRow(int num){
        List<Integer> row = new ArrayList<>();
        int prev = 1;
        row.add(prev);
        for(int i = 1; i < num; i++){
            prev = prev * (num - i) / i;
            row.add(prev);
        }
        return row;
    }
}