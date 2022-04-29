import com.digitalcastaway.supermarket.Persona;
import com.digitalcastaway.utils.SupermarketUtils;

public class Main {

    public static void main(String[] args) {

        Persona cesar = Persona.generatePersona();

        System.out.println(cesar.getNombre());
    }
}
