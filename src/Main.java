public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = (float) 1.95;
        float weight = 90;
        float BMI = service.calculate(weight, height);
        System.out.println("Индекс массы тела: " + BMI + " пункт(ов/а)");
    }
}
