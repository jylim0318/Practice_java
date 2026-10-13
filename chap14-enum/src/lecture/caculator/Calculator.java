package lecture.caculator;

// 계산 메소드 만들어놓은 클래스
public class Calculator {

    // 기본생성자

    // double 로 리턴
    // dobule 로 매개변수 두개를 받아서 더해주는 메소드
    public double add(double firstNumber, double secondNumber) {

        return firstNumber + secondNumber;
    }

    public double divide(double firstNumber, double secondNumber) {

        // 숫자는 0으로 나눌 수없음
        // -> secondNumber가 0이라면
        // DIVIDE_BY_ZERO 하는 상수로 CalcualtorException을 발생시키자!
        if(secondNumber == 0) {
            throw new CalculatorException(CalculatorErrorCode.DIVIDE_BY_ZERO);
        }




        return firstNumber / secondNumber;
    }


}
