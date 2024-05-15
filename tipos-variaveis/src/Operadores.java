public class Operadores {
    public static void main(String[] args) {
        /* 
        - Operadores 2
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.err.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.err.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.err.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.err.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.err.println(concatenacao);
        */

        /*Operadores 4 */
        
        int numero = 5;
        numero = - numero;

        System.out.println(numero);

        numero++;
        //numero --;
        System.out.println(numero);

        ////////
        boolean variavel = true;

        System.out.println(!variavel);
        System.out.println(variavel);


        /*Operação 5 */
        // Operador Ternário

        int a, b;

        a = 5;
        b = 6;

        String resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        /*Operação 6 */
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");
    }
}
