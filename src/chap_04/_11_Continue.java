package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // For
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 17번 손님이 노쇼
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면? (noShow)
            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }

            sold++; // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("------------------");
        // While 문
        sold = 0;
        int index = 0; // 손님 번호
        // while (index <= 50) {
        while (true) {
            index++;
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면 (noShow)
            if (index == noShow) {
                System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }

            sold++; // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");


        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");




        // 퀴즈 4번 ㅈ 망
        // 주차 요금 정산 프로그램 작성
        // 주차 요금은 시간당 4000원 (일일 최대 요금은 30000원)
        // 경차 또는 장애인 차량은 최종 요금에서 50% 할인

        // 주차 요금 예시
            // 일반 차량 5시간 주차시 20000원
            // 경차 5시간 주차시 10000원
            // 장애인 차량 10시간 주차 시 15000원

        int fee = 4000;
        int feeMax = 30000;
        int discount = fee /2 ;

        for (int i = 0; i < 20; i++) {
            if (i == 5) {
                System.out.println("일반 차량 " + i + "시간 주차시" + (i * fee) + "원");
            }



        }










    }
}
