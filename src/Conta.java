public class Conta {
    private double saldo;
    private String tipo;
    private String ContaCorrente;
    private String ContaPoupanca;

    public Conta(double valorinicial) {

    }

    public Conta(double Valorinicial, String tipo) {

    }

    public boolean Depositar(double valor) {

        if (tipo == ContaCorrente) {
            if (valor > 1000.00) {
                return false;
            }
            return true;
        }

        return true;


    }

    public boolean Sacar(double valor) {
        if (valor > saldo) {
            return false;
        } else {
            return true;
        }
    }

    public boolean Transferir(double valor, Conta contadestino) {
        if (valor <= 0) {
            return false;
            return true;
        }
    }





