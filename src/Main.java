public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        int weight = 89;
        float growth = (float) 1.62;
            int index = (int) service.calculate(weight, growth);
        System.out.println(index);
    }
}
