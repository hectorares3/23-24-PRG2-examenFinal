class Hamburguesa{

    private Pan panSuperior;
    private Pan panInferior;
    private Carne carne;
    private Extra[] extras;
    private int indiceExtra;

    public Hamburguesa(Pan panSuperior, Pan panInferior, Carne carne, int numeroExtras) {
        this.panSuperior = panSuperior;
        this.panInferior = panInferior;
        this.carne = carne;
        this.extras = new Extra[numeroExtras];
        this.indiceExtra = 0;
    }
    public void agregarExtra(Extra extra) {
        if (indiceExtra < extras.length) {
            extras[indiceExtra] = extra;
            indiceExtra++;
        }
    }
    @Override
public String toString() {
    String descripcion = "Hamburguesa con pan superior de " + panSuperior.getTipo() + ", " +
                         "pan inferior de " + panInferior.getTipo() + ", " +
                         "carne de res " + carne.getCoccion() + ", " +
                         "y los siguientes extras: ";
    for (Extra extra : extras) {
        if (extra instanceof Ketchup) {
            descripcion += extra.getTipo() + " (cantidad: " + ((Ketchup) extra).getCantidad() + "), ";
        } else if (extra instanceof Mayonesa) {
            descripcion += extra.getTipo() + " (cantidad: " + ((Mayonesa) extra).getCantidad() + "), ";
        } else {
            descripcion += extra.getTipo() + ", ";
        }
    }
    return descripcion;
}






}


}