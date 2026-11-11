public class Main {
    public static void main(String[] args) {
        UnidadNAS nas = new UnidadNAS(2000, 150, "western digital", 4);
        ArregloSAM sam = new ArregloSAM(10000, 500, "dell", 8);
        AlmacenamientoNUBE nube = new AlmacenamientoNUBE(5000, 100, "amazon", 2);
        System.out.println("------ unidad nas ------");
        nas.mostrarDatos();
        System.out.println("\n---- arreglo sam -----");
        sam.mostrarDatos();
        System.out.println("\n---- almacenamiento en nube ----");
        nube.mostrarDatos();
    }
}
