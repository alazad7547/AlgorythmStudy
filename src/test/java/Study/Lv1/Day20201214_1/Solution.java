package Study.Lv1.Day20201214_1;

import java.util.Arrays;

public class Solution {
    //나누어 떨어지는 숫자 배열

    //문제 설명
    //array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
    //divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

    //제한사항
    //arr은 자연수를 담은 배열입니다.
    //정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
    //divisor는 자연수입니다.
    //array는 길이 1 이상인 배열입니다.

    //결과 [5, 10]
    //private int[] arr = {5, 9, 7, 10};
    //private int divisor = 5;

    //결과 [1, 2, 3, 36]
    //private int[] arr = {2, 36, 1, 3};
    //private int divisor = 1;

    //결과 [-1]
    private int[] arr = {3,2,6};
    private int divisor = 10;

    public int[] Solution() {
        int tempNum = 0;
        for(int fullIdx = 0; fullIdx < arr.length ; fullIdx++){
            for(int idx = fullIdx; idx < arr.length-1 ; idx++){
                if(arr[fullIdx] > arr[idx+1]){
                    tempNum = arr[fullIdx];
                    arr[fullIdx] = arr[idx+1];
                    arr[idx+1] = tempNum;
                }
            }
        }
        int[] tempArr = new int[arr.length];
        int arrIdx = 0;
        for(int num : arr){
            if(num % divisor == 0){
                tempArr[arrIdx++] = num;
            }
        }
        int[] answer = new int[arrIdx];
        for(int idx = 0; idx < arrIdx ; idx++){
            answer[idx] = tempArr[idx];
        }
        if(arrIdx == 0){
            answer = new int[]{-1};
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    //좋은 답
    public int[] GoodResult() {
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if(answer.length == 0) answer = new int[] {-1};
        java.util.Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
