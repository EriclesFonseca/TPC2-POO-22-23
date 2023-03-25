import java.util.Random;
        public class Exercicio8 {
            public static void main(String[] args) {
                Random random = new Random();
                int[] array = new int[10];

                // Preenche o array com números aleatórios entre 1 e 100
                for (int i = 0; i < array.length; i++) {
                    array[i] = random.nextInt(100) + 1;
                }

                // Exibe os valores do array
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                }
            }
        }

