public class UnidadNAS extends AlmacenamientoServidor {
    private int numeroBahias;
    public UnidadNAS(double capacidadgb, double tasaTransferenciamb, String proveedor, int numeroBahias) {
        super(capacidadgb, tasaTransferenciamb, proveedor);
        this.numeroBahias = numeroBahias;
    }
    public double calculaCosto() {
        return numeroBahias * 5000;
    }
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("numero de habias: " + numeroBahias);
        System.out.println("costo: $ " + calculaCosto());
    }
}
