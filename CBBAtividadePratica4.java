import java.util.Scanner;

public class CBBAtividadePratica4 {
    public static void main(String[] args) {
        // Declaração das variáveis
        double comprimento, largura, profundidade, cubagem, valorTotal;
        
        // Entrada de dados
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o comprimento da piscina em metros: ");
        comprimento = sc.nextDouble();
        System.out.print("Informe a largura da piscina em metros: ");
        largura = sc.nextDouble();
        System.out.print("Informe a profundidade da piscina em metros: ");
        profundidade = sc.nextDouble();
        
        // Cálculo da cubagem e do valor total
        cubagem = comprimento * largura * profundidade;
        valorTotal = cubagem * 100;
        
        // Saída de dados
        System.out.println("A cubagem da piscina é de " + cubagem + " metros cúbicos.");
        System.out.println("O valor total de construção da piscina é de R$" + valorTotal + ".");
    }
}
