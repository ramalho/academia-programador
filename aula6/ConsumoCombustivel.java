public class ConsumoCombustivel {
    public static void main(String[] args) {
        double capacidadeTanque = 50;
        double kmRodados = 2 * 95;
        double gastou = capacidadeTanque / 2;
        double milhagem = kmRodados / gastou;
        System.out.println("O carro faz " + milhagem + "km/l");
    }    
}