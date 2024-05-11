public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        double salario = 2500; // 2 mil e quinhentos reais
        double salario2 = 2.500; // 2 reais

        short numCurto = 1;
        int numNormal = numCurto;
        //short numCurto2 = numNormal;
        // erro, "short" é menor que "int"
        short numCurto2 = (short) numNormal;
        // CASTING - conversão de objetos ou tipos primitivos de um tipo para outro tipo
    
        final double VALOR_DE_PI = 3.14;
        // declarar uma variavel fixa: Caixa alta e adicionar "final"

        System.out.println(numCurto2);
    }
}
