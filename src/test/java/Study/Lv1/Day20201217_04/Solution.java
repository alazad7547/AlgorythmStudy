package Study.Lv1.Day20201217_04;

import java.util.Arrays;

public class Solution {
    //하샤드 수

    //문제 설명
    //양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
    //예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
    //자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

    //제한사항
    //x는 1 이상, 10000 이하인 정수입니다.

    //결과 true;
    //private int x = 10;

    //결과 true;
    //private int x = 12;

    //결과 false;
    private int x = 11;

    //결과 false;
    //private int x = 13;

    //boolean solution(int x)
    public boolean solution() {
        return x % String.valueOf(x).chars().map(s -> s - '0').sum() == 0 ? true :false;
    }

    public void GetSolution() {
        System.out.println("solution : "+ solution());
    }
}

