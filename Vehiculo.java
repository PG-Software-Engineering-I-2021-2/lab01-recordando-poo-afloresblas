public class Vehiculo {
    protected double capacidadCombustible;
    protected double cantidadCombustible;
    protected double consumoPorKilometro;

    public Vehiculo(double capacidadCombustible, double cantidadCombustible, double consumoPorKilometro) {
        this.capacidadCombustible = capacidadCombustible;
        this.cantidadCombustible = cantidadCombustible;
        this.consumoPorKilometro = consumoPorKilometro;
    }

    public void abastecer(double combustible) {
        this.cantidadCombustible += combustible;
    }

    public void viajar(int distancia) {
        double combustibleRequerido = this.consumoPorKilometro * distancia;
        if (combustibleRequerido > this.cantidadCombustible) {
            System.out.println("Automovil necesita reabastecimiento de combustible");
        } else {
            this.cantidadCombustible -= combustibleRequerido;
            System.out.println("Autmovil viajo " + distancia + " km y aun tiene " + this.cantidadCombustible + " de combustible");
        }
    }
}
