package hotel;
public class Estadia {
    private Animal animal;
    private double valor;
    private int dias;

    public Estadia(String nome, String tipo, int idade, double valor, int dias) {
        this.valor = valor;
        this.dias = dias;
        this.animal = new Animal(nome, tipo, idade);
    }

    public String getNome() {
        return this.animal.getNome();
    }

    public int getIdade() {
        return this.animal.getIdade();
    }

    public String getTipo() {
        return this.animal.getTipo();
    }

    public double getValor() {
        return valor;
    }

    public int getDias() {
        return dias;
    }

    @Override
    public String toString() {
        return  animal.getNome() + ", " + animal.getTipo() + ", " + dias + " dias com o preço de R$" + valor;
    }
}