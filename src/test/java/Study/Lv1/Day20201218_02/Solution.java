package Study.Lv1.Day20201218_02;

import java.util.Arrays;

public class Solution {
    //x만큼 간격이 있는 n개의 숫자

    //문제 설명
    //함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
    //다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

    //제한사항
    //x는 -10000000 이상, 10000000 이하인 정수입니다.
    //n은 1000 이하인 자연수입니다

    //결과 [2,4,6,8,10]
    private long x = 2;
    private int n = 5;

    //결과 [4,8,12]
    //private long x = 4;
    //private int n = 3;

    //결과 [-4, -8]
    //private long x = -4;
    //private int n = 2;

    //long[] solution(int x, int n)
    public long[] solution() {
        long[] answer = new long[n];
        for(int idx = 1; idx <= n ; idx++){
            answer[idx-1] = idx * x;
        }
        return answer;
    }

//    public String Goodsolution() {
//
//    }

    public void GetSolution() {
        System.out.println("solution : "+ Arrays.toString(solution()));
    }
}

