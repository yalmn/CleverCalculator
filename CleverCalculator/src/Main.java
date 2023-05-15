import java.text.BreakIterator;
import java.util.Date;


public class Main {

	public static void main(String[] args) {
		
		LineareAlgebra fx = new LineareAlgebra(-3, 2);
		LineareAlgebra gx = new LineareAlgebra(2, -3);
		
		Tupel p1 = new Tupel(3, 6);
		Tupel p2 = new Tupel(4, 1);
				
		Tupel.anzeigenTupel(Formelsammlung.lineareFunktionSchnittpunktZweiGleichungen(fx, gx));
	}
	
}
