public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil(100, 10, 0.9);
        auto.abastecer(90);
        auto.abastecer(100);
        auto.viajar(4);

        Camion camion = new Camion(100, 10, 0.9);
        camion.abastecer(90);
        camion.abastecer(100);
        camion.viajar(12);
    }
}
