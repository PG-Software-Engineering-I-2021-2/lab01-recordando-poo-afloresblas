package main.java;

public class Automovil extends Vehiculo{
    public Automovil(double capacidadCombustible, double cantidadCombustible, double consumoPorKilometro) {
        super(capacidadCombustible, cantidadCombustible, consumoPorKilometro);
    }

    @Override
    public void abastecer(double combustible) {
        if (combustible + this.cantidadCombustible <= this.capacidadCombustible) {
            super.abastecer(combustible);
            System.out.println("La cantidad de combustible del automóvil es: " + String.format("%.2f", this.cantidadCombustible));
        } else {
            System.out.println("Automóvil no se puede reabastecer el tanque, está lleno.");
        }
    }
}