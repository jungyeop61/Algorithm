class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String temp ="";

        int index =0;
        if(0<= s && s<=e){
            for (int i = e; i >=s; i--) {
                temp += my_string.charAt(i);
            }
        }



        for (int i = 0; i < my_string.length(); i++) {
            if(s<=i && i<=e){
                answer += temp.charAt(index);
                index++;
            }else{
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}