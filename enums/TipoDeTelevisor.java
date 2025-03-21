package enums;

public enum TipoDeTelevisor {
    P("Plasma"), L("LCD"), O("OLED");

    private final String tipo;

    TipoDeTelevisor(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

}
