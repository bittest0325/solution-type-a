package problem03;

// 직각 삼각형
public class RectTriangle extends Shape {
	// 넓이
	private double width;
	// 높이
	private double height;

	// 생성자 정의
	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// 넓이 구하기
	@Override
	public double getArea() {
		System.out.println("");
		// 직각삼각형의 넓이 = 밑변 * 높이 / 2
		return (double) width * height / (2.0);
	}

	// 둘레 구하기
	@Override
	public double getPerimeter() {
		// 피타고라스의 정리 통한 빗변 길이 정의
		double hypotenuse = Math.sqrt( width*width + height*height );
		return width + height + hypotenuse;
	}
}
