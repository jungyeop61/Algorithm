class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            char[] arr = String.valueOf(array[i]).toCharArray();
            for (char a : arr){
                if (a == '7'){
                    answer++;
                }
            }
        }
        return answer;
    }
}