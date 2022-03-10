public class IfEncadeado {
    public static void main(String[] args) {
        // nome completamente qualificado da classe 
        //fully qualified name
        java.util.Scanner leitor = 
                        new java.util.Scanner (System.in);

        long nota;
        System.out.printf("Qual a nota?");
        nota = leitor.nextLong();
        // if else encadeado

        if (nota >= 90){
            System.out.println("A");
        }

        else if (nota >=80){
            System.out.println("b");
        
        }

        else if (nota >=70){
            System.out.println("b");
        
        }

        else {
            System.out.println("b");
        
        }
        
        leitor.close();
    }
    
}
