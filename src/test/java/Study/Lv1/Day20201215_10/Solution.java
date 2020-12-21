package Study.Lv1.Day20201215_10;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class Solution {
    //이상한 문자 만들기

    //문제 설명
    //문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
    //각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

    //제한사항
    //문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
    //첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.

    //결과 "TrY HeLlO WoRlD";
    //private String s = "try hello world";

    //결과 "HeLlO EvErYoNe";
    private String s = "Hello  eVeryone";



    //String solution(String s)
    public String solution() {
        String answer = "";

        String str[] = s.split("");
        String space = " ";
        int cnt = 0;

        for(int i = 0; i < str.length; i++){
            if(str[i].equals(space)){
                cnt = 0;
            }else{
                if(cnt % 2 == 0){
                    cnt++;
                    str[i] = str[i].toUpperCase();
                }else{
                    cnt++;
                    str[i] = str[i].toLowerCase();
                }
            }
            answer += str[i];
        }
        return answer;
    }

    public void GetSolution() {
        System.out.println("solution : "+solution());
    }
}
