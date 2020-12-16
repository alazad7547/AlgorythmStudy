package Study.Lv1.Day20201215_7;

public class Solution {
    //시저 암호

    //문제 설명
    //어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
    //예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. z는 1만큼 밀면 a가 됩니다.
    //문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

    //제한사항
    //공백은 아무리 밀어도 공백입니다.
    //s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
    //s의 길이는 8000이하입니다.
    //n은 1 이상, 25이하인 자연수입니다.

    //결과 "BC";
    //private String s = "AB";
    //private int n = 1;

    //결과 "a";
    //private String s = "z";
    //private int n = 1;

    //결과 "e F d";
    private String s = "a B z";
    private int n = 4;


    //String solution(String s, int n)
    public String solution() {
        String answer = "";
        for(int idx=0;idx < s.length(); idx++){
            int asciiNum = (int)(s.charAt(idx));
            if(65 <= asciiNum && asciiNum <=90){
                asciiNum = asciiNum + n > 90 ? 65 + (asciiNum + n - 90)-1 : asciiNum + n;
            }
            else if(97 <= asciiNum && asciiNum <=122){
                asciiNum = asciiNum + n > 122 ? 97 + (asciiNum + n - 122 )-1: asciiNum + n;
            }
            answer += (char)(asciiNum);
        }
        return answer;
    }

    public void GetSolution() {
        System.out.println("solution : "+solution());
    }
}
