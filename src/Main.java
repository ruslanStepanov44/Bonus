
public class Main {
    public static void main(String[] args) {
        BonusMilesService serrvice = new BonusMilesService();
        int price = 10_000;
        int miles = serrvice.calculate(price); // должно получиться 500
        System.out.println(miles);
    }
}
