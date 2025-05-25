public class Main {
    public static void main(String[] args) {
        Cafe cCafePuro = new CafePuro();
        System.out.println(cCafePuro.getDescricao());
        System.out.println("Preço: "+ cCafePuro.getPreco());
        Chantili cCafeComChantili = new Chantili(cCafePuro);
        System.out.println(cCafeComChantili.getDescricao());
        System.out.println("Preço: "+ cCafeComChantili.getPreco());
        Canela cCafeComCanela = new Canela(cCafeComChantili);
        System.out.println(cCafeComCanela.getDescricao());
        System.out.println("Preço: "+ cCafeComCanela.getPreco());
    }
}