package Study.Lv1.Day20201215_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    //문자열 내 마음대로 정렬하기

    //문제 설명
    //문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    //s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

    //제한사항
    //str은 길이 1 이상인 문자열입니다.

    //결과 "false"
    //private String s = "a234";

    //결과 "true"
    private String s = "1234";

    //public boolean solution(String s)
    public boolean solution() {
        Pattern chkPattern = Pattern.compile("^\\d{4}$|^\\d{6}$");;
        Matcher chkMatcher = chkPattern.matcher(s);
        if(chkMatcher.find()){
            return true;
        }
        else{
            return false;
        }
    }

    public void GetSolution() {
        System.out.println("solution : "+solution());
    }
}
