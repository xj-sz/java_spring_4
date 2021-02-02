package jx.nc.achilsh.demo20210202.Cfg;


import jx.nc.achilsh.demo20210202.Busi.Computer;
import jx.nc.achilsh.demo20210202.Busi.Keyboard;
import jx.nc.achilsh.demo20210202.Busi.Mouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComputerCfg {
    @Bean
    public Computer computer( Mouse m, Keyboard kb) {
        return new Computer(m, kb);
    }
}
