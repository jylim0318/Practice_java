package lecture.section01.enumtype;

public class Application {
    public static void main(String[] args) {

        Subjects subject1 = Subjects.JAVA;
//        Subjects subject2 = "다른 자료형은 넣을 수 없음";
        Subjects subject2 = Subjects.HTML;
        Subjects subject3 = Subjects.JAVA;

        if (subject1 == subject2) {
            System.out.println("두 과목은 같은 과목입니다.");
        } else {
            System.out.println("두 과목은 다른 과목입니다.");
        }

        System.out.println("subjectd1 == subject3 :" + (subject1 == subject3));


        // Switch문에 enum 사용 가능
        // 상수 이름만 작성해도 된다.
        switch (subject2) {
            case JAVA:
            case MYSQL:
            case JDBC:
                System.out.println("백엔드입니다.");
                break;
            case HTML:
            case CSS:
            case JAVASCRIPT:
                System.out.println("프론트엔드입니다.");
        }

        printSubject(subject3);
//        printSubject("문자열은 안됨!");

    }

    // Enum Type을 이용하면 컴파일단계에서 잘못된 값을 막을 수 있음.
    public static void printSubject(Subjects subject) {
        System.out.println("선택한 과목 : " + subject.name());
    }
}
