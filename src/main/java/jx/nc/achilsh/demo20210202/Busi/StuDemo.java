package jx.nc.achilsh.demo20210202.Busi;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StuDemo implements  DefineDemo {
    private int x;
    @Override
    public void display() {
        log.info("00000000000000000display: " + StuDemo.class);
    }
}
