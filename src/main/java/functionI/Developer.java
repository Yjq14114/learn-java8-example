package functionI;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @author yang.jiaqi@vpclub.cn
 * @date 2021/6/28 1:20
 */
@Getter
@Setter
@ToString
public class Developer {
    public String name;
    public BigDecimal salary;

    public Developer(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }
}
