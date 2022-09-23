import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        boolean menu = true;

        do {
            System.out.println("1.  Quadrado");
            System.out.println("2.  Triângulo");
            System.out.println("3.  Retângulo");
            System.out.println("4.  Trapézio");
            System.out.println("9.  Sair");

            String poligono = leitura.next();

            switch (poligono) {
                case "1":
                    System.out.println("Digite o lado do quadrado: ");
                    int ladoQuadrado1 = leitura.nextInt();
                    System.out.println("Digite o segundo lado: ");
                    int ladoQuadrado2 = leitura.nextInt();
                    int areaQuadrado = ladoQuadrado1 * ladoQuadrado2;
                    System.out.println("A área do quadrado é igual a: " + areaQuadrado);
                    break;
                case "2":
                    System.out.println("Digite o valor da base: ");
                    int baseTriangulo = leitura.nextInt();
                    System.out.println("Digite o valor da altura: ");
                    int alturaTriangulo = leitura.nextInt();
                    int areaTriangulo = baseTriangulo * alturaTriangulo / 2;
                    System.out.println("A área do Triângulo é igual a: " + areaTriangulo);
                    break;
                case "3":
                    System.out.println("Digite o valor da base: ");
                    int baseRetangulo = leitura.nextInt();
                    System.out.println("Digite o valor da altura: ");
                    int alturaRetangulo = leitura.nextInt();
                    int areaRetangulo = baseRetangulo * alturaRetangulo;
                    System.out.println("A área do Retângulo é igual a: " + areaRetangulo);
                    break;
                case "4":
                    System.out.println("Digite o valor da base menor: ");
                    int baseMenor = leitura.nextInt();
                    System.out.println("Digite o valor da base maior: ");
                    int baseMaior = leitura.nextInt();
                    System.out.println("Digite o valor da altura: ");
                    int alturaTrapezio = leitura.nextInt();
                    int areaTrapezio = baseMenor + baseMaior * alturaTrapezio / 2;
                    System.out.println("A área do Trapézio é igual a: " + areaTrapezio);
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, digite uma opção correta! ");
                    break;
                case "9":
                    menu = false;
                    System.out.println("Voce saiu");
                    break;
            }

        } while (menu == true);


    }

}
