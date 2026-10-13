package lecture.section01.extend;

/*
* Car 클래스를 상속받아서 오버라이딩을 해보자!
* 레이싱카는 멈출수가 없다
* run() -> "레이싱카가 질주합니다!!" 출력 바꾸기
* soundHorn() -> "레이싱카는 경적을 울리지 않습니다" 로 출력하기
* stop() -> 상태 안바꾸기
* */
public class RacingCar extends Car {

    @Override
    public void soundHorn() {
        System.out.println("레이싱카는 경적을 울리지 않습니다.");
    }

    @Override
    public void run() {
        System.out.println("레이싱카가 질주합니다!!");
    }

    @Override
    public void stop() {

        System.out.println("레이싱카가 멈춥니다.");

    }


}
