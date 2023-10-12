package EJERCICIO3;

public class Pedido {
    //atributos
        private String primerPlato1;
        private String segundoPlato2;
        private String bebida1;
        private String postre2;
//contructores
        public Pedido(String primerPlato, String segundoPlato, String bebida, String postre) {
            this.primerPlato1 = primerPlato;
            this.segundoPlato2 = segundoPlato;
            this.bebida1= bebida;
            this.postre2 = postre;
        }

        public Pedido(String primerPlato1, String bebida) {
            this(primerPlato1, null, bebida, null);
        }

        public Pedido(String primerPlato, String segundoPlato, String bebida) {
            this(primerPlato, segundoPlato, bebida, null);
        }

        public double calcularValorPedido() {
            double valor = 0;
            if (primerPlato1 != null) {
                valor += 10.0;
            }
            if (segundoPlato2 != null) {
                valor += 15.0;
            }
            if (bebida1 != null) {
                valor += 5.0; // Precio de la bebida
            }
            if (postre2 != null) {
                valor += 8.0; // Precio del postre
            }
            return valor;
        }
    }

