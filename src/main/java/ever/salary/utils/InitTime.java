package ever.salary.utils;

import org.springframework.stereotype.Component;

/**
 * Create by Ever_Gao on 2018/6/1
 */
@Component
public class InitTime {

    public double[] subTime(double[] hour){
        double basicHour = -8;
        for (int i = 0; i < hour.length; i++) {
            basicHour = basicHour + hour[i];
            if (basicHour >= 0){
                hour[i] = basicHour;
                break;
            }else {
                hour[i] = 0;
            }
        }
        return hour;
    }
}
