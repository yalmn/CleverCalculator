
public class LineareAlgebra {

	private int y;
	private int m;
	private int x;
	private int b;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public LineareAlgebra(int m, int b) {
		super();
		this.m = m;
		this.b = b;
	}
	
	
	public static void anzeigenLineareFunktion(LineareAlgebra funktion) {
		System.out.println("f(x) = " + funktion.m + "x " + "+ " + funktion.b);
	}

}
