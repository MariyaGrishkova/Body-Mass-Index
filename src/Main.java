public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        int weight = 99;
        float growth = (float) 1.75;
        double index = service.calculate(weight, growth);
        System.out.println(index);
    }
}
