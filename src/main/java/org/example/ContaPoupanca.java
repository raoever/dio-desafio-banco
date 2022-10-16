package org.example;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String sacar(double valor) {
        super.sacar(valor);
        System.out.println("=== Saque Conta Poupança ===");
        return super.sacarExecucao(valor);
    }

    @Override
    protected void imprimeExtrato() {
        super.imprimeExtrato();
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
