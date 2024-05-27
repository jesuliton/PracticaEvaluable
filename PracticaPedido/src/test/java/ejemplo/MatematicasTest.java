package ejemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MatematicasTest {
 @Test
	void sumaTest() {
	 int resultado_esperado=5;
    	 int resultado = Matematicas.sumar(2,3);
    	assertEquals(resultado_esperado,resultado);
       }

private void assertEquals(int resultado_esperado, int resultado) {
	// TODO Auto-generated method stub
	
}
}
