package parcial.ejercicio3.abstractfactory;

public class Client {
    public static void main(String[] args) {
        Artefacto television = FactoryArtefacto.make("television");
        television.setPrecio(1500);
        System.out.println(television.getPrecio());

        Artefacto radio = FactoryArtefacto.make("radio");
        radio.setPrecio(200);
        System.out.println(radio.getPrecio());

        Artefacto batidora = FactoryArtefacto.make("batidora");
        batidora.setPrecio(50);
        System.out.println(batidora.getPrecio());

        Artefacto refrigerador = FactoryArtefacto.make("refrigerador");
        refrigerador.setPrecio(100);
        System.out.println(refrigerador.getPrecio());

        Artefacto microondas = FactoryArtefacto.make("microondas");
        microondas.setPrecio(190);
        System.out.println(microondas.getPrecio());


    }
}
