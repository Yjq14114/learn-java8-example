package shop;

/**
 * @Author: YangJiaQi
 * @Date: 2019/10/18 22:57
 */
public abstract class BaseShop {

    CustList custList;
    /**
     * 计算销售额
     */
    public void calculateSaleTax() {
        System.out.println("Calculate Sales Tax");
    }

    /**
     * 获取列表
     * @return 获取存货列表
     */
    public abstract String[] getInventory();

    /**
     * 购物接口
     * @param item 购物名称
     */
    public abstract void buyInventory(String item);
}
