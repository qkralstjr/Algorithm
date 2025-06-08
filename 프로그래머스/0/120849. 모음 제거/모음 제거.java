class Solution {
    public String solution(String my_string) {
        String answer = "";
        String vowel = "aeiou";
        for(char c : my_string.toCharArray()) {
            if(!vowel.contains(String.valueOf(c))) {
                answer += c;
            }
        }
        return answer;
    }
}