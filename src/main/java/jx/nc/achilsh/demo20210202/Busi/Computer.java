package jx.nc.achilsh.demo20210202.Busi;

import jx.nc.achilsh.demo20210202.NoComponentScan.NCptScan;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/***
 * 定义具体实例，其中computer bean 通过 javaconfig来实现
 */

@Data
@Slf4j
public class Computer {
    private Mouse ms;
    private Keyboard kb;

    @Autowired(required =  true)
    private NCptScan oneScan;

    public Computer(Mouse m, Keyboard kb) {
        this.ms = m;
        this.kb = kb;
    }

    public void say() {
        log.info("........");
    }
}
