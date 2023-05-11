public class GanzzahligeOperationen {

	public static final String NICHTGANZZAHLIGTEILBAR = "Operation kann nicht ganzzahlig geteilt werden.";

	private char operation;
	
	public GanzzahligeOperationen() {}

	public GanzzahligeOperationen(char operation) {
		super();
		this.operation = operation;
	}

	public char getOperation() {
		return operation;
	}

	public void setOperation(char operation) {
		this.operation = operation;
	}

	public static void anzeigenOperation(GanzzahligeOperationen operationen) {
		System.out.println(operationen.operation);
	}

	public static int quadrieren(int i) {
		return i * i;
	}

	public static int wurzelziehen(int i) {
		for (int j = 1; j <= i; j++) {
			if (i / j == j) {
				return j;
			}
		}
		throw new IllegalArgumentException(NICHTGANZZAHLIGTEILBAR);
	}

}
