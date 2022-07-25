import java.util.Locale;

public class TestaCondicional {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("testando condicionais");
        int idade = 20;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;

        if (idade >= 18 && acompanhado){
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Infelizmente voce nao pode entrar");
        }
    }
}
