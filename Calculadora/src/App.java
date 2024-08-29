import java.util.Scanner;
public class App{
    public static void main(String[] args){
        System.out.println("Digite o primeiro valor: ");
        double n1 = verificarNumero();

        System.out.println("Digite qual operação quer fazer: [+ - * ou /]");
        String operacao = verificarOperador();

        System.out.println("Digite o segundo valor: ");
        double n2 = verificarNumero();

        double resultado = 0;
        boolean erro = false;
        if (operacao.equals("+")){
            resultado = soma(n1, n2);
        } else if (operacao.equals("-")) {
            resultado = subtracao(n1, n2);
        } else if (operacao.equals("*")) {
            resultado = multiplicacao(n1, n2);
        } else if (operacao.equals("/")) {
            resultado = divisao(n1, n2);
            if (resultado == 0){
                erro = true;
            }
        }
        if (erro){
            System.out.println("ERRO: Não existe divisão por 0");
        } else{
            System.out.println("Resultado de " + n1 + " " + operacao + " " + n2 + " = " + resultado);
        }

    }
    public static double soma(double n1, double n2){
        return n1 + n2;
    }
    public static double subtracao(double n1, double n2){
        return n1 - n2;
    }
    public static double multiplicacao(double n1, double n2){
        return n1 * n2;
    }
    public static double divisao(double n1, double n2) {
        if (n2 == 0) {
            return 0;
        }
        return (double) n1 / n2;
    }
    public static String input(){
        Scanner scanner = new Scanner(System.in);
        String mensage = scanner.nextLine();
        return mensage;
    }
    public static double verificarNumero(){
        while (true){
            String n1Str = input();
            try{
                return (double) Integer.parseInt(n1Str);
            } catch (Exception e){
                System.out.println("ERRO: Digite um numero inteiro!");
            }
        }

    }
    public static String verificarOperador(){
        while (true){
            String operador = input();
            if (operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/")){
                return operador;
            }
            System.out.println("ERRO: Digite um operador valido!");
        }
    }
}