package Study.Lv1.Day20201214_2;

import java.util.Arrays;

public class Solution {
    //두 정수 사이의 합

    //문제 설명
    //두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
    //예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

    //제한사항
    //a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
    //a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
    //a와 b의 대소관계는 정해져있지 않습니다.

    //결과 12
    //private int a = 3;
    //private int b = 5;

    //결과 3
    private int a = 3;
    private int b = 3;

    //결과 12
    //private int a = 5;
    //private int b = 3;

    public long solution() {
        long answer = 0;
        int big = 0;
        int small = 0;
        if(a == b){
            return a;
        }
        else if(a > b){
            big = a;
            small = b;
        }
        else{
            big = b;
            small = a;
        }

        for(int idx = small ; idx <= big; idx ++){
            answer += idx;
        }

        return answer;
    }

    public void GetSolution() {
        System.out.println(solution());
    }
}
