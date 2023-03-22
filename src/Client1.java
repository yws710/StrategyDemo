import java.util.ArrayList;

public class Client1 {
    public static void main(String[] args) {
        /*
        1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。

         */
        ArrayList<Fruit> items = new ArrayList<>();
        items.add(new Fruit(8, 2, "苹果"));
        items.add(new Fruit(13,2,"草莓"));

        double total = calculateDefaultPrice(items);
        System.out.println("总计：" + total);
    }

    // 不打折，针对问题1、2
    private static double calculateDefaultPrice(ArrayList<Fruit> items) {
        Context context = new Context();
        double realPrice = 0;
        for (Fruit item : items) {
            context.setStrategy(new DefaultStrategy());
            realPrice = realPrice + context.cul(item.totalPrice());
            System.out.println(item.getName() + "小计：" + item.totalPrice());
        }
        return realPrice;
    }
}
