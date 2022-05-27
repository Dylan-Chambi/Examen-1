package parcial.ejercicio4.builder;

public class PaqueteNormal extends Builder {

    @Override
    public void buildPipocas() {
        paquete.setPipoca("envase normal");
    }

    @Override
    public void buildRefresco() {
        paquete.setRefresco("1 refresco");
    }

    @Override
    public void buildChocolate() {
        paquete.setChocolate("");
    }

    @Override
    public void buildTieneChocolate() {
        paquete.setTieneChocolate(false);
    }
}
