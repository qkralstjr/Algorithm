class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for(int index : box){
            int temp;
            temp = index/n;
            answer*=temp;
        }
        return answer;
    }
}