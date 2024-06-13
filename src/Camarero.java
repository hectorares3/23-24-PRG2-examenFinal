class Camarero extends Empleado {
    private Hamburguesa hamburguesaRecibida;

    public void recibir(Hamburguesa hamburguesa) {
        this.hamburguesaRecibida = hamburguesa;
    }

    public void servir() {
        if (hamburguesaRecibida != null) {
            System.out.println("Sirviendo la hamburguesa: " + hamburguesaRecibida.toString());
        }
    }
}