package lecture.section02.encapsulation.problem2;


public class Application2 {

    public static void main(String[] args) {

        Monster monster1 = new Monster(); // 인스턴스화

        // 필드에 직접 접근한다
        monster1.setKind("두치");
        monster1.hp = 100;


        Monster monster2 = new Monster(); // 인스턴스화

        // 필드에 직접 접근한다
        monster2.setKind("두치");
        monster2.hp = 100;

        Monster monster3 = new Monster(); // 인스턴스화

        // 필드에 직접 접근한다
        monster2.setKind("두치");
        monster3.hp = 100;
    }
}
