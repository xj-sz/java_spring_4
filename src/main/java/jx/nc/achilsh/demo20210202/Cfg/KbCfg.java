package jx.nc.achilsh.demo20210202.Cfg;

import jx.nc.achilsh.demo20210202.Busi.Keyboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KbCfg {
    @Bean
    public Keyboard kboard() {
        return new Keyboard ( "kb", "2k" );
    }
}
