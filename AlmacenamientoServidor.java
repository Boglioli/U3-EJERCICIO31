public class AlmacenamientoServidor {
    protected double capacidadGb;
    protected double tasaTransferenciaMb;
    protected String proveedor;
    public AlmacenamientoServidor(double capacidadGb, double tasaTransferenciaMb, String proveedor) {
        this.capacidadGb = capacidadGb;
        this.tasaTransferenciaMb = tasaTransferenciaMb;
        this.proveedor = proveedor;
    }
    public void mostrarDatos() {
        System.out.println("provedor: " + proveedor);
        System.out.println("capacidad: " + capacidadGb + "gb");
        System.out.println("tasa de transferencia: " + tasaTransferenciaMb + "mb/s");
    }
}

