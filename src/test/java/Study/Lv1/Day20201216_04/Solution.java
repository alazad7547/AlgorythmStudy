package Study.Lv1.Day20201216_04;

public class Solution {
    //정수 제곱근 판별

    //문제 설명
    //임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
    //n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고,
    //n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

    //제한사항
    //n은 1이상, 50000000000000 이하인 양의 정수입니다.

    //결과 144;
    private long n = 121;

    //결과 -1;
    //private int n = 3;


    //long solution(long n)
    public long solution() {
        double sqrt = Math.sqrt(n);
        if(sqrt % 1 != 0){
            return -1;
        }
        else{
            return (long) Math.pow(sqrt+1,2);
        }
    }

    public void GetSolution() {
        System.out.println("solution : "+ solution());
    }
}
