public class AvarageDouble {
    public static void main(String[] args) {
        double[] n = { 12.5, 4.5, 24.5, 12.5 };
        double sum = 0;
        double AvarageDouble = 0;
        for (int i = 0; i < n.length; i++) {
            sum = sum + n[i];
            AvarageDouble = sum / n.length;

        }
        System.out.println(AvarageDouble);

    }
}
