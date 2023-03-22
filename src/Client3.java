import java.util.ArrayList;

public class Client3 {
    public static void main(String[] args) {
        /*
        3、超市做促销活动，草莓限时打 8 折。
现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         */
        ArrayList<Fruit> items = new ArrayList<>();
        items.add(new Fruit(8, 2, "苹果"));
        items.add(new Fruit(13,2,"草莓"));
        items.add(new Fruit(20,4,"芒果"));

        double total = calculatePrice(items);
        System.out.println("总计：" + total);
    }


    // 草莓打八折
    private static double calculatePrice(ArrayList<Fruit> items) {
        Context context = new Context();
        double realPrice = 0;
        for (Fruit item : items) {
            if ("草莓".equals(item.getName())) {
                // 草莓打八折
                context.setStrategy(new RebateStrategy());
            } else {
                context.setStrategy(new DefaultStrategy());
            }
            realPrice = realPrice + context.cul(item.totalPrice());
            System.out.println(item.getName() + "：原价" + item.totalPrice() + "，折后价" + context.cul(item.totalPrice()));
        }
        return realPrice;
    }
}
