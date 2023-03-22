/**
 * 默认策略（不优惠）
 */
public class DefaultStrategy implements Strategy {
    @Override
    public double realPrice(double consumePrice) {
        return consumePrice;
    }
}
