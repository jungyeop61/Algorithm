class Solution {
    public int solution(String number) {
        int answer =0;
        //각자리 숫자를 다 더한다.
        for (int i = 0; i < number.length(); i++) {
            int a = Character.getNumericValue(number.charAt(i)); //character를 int로 변환
            answer += a;
        }
        // 9로 나눈 나머지를 구한다.
        answer %= 9;
        return answer;
    }
}