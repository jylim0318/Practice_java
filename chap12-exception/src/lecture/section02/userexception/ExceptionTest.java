package lecture.section02.userexception;

import lecture.section02.userexception.exception.MoneyNegativeException;
import lecture.section02.userexception.exception.NegativeException;
import lecture.section02.userexception.exception.NotEnoughMoneyException;
import lecture.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws NegativeException, NotEnoughMoneyException {

        // 상품 가격은 음수일 수 없다. -> 예외
        if(price < 0 ) {
            throw new PriceNegativeException("(ExceptionTest)PriceNegativeException 발생!");
        }

        // 내가 가진돈이 음수일 수 없다. -> 예외
        // MoneyNegativeException
        if(money < 0 ) {
            throw new MoneyNegativeException("(ExceptionTest)MoneyNegativeException 발생!");
        }

        // price가 money보다 작은지?
        if(price > money) {

            throw new NotEnoughMoneyException("돈이 부족합니다");
        }
        // 가진돈이 더 적으면 NotEnoughMoneyException을 발생시킨다.
        // NotEnoughMoneyException 은 message에 "돈이 부족합니다"을 저장
        // main 메서드에서 catch문으로 NotEnoughMoneyException을 예외가 발생했을때 message를 출력한다.
    }
}
