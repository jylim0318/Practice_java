package lecture.section02.looping;

public class D_continue {

    public void SampleContinue() {

        /*
        * continue
        * - 반복문 내에서 사용된다.
        * - 해당 반복문의 회차를 중간에 멈추고 증감식으로 넘어가게 한다.
        * */
        for (int i = 0; i < 5; i++) {

            if (i == 3) {
                continue;
            }

            System.out.println(i);
        }

        System.out.println("반복문 종료됨..");
    }
}
