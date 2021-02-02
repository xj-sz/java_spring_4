package jx.nc.achilsh.demo20210202;

import jx.nc.achilsh.demo20210202.Busi.*;
import jx.nc.achilsh.demo20210202.Cfg.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Demo20210202Application {

    public static void main ( String[] args ) {

        ApplicationContext ac = new AnnotationConfigApplicationContext ( StuConfig.class );
        DefineDemo demo = (StuDemo)ac.getBean("defDemo");
        demo.display ();
        ///



        ApplicationContext oac = new AnnotationConfigApplicationContext ( OtherBeanCfg.class , StuConfig.class);
        OtherBean demoOther = (OtherBean)oac.getBean("test2Demo");
        demoOther.otherCall ();

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext( ComputerCfg.class, MouseCfg.class, KbCfg.class);

        Computer computer=(Computer)applicationContext.getBean("computer");
        computer.say();

        SpringApplication.run ( Demo20210202Application.class , args );


    }

}
