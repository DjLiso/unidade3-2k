package exemplos;

public class TesteConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.depositar(100);
        c.depositar(50);
        boolean saqueEfetuado = c.sacar(300);
        if (saqueEfetuado){
            System.out.println("Saque Realizado");
        }else{
            System.err.println("ERRO");
        }
        System.out.println("Saldo: " + c.saldo);
       
              
    }
}
