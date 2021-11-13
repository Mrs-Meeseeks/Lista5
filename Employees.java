package principal;

public class Employees {

    String identificador;
    String kids;
    String salario;

    @Override
    public String toString() {
        return identificador + "," + kids + "," + salario + "\n";

    }

    public Employees(String identificador, String kids, String salario) {
        this.identificador = identificador;
        this.kids = kids;
        this.salario = salario;
    }
}
