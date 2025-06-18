class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        for(char c : str.toCharArray()){
            answer += Integer.parseInt(c+"");
        }
        return answer;
    }
}