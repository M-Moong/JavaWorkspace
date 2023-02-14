package chap_07;

public class _Quiz_07 {
    public static void main(String[] args) {
        HamBurger[] HamBurgers = new HamBurger[3];
        HamBurgers[0] = new HamBurger();
        HamBurgers[1] = new Cheeseburger();
        HamBurgers[2] = new Shrimpburger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("----------------------");
        for (HamBurger HamBurger :
                HamBurgers) {
            HamBurger.cook();
            System.out.println("----------------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}

class HamBurger {
    public String name;

    public HamBurger(String name) {
        this.name = name;
    }

    public HamBurger() {
        this("햄버거");
    }

    public void cook() {
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }
}

class Cheeseburger extends HamBurger {
    public Cheeseburger() {
        super("치즈버거");
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 치즈");
    }
}

class Shrimpburger extends HamBurger {
    public Shrimpburger() {
        super("새우버거");
    }

    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }
}

