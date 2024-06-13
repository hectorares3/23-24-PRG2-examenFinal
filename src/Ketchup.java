class Ketchup extends Extra {
    private String cantidad;

    public Ketchup(String cantidad) {
        this.tipo = "Ketchup";
        this.cantidad = cantidad;
    }

    public String getCantidad() {
        return cantidad;
    }
}