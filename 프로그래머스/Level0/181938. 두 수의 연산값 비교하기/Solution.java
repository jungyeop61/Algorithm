class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int temp = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        if(temp >= (2 * a * b)){
            answer = temp;
        }else{
            answer = (2*a*b);
        }
        return answer;
    }
}