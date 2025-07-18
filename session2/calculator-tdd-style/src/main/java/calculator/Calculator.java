package calculator;

public class Calculator {

	//	Methods should catch: int, long, short, float, double

	public int sum(int a, int b) {
		return (int) (a+b);
	}

	public short sum(short a, short b) {
		return (short) (a+b);
	}

	public long sum(long a, long b) {
		return (long) Long.sum(a,b);
	}

	public float sum(float a, float b) {
		return (float) (a+b);
	}

	public double sum(double a, double b) {
		return (double) (a+b);
	}
	public int difference(int a, int b) {
		return (int) (a-b);
	}
	public short difference(short a, short b) {
		return (short) (a-b);
	}
	public long difference(long a, long b) {
		return (long) (a-b);
	}
	public float difference(float a, float b) {
		return (float) (a-b);
	}
	public double difference(double a, double b) {
		return (double) (a-b);
	}

	public int product(int a, int b) {
		return (int) (a * b);
	}

	public short product(short a, short b) {
		return (short) (a * b);
	}

	public long product(long a, long b) {
		return (long) (a * b);
	}

	public float product(float a, float b) {
		return (float) (a * b);
	}

	public double product(double a, double b) {
		return (double) (a * b);
	}

	public double quotient(double a, double b) {
//		try {
			return a / b;
//		} catch (ArithmeticException e) {
//			System.out.println("this causes an error");
//			e.printStackTrace();
//			throw new ArithmeticException();
//		}
	}

}
