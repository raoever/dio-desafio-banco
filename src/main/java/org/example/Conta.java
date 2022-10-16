package org.example;

public class Conta {
    private static final String AGENCIA_PADRAO = "0001";
    private static int SEQUENCIAL = 1;

    protected String agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String sacarExecucao(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return "Efetivado com Sucesso!";
        } else {
            return "Saldo insuficiente!";
        }
    }

    public String sacar (double valor){
        return "";
    }
    public String depositar(double valor) {

        if (valor > 0) {
            saldo += valor;
            return "Depósito efetivado com Sucesso!";
        } else {
            return "Valor do Depósito tem que maior que 0 (Zero)!";
        }
    }

    public String transferir(double valor, Conta contaDestino) {
        System.out.println("=== Transferênica ===");
        if(this.sacar(valor).equals("Efetivado com Sucesso!")){
            System.out.println("=== Depósito em Conta Destino ===");
            contaDestino.depositar(valor);
            return "Transferência Efetivada com Sucesso!";
        }
        else
            return "Erro ao tentar fazer Saque em Conta Origem - Transferência não Efetivada!";
    }

    protected void imprimeExtrato(){

    }
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %s", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
