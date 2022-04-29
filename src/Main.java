import com.digitalcastaway.supermarket.Persona;
import com.digitalcastaway.supermarket.Producto;
import com.digitalcastaway.utils.SupermarketUtils;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            System.out.println(Producto.generarProducto());

        }
    }
}
