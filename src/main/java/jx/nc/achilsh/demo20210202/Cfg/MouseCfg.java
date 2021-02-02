package jx.nc.achilsh.demo20210202.Cfg;

import jx.nc.achilsh.demo20210202.Busi.Keyboard;
import jx.nc.achilsh.demo20210202.Busi.Mouse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MouseCfg {
    @Bean
    public Mouse mouse() {
        return new Mouse("wu", "3k");
    }
}
