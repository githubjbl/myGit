package ch09;

public class TriangleShape extends Shape {
	private int height;
	private int width;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public TriangleShape(int height, int width) {
		super("Triangle");
		this.height = height;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return width + (height * 0.5);
	}

	@Override
	public void draw() {
		System.out.print("가로가 " + width + ", 세로가 " + height + "인 삼각형");
		super.draw();
	}

}
