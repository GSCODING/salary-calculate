package ever.salary.impl;

import ever.salary.service.Strategy1vNService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Create by Ever_Gao on 2018/6/1
 */
@Component
public class Strategy1vNImpl implements Strategy1vNService{
    @Override
    public BigDecimal calculate(double hours, int[] bounds, int[] basics) {
        BigDecimal amount = new BigDecimal(0);
        if (hours<=0)
            return amount;
        for (int i = bounds.length-1; i >= 0 ; i --) {
            if (hours > bounds[i]){
                double sub = hours - bounds[i];
                hours = bounds[i];
                amount = amount.add(new BigDecimal(sub).multiply(new BigDecimal(basics[i])));
            }
        }
        return amount;
    }
}
