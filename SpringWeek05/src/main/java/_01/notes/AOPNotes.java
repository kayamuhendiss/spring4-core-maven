package _01.notes;

public class  AOPNotes {

	// AOP -> aspect oriented programming
	// aspect -> yon/aci/gorunus/hal/durum

	// logging, caching , security gibi ihtiyaclar crosscutting-concern olarak ifade
	// edilir.
	// bir enterprise projede olmazsa olmaz konulardandir.

	// spring document ;
	/*
	 * Aspect-Oriented Programming (AOP) complements Object-Oriented Programming
	 * (OOP) by providing another way of thinking about program structure. The key
	 * unit of modularity in OOP is the class, whereas in AOP the unit of modularity
	 * is the aspect.
	 */
	
	// AOP prensibi, OOP un bir alternativi degil ,  tamamlayicisidir.
	// AOP teknigi; sepaartion of crosscutting concern ile modulerlik saglar.
}

class ServiceLayer {
	
	public void method1() {
		log();
	}
	
	public void method2() {
		log();
	}
	
	public void method3() {
		log();
	}
	//
	//
	
	public void log() {
		
	}
}
