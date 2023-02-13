package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 3;
        int y = 5;
        int max = (x > y) ? x : y;
        System.out.println(max); // 5

        int min = (x < y) ? x : y;
        System.out.println(min); // 3

        boolean b = (x == y) ? true : false;
        System.out.println(b); // false

        String s = (x != y) ? "달라요" : "같아요";
        System.out.println(s); // 달라요
        
        // 내가 풀어본 퀴즈 2번
        int kid = 125;
        int kid1 = 115;
        String park = (kid > 120) ? "탑승 가능 합니다." : "탑승 불가능합니다.";
        System.out.println("키가 " + kid + "cm 이므로" + park);



    }
}
