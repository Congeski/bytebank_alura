public class TestaBanco {
    public static void main(String[] args) {
        Cliente vinicius = new Cliente();
        vinicius.nome = "Vinicius Congeski";
        vinicius.cpf = "222.222.222-22";
        vinicius.profissao = "programador";

        Conta contaDoVinicius = new Conta();
        contaDoVinicius.deposita(100);

        // associa o cliente vinicius a conta contaDoVinicius
        contaDoVinicius.titular = vinicius;
        System.out.println(contaDoVinicius.titular.nome);
    }
}
