package shop;

/**
 * 甜甜圈
 * @Author: YangJiaQi
 * @Date: 2019/10/18 23:08
 */
public class DonutShop extends BaseShop implements Nameable{
    private String companyName;
    private String [] menuItems = {
            "Donuts",
            "Muffins",
            "Danish",
            "Coffee",
            "Tea"
    };

    @Override
    public String[] getInventory() {
        return menuItems;
    }

    @Override
    public void buyInventory(String item) {
        System.out.println("\n You have just purchased " + item);
    }

    @Override
    public String getName() {
        return companyName;
    }

    @Override
    public void setName(String name) {
        companyName = name;
    }
}
