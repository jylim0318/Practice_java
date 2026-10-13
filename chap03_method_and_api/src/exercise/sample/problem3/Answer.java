package exercise.sample.problem3;

import java.util.Scanner;

public class Answer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수 입력 : ");
        int firstNumber = scanner.nextInt();

        System.out.print("두 번째 정수 입력 : ");
        int secondNumber = scanner.nextInt();

        Answer calculator = new Answer();

        int additionResult = calculator.add(firstNumber, secondNumber);
        int subtractionResult = calculator.subtract(firstNumber, secondNumber);
        int multiplicationResult = calculator.multiply(firstNumber, secondNumber);
        double divisionResult = calculator.divide(firstNumber, secondNumber);

        System.out.println("덧셈 결과 : " + additionResult);
        System.out.println("뺄셈 결과 : " + subtractionResult);
        System.out.println("곱셈 결과 : " + multiplicationResult);
        System.out.println("나눗셈 결과 : " + divisionResult);
    }

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(int firstNumber, int secondNumber) {
        return (double) firstNumber / secondNumber;
    }
}
