package lecture.section01.method;

public class Application5 {
    public static void main(String[] args) {
        
        Application5 app5 = new Application5();
        
        int result = app5.plus(5, 7, 9);
        System.out.println("result = " + result);
        System.out.println("두수를 더한 값 : " + app5.plus(5, 7,9));

        int num1 = 10;
        int num2 = 10;
        int num3 = 10;

    }


    // 두수를 받아 더하는 메소드 -> 정수를 반환
    public int plus(int x, int y, int z) {
        return x+y+z;
    }

    // 두수를 받아 빼는 메소드
    public int minus(int x, int y) {
        return x-y;
    }

    // 두수를 받아 곱하는 메소드
    public int multi(int x, int y) {
        return x*y;
    }

    // 두수를 받아 나누는(몫) 메소드
    public int divide(int x, int y) {
        return x/y;
    }

}
