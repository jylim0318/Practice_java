package lecture.section01.array;

public class Application3 {
    public static void main(String[] args) {

        // 초기화 블록
        // 기본값이외의 값으로 초기화 하고싶을때 {}블럭을 사용
        int[] iarr = {1, 4, 6, 7, 8}; // 축약
        int[] iarr2 = new int[] {1, 4, 6, 7, 8};

        for (int i = 0; i < iarr.length; i++) {
            System.out.println("i = " + i + " : " + iarr[i]);
        }

    }
}
