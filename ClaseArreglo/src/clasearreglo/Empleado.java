package clasearreglo;

/**
 * @author Eduardo Salazar
 */
public class Empleado {
    private int id;
    private String nombre;
    private String paterno;
    private String materno;
    private int horasE;
    private double sueldoB;
    private int anioIng;
    public static final double VALOREXT = 276.5;
    public static final double PRESTACION = 0.03;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String paterno, String materno, int horasE, double sueldoB, int anioIng) {
        this.id = id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.horasE = horasE;
        this.sueldoB = sueldoB;
        this.anioIng = anioIng;
    }

    public int getAnioIng() {
        return anioIng;
    }

    public void setAnioIng(int anioIng) {
        this.anioIng = anioIng;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }
    public int getHorasE() {
        return horasE;
    }

    public void setHorasE(int horasE) {
        this.horasE = horasE;
    }
    
    public double getSueldoB() {
        return sueldoB;
    }

    public void setSueldoB(double sueldoB) {
        this.sueldoB = sueldoB;
    }



    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + ", horasE=" + horasE + ", sueldoB=" + sueldoB + ", anioIng=" + anioIng + '}';
    }
    
    public double calcSueldo(){
        double prestacion = (2022 - this.anioIng)*this.PRESTACION;
        double he = this.horasE * this.VALOREXT;
        return this.sueldoB + prestacion + he;
    }
}
