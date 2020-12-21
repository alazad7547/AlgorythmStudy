package Study.Lv1.Day20201217_05;

import java.util.Arrays;

public class Solution {
    //핸드폰 번호 가리기
    //도움말

    //문제 설명
    //프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
    //전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

    //제한사항
    //x는 1 이상, 10000 이하인 정수입니다.

    //결과 "*******4444";
    private String phone_number = "01033334444";

    //결과 "*****8888";
    //private String phone_number = "027778888";


    //String solution(String phone_number)
    public String solution() {
        char[] chars = phone_number.toCharArray();
        int needNum = 4;
        for(int idx = 0 ; idx < chars.length-needNum; idx++ ){
            chars[idx] = '*';
        }
        return String.valueOf(chars);
    }

    public String Goodsolution() {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }

    public void GetSolution() {
        System.out.println("solution : "+ Goodsolution());
    }
}

