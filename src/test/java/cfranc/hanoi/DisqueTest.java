package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {

	@Test
	public void testCompareTo() {
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		Disque grand = new Disque(3);
		assertEquals("petit.compareTo(moyen)",-1, petit.compareTo(moyen));
		assertEquals("moyen.compareTo(grand)",-1, moyen.compareTo(grand));
		// TODO : Ã  complÃ©ter
		assertEquals("petit.compareTo(grand)",-1, petit.compareTo(grand));

		assertEquals("grand.compareTo(moyen)",1, grand.compareTo(moyen));
		assertEquals("moyen.compareTo(petit)",1, moyen.compareTo(petit));
		assertEquals(moyen.compareTo(petit),1, grand.compareTo(petit));

		assertEquals("petit.compareTo(petit)",0, petit.compareTo(petit));
		assertEquals("moyen.compareTo(moyen)",0, moyen.compareTo(moyen));
		assertEquals("grand.compareTo(grand)",0, grand.compareTo(grand));
	}

}
