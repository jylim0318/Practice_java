package lecture.section01.array;

public class Application4 {

    public static void main(String[] args) {
        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

//        System.out.println("shapes = " + shapes[0]);
//        System.out.println("cardNumbers[0] = " + cardNumbers[0]);

        // MATH 난수발생시키는 random() 뽑은 카드를 출력해보세요
        // 0~1
        // 최대로나올수있는수
        // 0.99xxxxx * 5  => 4.9...x

        int shapeIndex = (int)(Math.random()* shapes.length); // 0 ~ 3
        int cardNumIndex = (int)(Math.random()* cardNumbers.length); // 0 ~ 13


        // 출력결과 : 당신이 뽑은 카드는 DIAMOND 5 카드 입니다.
        System.out.println(
                "당신이 뽑은 카드는 " + shapes[shapeIndex] + " " + cardNumbers[cardNumIndex]
                        + " 카드 입니다");
    }


    
}