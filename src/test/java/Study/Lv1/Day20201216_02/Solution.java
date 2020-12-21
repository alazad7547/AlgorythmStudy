package Study.Lv1.Day20201216_02;

import java.util.Arrays;

public class Solution {
    //자연수 뒤집어 배열로 만들기

    //문제 설명
    //자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
    // 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

    //제한사항
    //N의 범위 : 100,000,000 이하의 자연수

    //결과 [5,4,3,2,1];
    private int n = 12345;


    //int[] solution(long n)
    public int[] solution() {
        String[] num = String.valueOf(n).split("");
        int[] answer = new int[num.length];
        int std = answer.length-1;
        for(int idx = 0;idx < num.length;idx++){
            answer[idx] = Integer.parseInt(num[std-idx]);
        }

        return answer;
    }

    public void GetSolution() {
        System.out.println("solution : "+ Arrays.toString(solution()));
    }
}
