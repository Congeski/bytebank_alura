public class TesteConexao {

    public static void main(String[] args) {
        Conexao con = null;
        try (Conexao conexao = new Conexao()) {

        } catch(IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        }
    }
}
