package Study.Lv1.Day20201215_1;

public class Solution {
    //문자열 내 마음대로 정렬하기

    //문제 설명
    //문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    //s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

    //제한사항
    //str은 길이 1 이상인 문자열입니다.

    //결과 "gfedcbZ"
    private String s = "Zbcdefg";

    //public String solution(String s)
    public String solution() {
        String newS = s;
        char[] divdideS = newS.toCharArray();
        char tempChar;
        for(int thisIdx = 0; thisIdx < divdideS.length ; thisIdx++){
            for(int idx = thisIdx ; idx < divdideS.length ; idx++){
                if(divdideS[thisIdx] < divdideS[idx]){
                    tempChar = divdideS[thisIdx];
                    divdideS[thisIdx] = divdideS[idx];
                    divdideS[idx] = tempChar;
                }
            }
        }
        return String.valueOf(divdideS);
    }

    public void GetSolution() {
        System.out.println("solution : "+solution());
    }
}
