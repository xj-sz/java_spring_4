package jx.nc.achilsh.demo20210202.Busi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class OtherBean {
    private DefineDemo demoOne;
    private int yy;

    public OtherBean(DefineDemo demo) {
        this.demoOne= demo;
        this.yy = 1000;
    }

    public void otherCall() {
       log.info("otherbean call: " + OtherBean.class);
    }
}
