
public class Tupel {

	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Tupel(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public static void anzeigenTupel(Tupel tupel) {
		System.out.println("(" + tupel.x + "|" + tupel.y + (")"));
	}

}
