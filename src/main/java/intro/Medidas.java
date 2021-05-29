// 1- Pacote
package intro;

// 2 - Referencias as bibliotecas ( coisas que estão prontas para utilizar = Gradle )

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Metodos e funcoes (sao as coisas que sabem fazer)
    public static void main(String[] args) {
        System.out.println("Meu primeiro codigo em Java!!!");
        System.out.println("Calculo de areas");

        // Calculo de area - exemplo: tamanho do tapete ou piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; //largura recebe 4 unidades
        comprimento = 3; // comprimento recebe 3 unidades
        resultado = largura * comprimento;

        System.out.println("Para a largura de  " + largura + " e o comprimnenteo de"
                + comprimento + " area eh de " + resultado + " M2");

        // calculo da area reduzido

        }
        public void calcularAreaModoExenso(){

    }

    public void calcularAreaModoCompacto(){
        int largura = 5;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a area eh de " + largura * comprimento + "m2");

    }



}
