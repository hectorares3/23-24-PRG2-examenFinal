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
        String descripcion = "Sale una " + panSuperior.getTipo() + ", " + carne.getClass().getSimpleName() +
                             " (" + carne.getCoccion() + "), ";
    
        for (Extra extra : extras) {
            if (extra instanceof Ketchup) {
                descripcion += ((Ketchup) extra).getCantidad() + " de " + extra.getTipo() + ", ";
            } else if (extra instanceof Mayonesa) {
                descripcion += ((Mayonesa) extra).getCantidad() + " de " + extra.getTipo() + ", ";
            } else {
                descripcion += extra.getTipo() + ", ";
            }
        }
       
        descripcion += "\n\n";
    
        descripcion += panSuperior.getRepresentacion() + "\n";
        descripcion += carne.getRepresentacion() + "\n";
        for (Extra extra : extras) {
            descripcion += extra.getRepresentacion() + "\n";
        }
        descripcion += panInferior.getRepresentacion() + "\n";
    
        return descripcion;
    }






}


