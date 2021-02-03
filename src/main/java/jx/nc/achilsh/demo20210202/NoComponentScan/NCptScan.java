package jx.nc.achilsh.demo20210202.NoComponentScan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component//是个组件，并告诉spring 要为这个类创建一个bean.
@Slf4j
@ComponentScan //会扫描这个包以及这个包下的所有子包,查找带有@Component注解的类,会在Spring中自动为 其创建一个bean。
public class NCptScan {
    private int x;
    private double y;
    public NCptScan () {}
    //
    public void call() {
       log.info("xxx: yyyy");
    }
}
