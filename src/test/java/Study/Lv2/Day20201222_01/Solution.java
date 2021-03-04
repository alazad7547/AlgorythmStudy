package Study.Lv2.Day20201222_01;

import java.util.*;

public class Solution {
    //주식가격

    //문제 설명
    //초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요

    //제한사항
    //prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
    //prices의 길이는 2 이상 100,000 이하입니다.

    //private int[] result = {4, 3, 1, 1, 0};
    private int[] prices = {1, 2, 3, 2, 3};

    //int[] solution(int[] prices)
    public int[] solution() {
        int[] answer = new int[prices.length];
        for(int firstIdx = 0; firstIdx < prices.length ; firstIdx++){
            boolean chk = true;
            for (int secondPrice = firstIdx+1 ; secondPrice < prices.length-1 ; secondPrice++){
                if(prices[firstIdx] > prices[secondPrice]){
                    chk = false;
                    answer[firstIdx]= secondPrice - firstIdx;
                    break;
                }
            }
            if(chk){
                answer[firstIdx]= (prices.length-1) - firstIdx;
            }
        }
        return answer;
    }

    public void GetSolution() {
        System.out.println("solution : "+ Arrays.toString(solution()));
    }
}

