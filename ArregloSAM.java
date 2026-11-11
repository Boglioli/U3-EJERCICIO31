public class ArregloSAM extends AlmacenamientoServidor {
    private int cantidadDiscos;
    public ArregloSAM(double capacidadgb, double tasaTransferenciamb, String proveedor, int cantidadDiscos) {
        super(capacidadgb, tasaTransferenciamb, proveedor);
        this.cantidadDiscos = cantidadDiscos;
    }
    public double calculaCosto() {
        return cantidadDiscos * 10000;
    }
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("numero de habias: " + cantidadDiscos);
        System.out.println("costo: $ " + calculaCosto());
    }
}

