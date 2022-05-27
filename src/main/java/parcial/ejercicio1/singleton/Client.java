package parcial.ejercicio1.singleton;

public class Client {
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo("754GHB", "toyota", "azul");
        Vehiculo vehiculo2 = new Vehiculo("456GHB", "nissan", "verde");
        Vehiculo vehiculo3 = new Vehiculo("753GHB", "tesla", "negro");
        Vehiculo vehiculo4 = new Vehiculo("029GHB", "tesla", "blanco");
        Vehiculo vehiculo5 = new Vehiculo("754HSD", "cat", "amarillo");
        Vehiculo vehiculo6 = new Vehiculo("754NUD", "mercedez", "azul");

        ControlPeaje.controlPeaje.cobrarPeaje(vehiculo1);
        ControlPeaje.controlPeaje.cobrarPeaje(vehiculo2);
        ControlPeaje.controlPeaje.cobrarPeaje(vehiculo3);
        ControlPeaje.controlPeaje.cobrarPeaje(vehiculo4);
        ControlPeaje.controlPeaje.cobrarPeaje(vehiculo5);
        ControlPeaje.controlPeaje.cobrarPeaje(vehiculo6);

        ControlPeaje.controlPeaje.verPeajeRecaudado();
        ControlPeaje.controlPeaje.verVehiculosQuePasaron();

    }

}
