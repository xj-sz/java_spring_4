package jx.nc.achilsh.demo20210202.Cfg;


import jx.nc.achilsh.demo20210202.Busi.DefineDemo;
import jx.nc.achilsh.demo20210202.Busi.OtherBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* 通过javaconfig创建一个bean, 其中参数的 也是一个bean  对象，该对象由其他javaoconfig 创建的bean.
 */
@Configuration
public class OtherBeanCfg {
    @Bean(name="test2Demo")
    OtherBean oBean( DefineDemo demo) {
       return new OtherBean ( demo );
    }

}
