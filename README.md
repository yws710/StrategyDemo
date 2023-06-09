# 题目

1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。

2、超市增加了一种水果芒果，其定价为 20 元/斤。
现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。

3、超市做促销活动，草莓限时打 8 折。
现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。

4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。

## 要求
使用 Java 程序编写，IDE 不限，
请使用面向对象的思路进行程序编写。
需在程序中，验证函数计算结果的正确性。

## 解决方案：
采用Java设计模式中的策略模式。

**第一步**：定义优惠策略的接口Strategy

**第二步**：定义具体的优惠策略实现类，这里定义了三个：默认策略（DefaultStrategy）不优惠；八折优惠策略（RebateStrategy）在指定时间段内的草莓打八折；满100减10促销策略（ReduceStrategy）

**第三步**：定义策略的环境类Context

**第四步**：使用。Client1, Client2, Client3, Client4分别测试上面四个问题。
