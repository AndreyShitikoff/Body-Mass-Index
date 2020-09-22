public class BmiService {
    public double calculate(double weight, double growth) {

       double imb =  weight / (growth * growth);

       return imb;
       }

}
