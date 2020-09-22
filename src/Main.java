public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double imb = service.calculate(87, 1.68);

        System.out.println(imb);
    }
}
