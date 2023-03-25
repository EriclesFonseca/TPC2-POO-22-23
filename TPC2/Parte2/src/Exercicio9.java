public class Exercicio9 {
        public static void main(String[] args) {
            int[] array = {1, -2, 3, -4, 5, -8, 7, 9};

            // a)
            for(int element : array) {
                System.out.print(element + " ");
            }

            System.out.println();

            // b)
            int product = 1;

            for(int element : array) {
                product *= element;
            }

            System.out.println("Produto dos elementos do array: " + product);

            // c)
            int negativeCount = 0;

            for(int element : array) {
                if(element < 0) {
                    negativeCount++;
                }
            }

            System.out.println("Número de elementos negativos no array: " + negativeCount);
        }
    }

