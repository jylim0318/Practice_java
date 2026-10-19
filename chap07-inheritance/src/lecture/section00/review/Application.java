package lecture.section00.review;

public class Application {

    /*
    * static
    * - 정적
    * - JVM에 클래스로드가 일어날때 static 영역에 같이 등록된다.
    * */
    public static void main(String[] args) {

        Person person = new Person("태근", 20);
        Person person2 = new Person();

        person.introduce();
        person2.introduce();

        System.out.println(person.getName());

        String personName = person.getName();

        Application app = new Application();
        app.testMethod1(); // 일반메소드 호출

        // 클래스명.정적메소명()
        Application.testMethod2();


        // 상속
        person.toString();
    }

    public String testMethod1() {

        return "일반 메서드입니다.";
    }

    public static String testMethod2() {

        return "정적 메서드입니다.";
    }
}
