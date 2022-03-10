import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        java.util.Scanner leitor = new Scanner (System.in);
        System.out.printf ("Digite sua nota\n");
        int nota = leitor.nextInt();
        if (nota >= 6)
        System.out.printf("Parabens");
        System.out.printf(
            "A nota %d garante aprovação\n"),
            nota
            );
            else (
                System.out.println(
                    "Com %d você reprova, infelizmente\n",
                    nota
                );
                leitor.close();
            ) 

    }
}
