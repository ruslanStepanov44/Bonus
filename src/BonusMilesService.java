public class BonusMilesService {
    public int calculate(int price) {
        int result;
        int bonus = 20;
        int miles = price / bonus;
        {

            result = (int) miles;
        }
        return result;
    }

}