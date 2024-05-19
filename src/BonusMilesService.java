public class BonusMilesService {
    public int calculate(int price) {
        int oneBonusMile = 20;
        int bonusMiles = price / oneBonusMile;
        return bonusMiles;
    }
}
