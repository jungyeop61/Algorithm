class Solution {
    public int solution(int n) {
        int num = 1;
        int count = 0;
        //반복문으로 팩토리얼 구현해서 이 숫자가 n보다 마지막으로 작을 때 마지막 숫자를 구한다.
        while (num<=n){
            count++;
            num= num *(count);
        }
        count--;
        return count;
    }
}