package jx.nc.achilsh.demo20210202.Cfg;

import jx.nc.achilsh.demo20210202.Busi.DefineDemo;
import jx.nc.achilsh.demo20210202.Busi.StuDemo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 使用javaconfig 创建一个子类bean
 */
@Configuration
public class StuConfig {
    @Bean
    DefineDemo defDemo() {
        return new StuDemo ();
    }

}
