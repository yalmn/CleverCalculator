import java.nio.channels.NonReadableChannelException;
import java.text.BreakIterator;
import java.util.Date;


public class Main {

	public static void main(String[] args) {
		
		double a = 26.244;
		Bruch.anzeigenBruch(Bruch.doubleToBruch(a));
		
		
		Dreieck dreieick = new Dreieck(1, 3, 5, 7);
		Bruch flaechenInahlt = Formelsammlung.flaecheninhaltDreieck(dreieick);
		
		System.out.println("FLächeninhalt in Double: ");
		System.out.println(Bruch.convertToDouble(flaechenInahlt));
		
		Dreieck.anzeigenDreieck(dreieick);
		System.out.println("Flächeninhalt des Dreiecks: ");
		Bruch.anzeigenBruch(Formelsammlung.flaecheninhaltDreieck(dreieick));
		System.out.println("Umfang des Dreiecks: ");
		Bruch.anzeigenBruch(Formelsammlung.umfangDreieck(dreieick));
	}
	
}
