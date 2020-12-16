package Study.Lv1.Day20201215_5;

public class Solution {
    //수박수박수박수박수박수?
    //도움말

    //문제 설명
    //길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
    // 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.

    //제한사항
    //n은 길이 10,000이하인 자연수입니다.

    //결과 "수박수";
    private int n = 3;

    //결과 "수박수박";
    //private int n = 4;


    //String solution(int n)
    public String solution() {
        String answer = "";
        String text = "수";
        for(int idx = 0 ; idx < n ; idx++){
            answer += text;
            text = text.equals("수") ? "박" : "수";
        }
        return answer;
    }

    public void GetSolution() {
        System.out.println("solution : "+solution());
    }
}
