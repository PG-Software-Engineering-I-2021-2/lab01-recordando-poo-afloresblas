package cs.ingsoftware;
import java.util.logging.Logger;

public class EjemploVehiculo {
    static final Logger logger = Logger.getLogger(EjemploVehiculo.class.getName());
    public static void main(String[] args) {
        Automovil auto = new Automovil(100, 10, 0.9);
        auto.abastecer(5);
        Camion camion = new Camion(100, 10, 0.9);
        camion.abastecer(4);
    }
}