/**
 * 策略模式接口
 */
public interface Strategy {
    /**
     * 计算实际消费金额
     * @param consumePrice 消费金额（打折前）
     * @return 折后消费金额
     */
    public double realPrice(double consumePrice);
}
