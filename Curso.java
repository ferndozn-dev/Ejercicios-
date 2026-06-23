public class Curso {
    private String clave;
    private String nombre;
    private String docente;
    private int cupoMaximo;
    private int inscritos;

    public Curso(String clave, String nombre, String docente, int cupoMaximo) {
        this.clave = clave;
        this.nombre = nombre;
        this.docente = docente;
        this.cupoMaximo = cupoMaximo;
        this.inscritos = 0;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public int getInscritos() {
        return inscritos;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void mostrar() {
        System.out.println("Clave: " + clave);
        System.out.println("Nombre: " + nombre);
        System.out.println("Docente: " + docente);
        System.out.println("Cupo máximo: " + cupoMaximo);
        System.out.println("Inscritos: " + inscritos);
        System.out.println("----------------------");
    }

    public void inscribir() {
        if (inscritos < cupoMaximo) {
            inscritos++;
            System.out.println("Estudiante inscrito.");
        } else {
            System.out.println("Cupo lleno.");
        }
    }

    public void baja() {
        if (inscritos > 0) {
            inscritos--;
            System.out.println("Estudiante dado de baja.");
        } else {
            System.out.println("No hay estudiantes inscritos.");
        }
    }
}
