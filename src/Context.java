import java.math.BigDecimal;

/**
 * 上下文环境
 */
public class Context {
    private Strategy strategy;

    // 设置当前策略
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // 使用策略计算价格
    public double cul(double consumePrice) {
        // 使用具体促销策略获得实际消费金额
        double realPrice = this.strategy.realPrice(consumePrice);
        // 格式化保留小数点后两位
        BigDecimal bd = new BigDecimal(realPrice);
        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }
}
