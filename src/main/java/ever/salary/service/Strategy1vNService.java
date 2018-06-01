package ever.salary.service;

import java.math.BigDecimal;

/**
 * Create by Ever_Gao on 2018/6/1
 */

public interface Strategy1vNService {
    public BigDecimal calculate(double hours, int[] bounds, int[] basics);
}
