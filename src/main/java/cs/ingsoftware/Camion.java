package cs.ingsoftware;

public class Camion extends Vehiculo {
    public Camion(double capacidadCombustible, double cantidadCombustible, double consumoPorKilometro) {
        super(capacidadCombustible, cantidadCombustible, consumoPorKilometro);
    }

    @Override
    public String abastecer(double combustible) {
        if (combustible + this.cantidadCombustible <= this.capacidadCombustible) {
            this.cantidadCombustible += (combustible * 0.95);
            return "La cantidad de combustible del camion es: " + String.format("%.2f", this.cantidadCombustible);
        } else {
            return "Camion no puede reabastecer el tanque, esta lleno";
        }
    }
}