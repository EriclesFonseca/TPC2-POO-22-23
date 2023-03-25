public class Exercicio2 {
    public static void main(String[] args) {
        String[][] tabuleiro = {{"x", "o", "o"}, {"o", "x", "o"}, {"o", "o", "x"},{"", "", ""}};
        for (int i=0; i < 3; i++){
            for (int j=0; j < 3; j++){
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }
}