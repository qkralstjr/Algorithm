import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> findMap = new HashMap<>();
        Arrays.stream(participant).forEach(p -> findMap.put(p, findMap.getOrDefault(p, 0) + 1));
        Arrays.stream(completion).forEach(c -> findMap.put(c, findMap.get(c)-1));

        String answer = "";
        for(String key : findMap.keySet()) {
            if(findMap.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }
}