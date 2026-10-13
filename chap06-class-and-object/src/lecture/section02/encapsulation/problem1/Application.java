package lecture.section02.encapsulation.problem1;

public class Application {

    public static void main(String[] args) {

        /*
        * 캡슐화
        * -  선언한 필드대로 공간은 생성되어있지만 직접 접근 못하고
        *    public으로 접근을 허용한 메소드만 이용 할 수 있도록 하는 것
        * */
        Monster monster1 = new Monster(); // 인스턴스화

        // 필드에 직접 접근한다
//        monster1.name = "두치"; // private으로 선언되어 직접 접근을 할 수 없음.
        monster1.setName("두치");

//        monster1.hp = -200; // 실수

        // 객체의 메소드를 호출
        monster1.setHp(200);
//        monster1.hp = -200; // 접근이 안됨

//        System.out.println("monster1.name = " + monster1.name);
        /*
        * setter와 getter는 public으로 선언되어 접근 가능
        * */
        System.out.println("monster1.name = " + monster1.getName());
        System.out.println("monster1.hp = " + monster1.getHp());
    }
}
