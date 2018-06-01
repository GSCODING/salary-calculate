package ever.salary.impl;

import ever.salary.constant.Strategy;
import ever.salary.service.Strategy1vNService;
import ever.salary.utils.InitTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Create by Ever_Gao on 2018/6/1
 */
@Component
public class FormalClassBounsImpl {

    @Autowired
    private InitTime initTime;

    @Autowired
    private Strategy1vNService strategy1vNService;

    public BigDecimal calcuate(double _1v1hours,double _1v2hours,double _1v3hours){
        double hours[] = {_1v1hours,_1v2hours,_1v3hours};
        double[] _all = initTime.subTime(hours);
        BigDecimal rs = new BigDecimal(0);
        rs = rs.add(strategy1vNService.calculate(_all[0], Strategy._1v1HourBound,Strategy._1v1HOurBasics))
                .add(strategy1vNService.calculate(_all[1], Strategy._1v2HourBound,Strategy._1v2HOurBasics))
                .add(strategy1vNService.calculate(_all[2], Strategy._1v3HourBound,Strategy._1v3HOurBasics));
        return rs;
    }
}
