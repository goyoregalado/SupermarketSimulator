import com.digitalcastaway.supermarket.Box;
import com.digitalcastaway.supermarket.Persona;
import com.digitalcastaway.supermarket.Producto;
import com.digitalcastaway.utils.SupermarketUtils;

public class Main {

    public static void main(String[] args) {

        Box caja = Box.generarBox();

        for (int i = 0; i < 6; i++) {
            Persona cliente = Persona.generatePersona();
            caja.ponerEnCola(cliente);
        }

        for (int i = 0; i < 6; i++) {
            caja.atenderCliente();
        }
    }
}
