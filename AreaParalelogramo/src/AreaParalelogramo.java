import java.util.Scanner;

public class AreaParalelogramo {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        // Declara��o das vari�veis do programa
        double b, h, area;

        // Entrada de dados
        System.out.print("Digite o valor da base: ");
        b = entrada.nextDouble();
        b = Math.abs(b); // Garante base positiva
        System.out.print("Digite o valor da altura: ");
        h = entrada.nextDouble();
        h = Math.abs(h); // Garante base positiva

        // Processamento de dados
        area = b * h;

        // Sa�da de dados
        System.out.println("�rea do paralelogramo: " + area);
        entrada.close();
    }
}
