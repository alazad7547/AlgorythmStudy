package Study.Lv1.Day20201215_9;

public class Solution {
    //약수의 합

    //문제 설명
    //정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

    //제한사항
    //n은 0 이상 3000이하인 정수입니다.

    //결과 28;
    private int n = 12;

    //결과 6;
    //private int n = 5;


    //int solution(int n)
    public int solution() {
        int answer = n;
        for(int idx = 1; idx <= n/2 ; idx++){
            if(n % idx ==0 )answer += idx;
        }
        return answer;
    }

    public void GetSolution() {
        System.out.println("solution : "+solution());
    }
}
