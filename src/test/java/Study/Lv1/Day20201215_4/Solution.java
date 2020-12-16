package Study.Lv1.Day20201215_4;

import java.util.*;

public class Solution {
        //소수 찾기

        //문제 설명
        //1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
        //소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
        //(1은 소수가 아닙니다.)

        //제한사항
        //n은 2이상 1000000이하의 자연수입니다.

        //결과 4;
        private int n = 10;

        //결과 3;
        //private int n = 5;


        //public int solution(int n)
        public int solution() {
            int answer = 0;
            int multi=0;
            int[] numArr = new int[n+1];
            for(int idx = 0 ; idx <= n ; idx++){
                numArr[idx] = idx;
            }
            numArr[1] = 0;

            for(int thisNum : numArr){
                if(thisNum != 0){
                    answer++;
                    multi = 2;
                    while(multi * thisNum <= n){
                        numArr[multi * thisNum] = 0;
                        multi++;
                    }
                }
            }
            return answer;
        }

        public void GetSolution() {
            System.out.println("solution : "+solution());
        }
}
