
package pkg3colee.Entidades;
import java.util.Scanner;
import java.util.HashSet;

public class Libro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String titulo;
    private String autor;
    private Integer ne;
    private Integer pre;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer ne, Integer pre) {
        this.titulo = titulo;
        this.autor = autor;
        this.ne = ne;
        this.pre = pre;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getNe() {
        return ne;
    }

    public Integer getPre() {
        return pre;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNe(Integer ne) {
        this.ne = ne;
    }

    public void setPre(Integer pre) {
        this.pre = pre;
    }


    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ne=" + ne + ", pre=" + pre + '}';
    }

}
