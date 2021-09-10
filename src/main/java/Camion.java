package main.java;

public class Camion extends Vehiculo{
    public Camion(double capacidadCombustible, double cantidadCombustible, double consumoPorKilometro) {
        super(capacidadCombustible, cantidadCombustible, consumoPorKilometro);
    }

    @Override
    public void abastecer(double combustible) {
        if (combustible + this.cantidadCombustible <= this.capacidadCombustible) {
            this.cantidadCombustible += (combustible * 0.95);
            System.out.println("La cantidad de combustible del camión es: " + String.format("%.2f", this.cantidadCombustible));
        } else {
            System.out.println("Camión no se puede reabastecer el tanque, está lleno.");
        }
    }
}