package ever.salary.controller;

import ever.salary.impl.FormalClassBounsImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Create by Ever_Gao on 2018/6/1
 */
@RestController
@RequestMapping("ever/salary/")
@Slf4j
public class SalaryCalcuateController {

    @Autowired
    private FormalClassBounsImpl formalClassBouns;

    @RequestMapping(value = "1vN",method = RequestMethod.GET)
    public ResponseEntity _1vNStrategy(@RequestParam (value = "_1v1hours",required = false) double _1v1hours,
                                       @RequestParam (value = "_1v2hours",required = false) double _1v2hours,
                                       @RequestParam (value = "_1v3hours",required = false) double _1v3hours){

        BigDecimal rs = formalClassBouns.calcuate(_1v1hours,_1v2hours,_1v3hours);
        return ResponseEntity.ok(rs);

    }
}
