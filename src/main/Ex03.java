package main;

public class Ex03 {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		System.out.println(calculator.add(10, 5));
		System.out.println(calculator.subStract(10, 5));
		System.out.println(calculator.times(10, 0));
		System.out.println(calculator.divide(10, 20));
		System.out.println();
		
		Calc calculator2 = new NewCalculator();
		System.out.println(calculator2.add(10, 5));
		System.out.println(calculator2.subStract(10, 5));
		System.out.println(calculator2.times(10, 0));
		System.out.println(calculator2.divide(10, 20));
	}

}

// 새 계산기 클래스
class NewCalculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int subStract(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		if (num2 > 0) {
			return num1 * num2;
		} else
			return Calc.ERROR;
	}

	@Override
	public double divide(double num1, double num2) {
		if (num1 > num2) {
			return num1 / num2;
		} else
			return Calc.ERROR;
	}

}