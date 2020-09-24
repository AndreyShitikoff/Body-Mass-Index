public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 87;
        double growth = 1.68;

        double imb = service.calculate(weight, growth);

        System.out.println(imb);

    }
}
