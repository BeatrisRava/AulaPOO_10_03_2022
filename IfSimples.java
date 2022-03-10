import java.until.Scanner;
public class IfSimples{
public static void main(String[] args) {
    Scanner leitor;

    leitor = new Scanner (System.in);
    double nota;
    System.out.println("Digite sua nota:");
    nota = leitor.nextDouble();

    if (nota >= 6)
        System.out.println("Parabéns! você foi aprovado");
        System.out.println("Aprovado");

    leitor.close();
}  


}