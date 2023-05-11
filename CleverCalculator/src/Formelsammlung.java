
public class Formelsammlung extends GanzzahligeOperationen{

	private LineareAlgebra funktionAlgebra;
	private Bruch bruch;

	public LineareAlgebra getFunktionAlgebra() {
		return funktionAlgebra;
	}

	public void setFunktionAlgebra(LineareAlgebra funktionAlgebra) {
		this.funktionAlgebra = funktionAlgebra;
	}

	public Bruch getBruch() {
		return bruch;
	}

	public void setBruch(Bruch bruch) {
		this.bruch = bruch;
	}
	
	public Formelsammlung() {}
	
	public static int lineareFunktionYAchsenSchnitt(LineareAlgebra funktion) {
		int yAS = funktion.getM() * 0 + funktion.getB();
		return yAS; 
	}
	
	public static int lineareFunktionNullstelle(LineareAlgebra funktion) {
		int y = 0;
		
		if(funktion.getB() == 0) {
			return 0;
		}else if (funktion.getB() < 0 && funktion.getM() != 0) {
			y = + funktion.getB() / funktion.getM();
		}else {
			if(funktion.getM() != 0) {
				y = - funktion.getB() / funktion.getM();
			}
		}
		
		return y; 
		
		
	}
	
	
	
	

}
