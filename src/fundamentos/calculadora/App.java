package fundamentos.calculadora;
import java.util.Scanner;

public class App {

    public static void main(String[] args){
        int escolha;

        Scanner entrada = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        while(true){
            System.out.println("Digite o primeiro numero: ");
            calc.setValor1(entrada.nextFloat());
            System.out.println("Digite o segundo número: ");
            calc.setValor2(entrada.nextFloat());
            System.out.println("Escolha: \n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Sair");
            escolha = entrada.nextInt();

            if(escolha == 1){
                calc.adicao();
                System.out.println("Resultado: " + calc.getResultado());
            } else if(escolha == 2){
                calc.subtracao();
                System.out.println("Resultado: " + calc.getResultado());
            } else if(escolha == 3){
                calc.multiplicacao();
                System.out.println("Resultado: " + calc.getResultado());
            } else if(escolha == 4){
                calc.divisao();
                System.out.println("Resultado: " + calc.getResultado());
            }else if(escolha == 5){
                break;
            }else{
                System.out.println("Digite um número válido!");
            }
        }
        entrada.close();
    }
}