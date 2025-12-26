class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];

        for (String s : X.split("")) {
            countX[Integer.parseInt(s)]++;
        }
        
        for (String s : Y.split("")) {
            countY[Integer.parseInt(s)]++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 9; i >= 0; i--) {
            int commonCount = Math.min(countX[i], countY[i]);
            for (int j = 0; j < commonCount; j++) {
                sb.append(i);
            }
        }
        
        String answer = sb.toString();
        
        if (answer.isEmpty()) {
            return "-1";
        }

        if (answer.startsWith("0")) {
            return "0";
        }
        
        return answer;
    }
}
