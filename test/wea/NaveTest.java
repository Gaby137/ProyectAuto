package wea;

import static org.junit.Assert.*;

import org.junit.Test;

public class NaveTest {

	@Test
	public void test() {
		 Nave a1 = new Nave("Aa12", "Ford", "rojo");
		 String patente = "Ab12";
		 assertEquals(patente, a1.getPatente());
	}
	@Test
	public void test2() {
		Nave a2 = new Nave("Aa12", "Ford", "Azul");
		String color = "rojo";
		assertEquals(color, a2.getColor());
	}
}
