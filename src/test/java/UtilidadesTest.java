import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UtilidadesTest {


    @Test
    @DisplayName("La multiplicacion funciona correctamente")
    void multiply_numbersWithinRange_OK() {
        assertEquals(20, Utilidades.multiply(2, 10));
    }

    @Test
    @DisplayName("La multiplicacion se sale del rango")
    void multiply_numbersOutOfRange_ThrowsException() {
        assertThrows(ArithmeticException.class, () -> Utilidades.multiply(Integer.MAX_VALUE, 10));
    }
}
