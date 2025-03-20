
package exerciciosgetterssetters.escola;

 
public class TesteEscola {
     
  public static void main(String[] args) {
        Escola escola = new Escola("Escola Gladis Rita Bratenbach", "Avenida Lúcio Bittencourt, 123");

        // Exibindo dados
        System.out.println("Nome da Escola: " + escola.getNome());
        System.out.println("Endereço: " + escola.getEndereco());

        // Modificando os dados
        escola.setNome("Colégio Lourdes Fontoura");
        escola.setEndereco("Avenida Brasil, 456");

        // Exibindo dados modificados
        System.out.println("Dados atualizados:"); 
        System.out.println("Nome da Escola: " + escola.getNome());
        System.out.println("Endereço: " + escola.getEndereco());
    }
}


    
