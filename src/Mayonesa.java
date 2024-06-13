class Mayonesa extends Extra {
    private String cantidad;

    public Mayonesa(String cantidad) {
        this.tipo = "Mayonesa";
        this.cantidad = cantidad;
    }

    public String getCantidad() {
        return cantidad;
    }

    @Override
    public String getRepresentacion() {
        return "~=~~=~~=~~=~";
    }
}