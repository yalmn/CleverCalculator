
public class Main {

	public static void main(String[] args) {
		
		LineareAlgebra funktion = new LineareAlgebra(5, 10);

		LineareAlgebra.anzeigenLineareFunktion(funktion);
		
		System.out.println(Formelsammlung.lineareFunktionYAchsenSchnitt(funktion));
		System.out.println(Formelsammlung.lineareFunktionNullstelle(funktion));
		
		
		
		
	}

}
