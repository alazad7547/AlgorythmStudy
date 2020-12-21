package Study.Lv1.Day20201216_01;

public class Solution {
    //이상한 문자 만들기

    //문제 설명
    //자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
    //예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

    //제한사항
    //N의 범위 : 100,000,000 이하의 자연수

    //결과 6;
    private int n = 123;

    //결과 24;
    //private int n = 987;


    //int solution(int n)
    public int solution() {
        int answer = 0;
        String[] nums = String.valueOf(n).split("");
        for(String num : nums){
            answer += Integer.parseInt(num);
        }
        return answer;
    }

    public void GetSolution() {
        System.out.println("solution : "+solution());
    }
}
