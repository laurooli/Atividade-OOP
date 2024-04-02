class ContaTerminal{
    private int numero = 0;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 100;
    }
    public double getSaldo(){
        return saldo;
    }

}