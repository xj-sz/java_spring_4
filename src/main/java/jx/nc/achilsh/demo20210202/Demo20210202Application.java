package jx.nc.achilsh.demo20210202;

import jx.nc.achilsh.demo20210202.AutoWireDemo.AWDemo;
import jx.nc.achilsh.demo20210202.Busi.*;
import jx.nc.achilsh.demo20210202.Cfg.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

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

        ///
        ApplicationContext autoDemo = new AnnotationConfigApplicationContext( AWDemo.class);

        AWDemo demoAW = (AWDemo) autoDemo.getBean("awdemoSvr");
        demoAW.mycall ();

        SpringApplication.run ( Demo20210202Application.class , args );


    }

}
