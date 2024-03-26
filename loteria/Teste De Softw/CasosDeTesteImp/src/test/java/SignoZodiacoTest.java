import org.example.SignoZodiaco;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class SignoZodiacoTest {

    private SignoZodiaco pessoa;

    @BeforeEach
    public void setUp() {
        pessoa = new SignoZodiaco();
    }

    @Test
    public void testSignoAries() {
        SignoZodiaco pessoa = new SignoZodiaco(21, 3);
        assertEquals("Áries", pessoa.getSigno());
    }


    @Test
    public void testSignoTouro() {
        SignoZodiaco pessoa = new SignoZodiaco(20, 4);
        assertEquals("Touro", pessoa.getSigno());
    }


    @Test
    public void testSignoGemeos() {
        SignoZodiaco pessoa = new SignoZodiaco(21, 5);
        assertEquals("Gêmeos", pessoa.getSigno());
    }

    @Test
    public void testSignoCancer() {
        SignoZodiaco pessoa = new SignoZodiaco(22, 6);
        assertEquals("Câncer", pessoa.getSigno());
    }

    @Test
    public void testSignoLeao() {
        SignoZodiaco pessoa = new SignoZodiaco(23, 7);
        assertEquals("Leão", pessoa.getSigno());
    }

    @Test
    public void testSignoVirgem() {
        SignoZodiaco pessoa = new SignoZodiaco(23, 8);
        assertEquals("Virgem", pessoa.getSigno());
    }

    @Test
    public void testSignoLibra() {
        SignoZodiaco pessoa = new SignoZodiaco(23, 9);
        assertEquals("Libra", pessoa.getSigno());
    }

    @Test
    public void testSignoEscorpiao() {
        SignoZodiaco pessoa = new SignoZodiaco(23, 10);
        assertEquals("Escorpião", pessoa.getSigno());
    }

    @Test
    public void testSignoSagitario() {
        SignoZodiaco pessoa = new SignoZodiaco(22, 11);
        assertEquals("Sagitário", pessoa.getSigno());
    }

    @Test
    public void testSignoCapricornio() {
        SignoZodiaco pessoa = new SignoZodiaco(22, 12);
        assertEquals("Capricórnio", pessoa.getSigno());
    }

    @Test
    public void testSignoAquario() {
        SignoZodiaco pessoa = new SignoZodiaco(20, 1);
        assertEquals("Aquário", pessoa.getSigno());
    }

    @Test
    public void testSignoPeixes() {
        SignoZodiaco pessoa = new SignoZodiaco(19, 2);
        assertEquals("Peixes", pessoa.getSigno());
    }


    @Test
    public void testGetDia() {
        SignoZodiaco pessoa = new SignoZodiaco(15, 5);
        assertEquals(15, pessoa.getDia());
    }

    @Test
    public void testGetMes() {
        SignoZodiaco pessoa = new SignoZodiaco(15, 5);
        assertEquals(5, pessoa.getMes());
    }

    @Test
    public void testSetDia() {
        SignoZodiaco pessoa = new SignoZodiaco(15, 5);
        pessoa.setDia(25);
        assertEquals(25, pessoa.getDia());
    }

    @Test
    public void testSetMes() {
        SignoZodiaco pessoa = new SignoZodiaco(15, 5);
        pessoa.setMes(8);
        assertEquals(8, pessoa.getMes());
    }

    @Test
    public void testConstrutorComDataInvalida() {
        assertThrows(IllegalArgumentException.class, () -> new SignoZodiaco(32, 5));
    }

    @Test
    public void testSetMesComMesInvalido() {
        assertThrows(IllegalArgumentException.class, () -> pessoa.setMes(13));
    }


    @Test
    public void testSetDiaComDiaInvalido() {
        SignoZodiaco pessoa = new SignoZodiaco();
        assertThrows(IllegalArgumentException.class, () -> pessoa.setDia(32));
    }

}
