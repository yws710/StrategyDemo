/**
 * 满100减10促销策略
 */
public class ReduceStrategy implements Strategy {
    @Override
    public double realPrice(double consumePrice) {
        if (consumePrice >= 100) {
            return consumePrice - 10;
        } else {
            return consumePrice;
        }
    }
}
