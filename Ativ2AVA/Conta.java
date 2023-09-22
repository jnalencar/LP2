package Ativ2AVA;

public class Conta {
    private int numeroConta;
    private String nomeTitular;
    private int tipoConta; // 1 - Conta Corrente, 2 - Conta Poupança
    private double saldo;
    private double limite;

    public Conta(int numeroConta, String nomeTitular, int tipoConta, double saldo, double limite) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getLimite() {
        return this.limite;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public String getTipoConta() {
        return this.tipoConta == 1 ? "Conta Corrente" : "Conta Poupança";
    }

    public void sacar(int valor){
        if(this.saldo < valor){
            System.out.println("Saldo insuficiente para saque.");
            return;
        }
        if(this.limite < valor){
            System.out.println("Tentativa de saque maior do que o limite, tente sacar um valor menor.");
            return;
        }
        else{
            this.saldo -= valor;
            System.out.println("Saque de R$"+valor+" realizado com sucesso.");
        }
    }

    public void depositar(int valor){
        this.saldo += valor;
        System.out.println("Deposito de R$"+valor+" realizado com sucesso.");
    }

    public void transferir(int valor, Conta contaDestino){
        if(this.tipoConta == 2){
            System.out.println("Conta poupança não pode realizar transferência.");
            return;
        }
        if(this.saldo < valor){
            System.out.println("Saldo insuficiente para transferência.");
            return;
        }
        else{
            this.saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferencia de R$"+valor+" realizada com sucesso.");
            }
        } 
    
    public String toString(){
        return "Numero da conta: "+this.getNumeroConta()+"\nNome do titular: "+this.getNomeTitular()+"\nTipo da conta: "+this.getTipoConta()+"\nSaldo: "+this.getSaldo()+"\nLimite: "+this.getLimite()+"\n";
    }

}
