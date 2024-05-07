package exemplos;

public class TesteConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.depositar(100);
        c.depositar(100);
        c.setNumero(666);
        c.setNomeTitular("Thiago");
      
        boolean saqueEfetuado = c.sacar(29);
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.err.println("ERRO AO SACAR!!!");
        }
      ///  System.out.println("Nome do Titular: "+c.getNomeTitular());
      ///  System.err.println("Número: "+c.getNumero());
      ///  System.out.println("Saldo: " + c.getSaldo());
        
        System.out.println(c);
    }
}
