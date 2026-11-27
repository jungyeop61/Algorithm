class Solution {
    public String solution(int[] numLog) {
        String answer = "";

        for (int i = 0; i < numLog.length-1; i++) {
                int num = numLog[i+1] - numLog[i];
                String s = str(num);
                answer+=s;
        }
        return answer;
    }

    public String str(int a) {
        if(a == 1){
            return "w";
        }else if(a == -1){
            return "s";
        }else if(a == 10){
            return "d";
        }else if(a == -10){
            return "a";
        }else{
            return "";
        }
    }
}