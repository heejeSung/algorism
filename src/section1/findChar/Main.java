package section1.findChar;

import java.util.Scanner;

// a가 몇개 인지 찾기, 대소문자는 구분하지 않음
// AsianGame
// a
public class Main {

    public int solution(String str, char c){
        int answer = 0;
        str.toUpperCase();
        Character.toUpperCase(c);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main result = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(result.solution(str, c));
    }
}
