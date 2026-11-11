public class AlmacenamientoNUBE extends AlmacenamientoServidor {
    private double costoPorGB;
    public AlmacenamientoNUBE(double capacidadgb, double tasaTransferenciamb, String proveedor, double costoPorGB) {
        super(capacidadgb, tasaTransferenciamb, proveedor);
        this.costoPorGB = costoPorGB;
    }
    public double calculaCosto() {
        return capacidadGb * costoPorGB;
    }
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("numero por gb: $ " + costoPorGB);
        System.out.println("costo mensual: $ " + calculaCosto());
    }
}


