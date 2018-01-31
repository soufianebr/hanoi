package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	@Test
	public void testDisqueDansTourVide() 
    {
        Tour t = new Tour(3);
        Disque d = new Disque(1);
        boolean b = t.empiler(d);
        assertEquals(true, b);
	}

	
    public void testDisquesDansTourVide()
    {
        Tour t = new Tour(3);
        Disque d1 = new Disque(2);
        Disque d2 = new Disque(1);
        boolean b1 = t.empiler(d1);
        boolean b2 = t.empiler(d2);
        assertEquals(true, b1);
        assertEquals(true, b2);
    }
    
    public void testTourPleine()
    {
        Tour t = new Tour(1);
        Disque d1 = new Disque(2);
        Disque d2 = new Disque(1);
        t.empiler(d1);
        boolean b = t.empiler(d2);
        assertEquals(false, b);
    }
    
    public void testDiametreSuperieur()
    {
        Tour t = new Tour(3);
        Disque d1 = new Disque(2);
        Disque d2 = new Disque(3);
        t.empiler(d1);
        boolean b = t.empiler(d2);
        assertEquals(false, b);
    }
    
    public void testDiametreSuperieurTourPleine()
    {
        Tour t = new Tour(1);
        Disque d1 = new Disque(2);
        Disque d2 = new Disque(3);
        t.empiler(d1);
        boolean b = t.empiler(d2);
        assertEquals(false, b);
    }

}
