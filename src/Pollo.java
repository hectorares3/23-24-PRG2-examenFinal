class Pollo extends Carne {
    public Pollo(String coccion) {
        this.coccion = coccion;
    }

    @Override
    public String getRepresentacion() {
        return ";;;;;;;;;;;;";
    }
}