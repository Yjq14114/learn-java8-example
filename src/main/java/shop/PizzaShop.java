package shop;

import java.util.Arrays;

/**
 * @Author: YangJiaQi
 * @Date: 2019/10/18 23:13
 */
public class PizzaShop extends BaseShop implements Nameable{

    private String companyName;
    private String[] foodOfferings = {
            "Pizza",
            "Spaghetti",
            "Garden Salad",
            "Antipasto",
            "Calzone"
    };
    @Override
    public String[] getInventory() {
        return foodOfferings;
    }

    @Override
    public void buyInventory(String item) {

    }

    @Override
    public String getName() {
        return companyName;
    }

    @Override
    public void setName(String name) {
        companyName = name;
    }

    public static void main(String[] args) {
        String className = "shop.DonutShop";
        BaseShop shop;
        try {
            shop = (BaseShop) Class.forName(className).newInstance();
            String[] inventory = shop.getInventory();
            System.out.println(Arrays.toString(inventory));
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
