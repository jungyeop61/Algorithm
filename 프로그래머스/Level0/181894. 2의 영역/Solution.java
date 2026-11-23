class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        int firstIndex = 0;
        int lastIndex = 0;
        int count = 0;
        //처음에서 부터 2인 인덱스 찾기
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 2){
                firstIndex = i;
                break;
            }
        }
        // 끝에서 부터 2인 인덱스 찾기
        for (int i = arr.length-1; i >=0; i--) {
            if(arr[i] == 2){
                lastIndex = i;
                break;
            }
        }
        answer = new int[lastIndex - firstIndex + 1];
        
        if(firstIndex == 0 && lastIndex ==0){
            answer = new int[]{-1};
        }else{
            for (int i = firstIndex; i <= lastIndex ; i++) {
                answer[count] = arr[i];
                count++;
            }
        }

        return answer;
    }
}