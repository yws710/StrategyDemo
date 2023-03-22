/**
 * 水果类
 */
public class Fruit {
    // 单价（每千克）
    private int pricePerKg;
    // 重量（千克）
    private int weight;

    // 名称
    private String name;

    public Fruit(int pricePerKg, int weight, String name) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

    // 单项水果总价
    public double totalPrice() {
        return this.pricePerKg * weight;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(int pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
