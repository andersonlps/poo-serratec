package aula02;

public class ExemploSwitch {
    public static void main(String[] args) {
        int mes = 2;

        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
        
            case 2:
                System.out.println("Fevereiro");
                break;
        
            case 3:
                System.out.println("Março");
                break;
        
            case 4:
                System.out.println("Abril");
                break;
        
            default:
                System.out.println("Mês inválido!");
                break;
        }
    }
}
