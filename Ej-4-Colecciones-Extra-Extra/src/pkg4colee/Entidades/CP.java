package pkg4colee.Entidades;

public class CP {

    private Integer cod;
    private String ciudad;

    public CP() {
    }

    public CP(Integer cod, String ciudad) {
        this.cod = cod;
        this.ciudad = ciudad;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getCod() {
        return cod;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return "CP{" + "cod=" + cod + ", ciudad=" + ciudad + '}';
    }

}
