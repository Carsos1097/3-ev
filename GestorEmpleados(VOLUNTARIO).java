import java.util.*;

class Empleado {
    private String nombre;
    private int id;
    private double salario;

    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Salario: $" + salario;
    }
}

class GestionEmpleados {
    private List<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        empleados.forEach(System.out::println);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionEmpleados gestionEmpleados = new GestionEmpleados();

    }
}
