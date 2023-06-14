package pkg3col.Servicio;

import java.util.ArrayList;
import java.util.Scanner;
import pkg3col.Entidades.Alumno;

public class ServicioAlumno {
    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> alumnos = new ArrayList();
    Alumno a = new Alumno();

    public ArrayList<Alumno> crearAlumno() {

        String opcion;
        do {
            a.getNotas().clear();
            System.out.println("Ingrese nombre del alumno");

            a.setNombre(leer.next());

            System.out.println("Ingrese la nota 1 del alumno");
            a.getNotas().add(leer.nextInt());
            System.out.println("Ingrese la nota 2 del alumno");
            a.getNotas().add(leer.nextInt());
            System.out.println("Ingrese la nota 3 del alumno");
            a.getNotas().add(leer.nextInt());

            alumnos.add(new Alumno(a.getNombre(), new ArrayList(a.getNotas())));

            do {
                System.out.println("Desea crear otro alumno? S = si , N = no");
                opcion = leer.next();
            } while (!opcion.equalsIgnoreCase("S") && (!opcion.equalsIgnoreCase("N")));

        } while (!opcion.equalsIgnoreCase("N"));
        return alumnos;

    }

    public void notaFinal() {
        String buscar;
        Double promedio = 0.0;
        System.out.println("Ingrese el nombre del alumno al que quiere calcular su nota:");
        buscar = leer.next();

        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equalsIgnoreCase(buscar)) {
                for (int j = 0; j < 3; j++) {
                    promedio += alumnos.get(i).getNotas().get(j);
                }
                System.out.println(promedio / 3);
            }

            }
        }
    }

