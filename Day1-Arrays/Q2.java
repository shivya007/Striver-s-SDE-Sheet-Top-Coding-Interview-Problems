//118. Pascal's Triangle


class Solution {
    public List<Integer> generateRow(int row){
        List<Integer> ansRow = new ArrayList<>();
        int ans = 1;
        ansRow.add(ans);
        for(int col = 1; col < row; col++){
            ans = ans * (row-col);
            ans = ans/col;
            ansRow.add(ans);
        }
        return ansRow;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            List<Integer> temp = generateRow(i);
            ans.add(temp);
        }
        return ans;
    }
}