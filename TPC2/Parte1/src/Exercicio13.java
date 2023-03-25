public class Exercicio13 {
    public static void main(String[] args) {
        double A = 0.1;
        double B = 0.01;
        double C = 0.01;
        double D = 0.00002;
        double prey= 1.000;
        double pred = 20;
        double prey1, pred1=0;
        prey1=prey*(1+A-B*pred);
        pred1=pred*(1-C+D*prey);
        System.out.println("O nº de presas são "+prey1);
        System.out.println("O nº de predadores são "+pred1);

    }
}
