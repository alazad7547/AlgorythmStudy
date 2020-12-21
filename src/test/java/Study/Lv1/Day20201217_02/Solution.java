package Study.Lv1.Day20201217_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    //최대공약수와 최소공배수

    //문제 설명
    //두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
    //배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
    //예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

    //제한사항
    //두 수는 1이상 1000000이하의 자연수입니다.

    //결과 [3, 12];
    //private int n = 3;
    //private int m = 12;

    //결과 [1, 10];
    private int n = 2;
    private int m = 5;

    //int[] solution(int n, int m)
    public int[] solution() {
        int max;
        int min;
        int temp;
        if(n > m){
            max = n;
            min = m;
        }
        else{
            max = m;
            min = n;
        }

        int divideNum;
        //유클리드 호제법
        //https://ko.wikipedia.org/wiki/%EC%9C%A0%ED%81%B4%EB%A6%AC%EB%93%9C_%ED%98%B8%EC%A0%9C%EB%B2%95
        while(true) {
            if (max % min != 0) {
                temp = max % min;
                max = min;
                min = temp;
            } else {
                divideNum = min;
                break;
            }
        }
        return new int[]{divideNum,(m*n) / divideNum};
    }

    public void GetSolution() {
        System.out.println("solution : "+ Arrays.toString(solution()));
    }
}

