package Interfases;

public class InterfacesApp {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(
                "Ian",
                "Pillado",
                18,
                "Tecnologico",
                "Informatica",
                "2do"
        );

        Empleado empleado = new Empleado(
                "Carlos",
                "Ramirez",
                30,
                "Tesla",
                "Senior Programmer",
                "100000"
        );

        EstudianteTrabajador estudianteTrabajador = new EstudianteTrabajador(
                "Maria",
                "Guadalupe",
                23,
                "Tecnologica",
                "Informatica",
                "9no",
                "Facebook",
                "Junior Programmer",
                "100000"
        );

        System.out.println(estudiante.toString());
        System.out.println(empleado.toString());
        System.out.println(estudianteTrabajador.toString());
    }
}
