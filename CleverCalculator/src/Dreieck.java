
public class Dreieck {

	private int c;
	private int a;
	private int b;
	private int h;

	public Dreieck(int c, int a, int b, int h) {
		super();
		this.c = c;
		this.a = a;
		this.b = b;
		this.h = h;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public static void anzeigenDreieck(Dreieck dreieck) {
		System.out.println("Hypotenuse: " + dreieck.c + " Kathete_a: " + dreieck.a + " Kathete_b: " + dreieck.b
				+ " Höhe: " + dreieck.h);
	}

}
