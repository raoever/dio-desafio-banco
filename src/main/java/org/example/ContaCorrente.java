package org.example;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String sacar(double valor) {
        super.sacar(valor);
        System.out.println("=== Saque Conta Corrente ===");
        return super.sacarExecucao(valor);
    }
    @Override
    protected void imprimeExtrato() {
        super.imprimeExtrato();
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }


}
