import java.time.Period;
import java.util.ArrayList;

class Solution {
    public String solution(String n_str) {
        String answer = "";
        int last = 0;

       if(n_str.charAt(0) =='0'){
           //처음이 0일 때
           for (int i = 0; i < n_str.length(); i++) {
               if(i<n_str.length()-1  && n_str.charAt(i) != n_str.charAt(i+1)){
                   last = i+1;
                   break;
               }
           }
           for (int i = last; i < n_str.length(); i++) {
               answer += n_str.charAt(i);
           }

       }else{
           //처음이 0이 아닐 때
           for (int i = 0; i < n_str.length(); i++) {
               answer += n_str.charAt(i);
           }
       }

        return answer;
        }
    }

