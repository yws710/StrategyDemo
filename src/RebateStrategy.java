import java.time.LocalDate;

/**
 * 八折促销策略：在【2023年3月23日，2023年4月23）这段时间内打八折。
 */
public class RebateStrategy implements Strategy {
    private double rate;

    public RebateStrategy() {
        if (isRebate()) {
            this.rate = 0.8;
        } else {
            this.rate = 1;
        }

    }

    @Override
    public double realPrice(double consumePrice) {
        return consumePrice * this.rate;
    }

    private static boolean isRebate() {
        // 获取当前时间
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        // 自定义开始时间(2023年3月23日)
        LocalDate begin = LocalDate.of(year,3,23);
        // 自定义结束时间（2023年4月23日）
        LocalDate end = LocalDate.of(year, 4, 23);
        if (now.isEqual(begin) || (now.isAfter(begin) && now.isBefore(end))) {
            return true;
        } else {
            return false;
        }
    }
}
