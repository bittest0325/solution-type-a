package problem03;

// 사각형
public class Rectangle extends Shape implements Resizable {
	// 가로
	private double width;
	// 세로
	private double height;

	// 생성자
	public Rectangle(double width, double height) {
		System.out.println("");
		this.width = width;
		this.height = height;
	}

	// width와 height를 인자(rate)를 곱한 값으로 변경
	@Override
	public void resize(double rate) {
		width = width * rate;
		height = height * rate;
	}

	// 사각형 넓이
	@Override
	public double getArea() {
		return (double) width * height;
	}

	// 사각형 둘레
	@Override
	public double getPerimeter() {
		return (double) width*2 + height*2;
	}
}