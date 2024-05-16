public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
        
        /* Liga e Desliga
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
        */

        /* 
        smartTv.diminuirVolume(); // 24
        smartTv.diminuirVolume(); // 23
        smartTv.diminuirVolume(); // 22
        smartTv.aumentarVolume(); // 23
        System.out.println("Volume Atual: " + smartTv.volume);
        */

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(10);
        System.out.println("Canal Atual: " + smartTv.canal);

    }
}
