package jx.nc.achilsh.demo20210202.AutoWireDemo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Slf4j
 class AWDemoAA {
    private int x;
    private int y;

    public void call() {
        log.info("AWDemo ======");
    }
}

@Service(value = "awdemoSvr")
public class AWDemo {
    private int zz;

    private AWDemoAA  demo;

    @Autowired
    public AWDemo(AWDemoAA de) {
        this.demo = de;

    }

    public void  mycall() {
        demo.call ();
    }
}
