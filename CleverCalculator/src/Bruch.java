public class Bruch {

	public static final String DIVBYZERO = "Div by zero.";

	private int zaehler;
	private int nenner;

	public int getZaehler() {
		return zaehler;
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public void setNenner(int nenner) {
		this.nenner = nenner;
	}

	public Bruch(int zaehler, int nenner) {
		super();
		this.zaehler = zaehler;
		this.nenner = nenner;
	}

	public static void anzeigenBruch(Bruch bruch) {
		System.out.println(bruch.zaehler + "/" + bruch.nenner);
	}

	public static Bruch kuerzeBruch(Bruch bruch) {
		int ggT = ggT(bruch.zaehler, bruch.nenner);
		return new Bruch(bruch.zaehler / ggT, bruch.nenner / ggT);
	}

	public static Bruch addiereBrueche(Bruch ersterBruch, Bruch zweiterBruch) {
		if (ersterBruch.nenner == 0 || zweiterBruch.nenner == 0) {
			throw new IllegalArgumentException(DIVBYZERO);
		} else {
			int zaehlerBruch = (ersterBruch.zaehler * zweiterBruch.nenner)
					+ (zweiterBruch.zaehler * ersterBruch.nenner);
			int nennerBruch = (ersterBruch.nenner * zweiterBruch.nenner);

			return new Bruch(zaehlerBruch, nennerBruch);
		}
	}

	public static Bruch subtraktBrueche(Bruch ersterBruch, Bruch zweiterBruch) {
		if (ersterBruch.nenner == 0 || zweiterBruch.nenner == 0) {
			throw new IllegalArgumentException(DIVBYZERO);
		} else {
			int zaehlerBruch = (ersterBruch.zaehler * zweiterBruch.nenner)
					- (zweiterBruch.zaehler * ersterBruch.nenner);
			int nennerBruch = (ersterBruch.nenner * zweiterBruch.nenner);

			return new Bruch(zaehlerBruch, nennerBruch);
		}
	}

	public static Bruch multipliziereBrueche(Bruch ersterBruch, Bruch zweiterBruch) {
		if (ersterBruch.nenner == 0 || zweiterBruch.nenner == 0) {
			throw new IllegalArgumentException(DIVBYZERO);
		} else {
			int zaehlerBruch = (ersterBruch.zaehler * zweiterBruch.zaehler);
			int nennerBruch = (ersterBruch.nenner * zweiterBruch.nenner);

			return new Bruch(zaehlerBruch, nennerBruch);
		}
	}

	public static Bruch dividiereBrueche(Bruch ersterBruch, Bruch zweiterBruch) {
		if (ersterBruch.nenner == 0 || zweiterBruch.nenner == 0) {
			throw new IllegalArgumentException(DIVBYZERO);
		} else {
			int zaehlerBruch = (ersterBruch.zaehler * zweiterBruch.nenner);
			int nennerBruch = (ersterBruch.nenner * zweiterBruch.zaehler);

			return new Bruch(zaehlerBruch, nennerBruch);
		}
	}

	public static int ggT(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return ggT(b, a % b);
		}
	}

}
