public class Main {
    public static void main(String[] args) {
        Docente docente = new Docente("Carlos", 40, "Matematica");
        Preceptor preceptor = new Preceptor("Laura", 35, "5to A");

        docente.mostrarInformacion();
        System.out.println();
        preceptor.mostrarInformacion();

        docente.setEdad(42);
        docente.setEdad(-5); // Prueba de validacion.

        System.out.println("\nDATOS ACTUALIZADOS");
        docente.mostrarInformacion();
    }
}
