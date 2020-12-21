package Study.Lv1.Day20201216_03;

import java.util.Arrays;

public class Solution {
    //정수 내림차순으로 배치하기

    //문제 설명
    //함수 solution은 정수 n을 매개변수로 입력받습니다.
    //n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
    //예를들어 n이 118372면 873211을 리턴하면 됩니다.

    //제한사항
    //n은 1이상 8000000000 이하인 자연수입니다.

    //결과 873211;
    private long n = 118372;


    //long solution(long n)
    public long solution() {
        String[] strArr = String.valueOf(n).split("");

        String tempLong;

        for(int fullIdx = 0; fullIdx< strArr.length;fullIdx++){
            for (int subIdx = fullIdx+1; subIdx < strArr.length; subIdx++){
                if(strArr[fullIdx].compareTo(strArr[subIdx]) < 0){
                    tempLong = strArr[fullIdx];
                    strArr[fullIdx] = strArr[subIdx];
                    strArr[subIdx] = tempLong;
                }
            }
        }
        tempLong = "";
        for(String num : strArr){
            tempLong += num;
        }
        return Long.parseLong(tempLong);
    }

    public void GetSolution() {        System.out.println("solution : "+ solution());
    }
}
