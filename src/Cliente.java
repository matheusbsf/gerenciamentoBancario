class Cliente{
   private String nome;
   private String sobrenome;
   private String cpf;
   private double saldo;
   
   public Cliente(String nome, String sobrenome, String cpf){
       this.nome = nome;
       this.sobrenome = sobrenome;
       this.cpf = cpf;
   }
   
   public String consultarNome(){
      return nome + sobrenome;
   }

   public String consultarCpf(){
      return cpf;
   }

   public void consultarSaldo(){
       if (saldo > 0){
           System.out.println("\nSeu saldo atual é de R$" + saldo);
       } else {
           System.out.println("\nVocê não possui saldo.");
       }
   }
   
   public void depositar(double valor){
       if (valor > 0){
           saldo += valor;
           System.out.println("\nDepósito de R$" + valor + " realizado.\n"
                   + "Novo saldo: R$" + saldo);
       } else {
           System.out.println("\nValor inválido.");
       }
   }
   
   public void sacar(double valor){
       if (valor > 0 && valor <= saldo){
           saldo -= valor;
           System.out.println("\nSaque de R$" + valor + " realizado.\n"
                   + "Novo saldo: R$" + saldo);
       } else {
           System.out.println("\nValor inválido ou saldo insuficiente.");
       }
   }
}