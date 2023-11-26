package dominio;

import java.math.BigDecimal;

public class MusicoRefuerzo extends Participante {
    private String instrumento;
    private BigDecimal cantidad;

    public MusicoRefuerzo(String nombre, String instrumento, BigDecimal cantidad) {
        super(nombre);
        this.instrumento = instrumento;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return nombre + ", " + instrumento + ", " + cantidad + " C";
    }
}
