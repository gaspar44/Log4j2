import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PruebaTest {
	private static int LADO_X = 5;
	private static int LADO_Y = 5;
	
	@Test
	public void PruebaAreaRectanguloTest() {
		Prueba hola = new Prueba();
		int area = hola.AreaRectangulo(LADO_X, LADO_Y);
		assertEquals(25, area);
	}
	
}