package EJERCICIO3;

public class main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("Sopa de fideo", "asado de carne", "Agua mineral", "helado de vainilla");
        Pedido pedido2 = new Pedido("ansalada rusa", "pepsi");
        Pedido pedido3 = new Pedido("hamburguesa", "guiso", "refresco", "torta de chocolate");

        System.out.println("calcular Valor del pedido 1: $" + pedido1.calcularValorPedido());
        System.out.println("calcular Valor del pedido 2: $" + pedido2.calcularValorPedido());
        System.out.println("calcular Valor del pedido 3: $" + pedido3.calcularValorPedido());
    }
}
