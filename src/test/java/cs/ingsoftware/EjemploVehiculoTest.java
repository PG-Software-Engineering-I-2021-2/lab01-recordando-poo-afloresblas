package cs.ingsoftware;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.logging.Logger;
import java.io.IOException;
import static cs.ingsoftware.EjemploVehiculo.*;

public class EjemploVehiculoTest {
    //
    @Test
    public void Test01(){
        Vehiculo bmw = new Automovil(100, 100, 0.9);
        Assert.assertEquals(bmw.abastecer(500),"Automovil no puede reabastecer el tanque, esta lleno");
    }

    @Test
    public void Test02(){
        Vehiculo alfaRomeo = new Automovil(3, 2, 0.9);
        Assert.assertEquals(alfaRomeo.abastecer(1),"La cantidad de combustible del automovil es: 3.00");
    }

    @Test
    public void Test03(){
        Vehiculo alfaRomeo = new Automovil(3, 2, 0.9);
        Assert.assertEquals(alfaRomeo.abastecer(5),"Automovil no puede reabastecer el tanque, esta lleno");
    }

    @Test
    public void Test04(){
        Vehiculo alfaRomeo = new Automovil(3, -1, 0.9);
        Assert.assertEquals(alfaRomeo.abastecer(-1),"La cantidad de combustible del automovil es: -2.00");
    }

    @Test
    public void Test05(){
        Vehiculo alfaRomeo = new Automovil(3, 2, 0.9);
        Assert.assertEquals(alfaRomeo.viajar(50),"Automovil necesita reabastecimiento de combustible");
    }

    //
    @Test
    public void Test06(){
        Vehiculo nissan = new Automovil(100, 10, 0.9);
        Assert.assertEquals(nissan.viajar(40),"Automovil necesita reabastecimiento de combustible");
    }

    //
    @Test
    public void Test07(){
        Vehiculo nissan = new Automovil(100, 10, 0.9);
        Assert.assertEquals(nissan.viajar(4),"Automovil viajo 4.0 km y aun tiene 6.40 de combustible");
    }

    //
    @Test
    public void Test08(){
        Vehiculo nissan = new Automovil(15, 0, 0.9);
        Assert.assertEquals(nissan.abastecer(4),"La cantidad de combustible del automovil es: 4.00");
    }

    //
    @Test
    public void Test09(){
        Vehiculo mack = new Camion(100, 100, 0.9);
        Assert.assertEquals(mack.viajar(40),"Camion viajo 40.0 km y aun tiene 64.00 de combustible");
    }

    //
    @Test
    public void Test10(){
        Vehiculo international = new Camion(3, 2, 0.9);
        Assert.assertEquals(international.abastecer(1),"La cantidad de combustible del camion es: 2.95");
    }

    //
    @Test
    public void Test11(){
        Vehiculo international = new Camion(80, 80, 0.9);
        Assert.assertEquals(international.abastecer(1),"Camion no puede reabastecer el tanque, esta lleno");
    }

    @Test
    public void Test12(){
        Vehiculo international = new Camion(100, 0, 0.9);
        Assert.assertEquals(international.abastecer(1),"La cantidad de combustible del camion es: 0.95");
    }


    @Test(invocationCount = 80, threadPoolSize = 80)
    public void Test13(){
        Vehiculo mack = new Camion(100, 10, 0.9);
        Assert.assertEquals(mack.viajar(500),"Camion necesita reabastecimiento de combustible");
    }

}
