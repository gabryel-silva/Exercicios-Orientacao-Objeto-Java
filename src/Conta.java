public class Conta {//classe
    private double saldo;
    private int numero, agencia;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero){//construtor
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
        System.out.printf("Agencia: %d\n", agencia);
        System.out.printf("Número da conta: %d\n", numero);
        System.out.printf("Total de contas: %d\n", total);
    }

    public void deposita(double valor){//metodo depositar();
        this.saldo += valor;
    }

    public boolean saca(double valor){//metodo saca();
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){//metado transfere();
        if(saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){//getter
        return this.saldo;
    }

    public int getNumero(){//getter
        return numero;
    }

    public void setNumero(int numero){//setter
        this.numero = numero;
    }

    public int getAgencia(){//getter
        return agencia;
    }

    public void setAgencia(int agencia){//setter
        this.agencia = agencia;
    }

    public Cliente getTitular() {//getter
        return titular;
    }

    public void setTitular(Cliente titular) {//setter
        this.titular = titular;
    }
}
