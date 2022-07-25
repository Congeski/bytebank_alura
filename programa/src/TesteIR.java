public class TesteIR {

    public static void main(String[] args) {
        double salario = 2000.0;

        if(salario >= 1900.0 && salario <= 2800.0){
            System.out.println("O IR e de 7.5%, e pode deduzir na declaracao o valor de R$ 142");
        } else if (salario >= 2800.1 && salario <= 3751.0) {
            System.out.println("o IR e de 15% e pode deduzir R$ 350");
        } else if (salario >= 3751.01 && salario <= 4664.00){
            System.out.println("o IR e de 22.5% e pode deduzir R$ 636");
        }
    }
}
