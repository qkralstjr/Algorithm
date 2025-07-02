import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] sides) {
        
        int max = 0;
        int sum = 0;
        for (int side : sides) {
            if (side > max) max = side;
            sum += side;
        }
        return max < (sum - max) ? 1 : 2; 
    }
}