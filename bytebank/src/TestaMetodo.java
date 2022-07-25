public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoVinicius = new Conta();
        contaDoVinicius.saldo = 100;
        contaDoVinicius.deposita(50);

        System.out.println(contaDoVinicius.saldo);
        boolean conseguiuRetirar = contaDoVinicius.saca(20);
        System.out.println(contaDoVinicius.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaMarcela = new Conta();
        contaMarcela.deposita(1000);

        boolean sucessoTransferencia = contaMarcela.transfere(300, contaDoVinicius);
        if (sucessoTransferencia){
            System.out.println("Transferencia com Sucesso");
        } else {
            System.out.println("Faltou dinheiro");
        }
        System.out.println(contaMarcela.saldo);
        System.out.println(contaDoVinicius.saldo);


        contaDoVinicius.titular = "Vinicius Congeski";
        System.out.println(contaDoVinicius.titular);
    }
}
