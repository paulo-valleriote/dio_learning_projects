import weather.Rainbow;

public class App {
    public static void main(String[] args) throws Exception {
        Rainbow rainbow = new Rainbow();

        System.out.println("Cores uma abaixo da outra");
        rainbow.makeRainbow();
        System.out.println("\nQuantidade de cores");
        rainbow.numberOfColors();
        System.out.println("\nOrdem alfabética");
        rainbow.alphabeticOrder();
        System.out.println("\nOrdem alfabética ao contrário");
        rainbow.reverseAlphabeticOrder();
        System.out.println("\nTodas que começam com a letra V");
        rainbow.startingWithLetter("v");
        System.out.println("\nRemovendo todas as cores que começam com a letra V");
        rainbow.removeIfNotStartWithLetter("v");
        System.out.println("\nLimpando o conjunto");
        rainbow.clearRainbow();
        System.out.println("\nEstá vazio?");
        System.out.println(rainbow.isEmpty());
    }
}
