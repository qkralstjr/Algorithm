import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> answer = new ArrayList<>();

        for(char c : my_string.toCharArray()) {
            int temp;
            try{
                temp = Integer.parseInt(String.valueOf(c));
                answer.add(temp);
            }catch(NumberFormatException e){
                
            }
        }
        
        Collections.sort(answer);
        return answer;
    }
}