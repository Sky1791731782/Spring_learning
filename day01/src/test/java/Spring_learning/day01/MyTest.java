package Spring_learning.day01;

import Spring_learning.day01.service1.ServiceTest;
import Spring_learning.day01.service1.impl.ServiceTestImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.security.Provider;

public class MyTest {
    @Test
    public void test01(){
        ServiceTest service = new ServiceTestImpl();//不用Spring创建对象
        service.test();
    }
    @Test
    public void test02(){
        //使用Spring创建的对象
        //1.指定Spring配置文件的名称
        String config = "beans.xml";
        //2.创建表示Spring容器的对象 ，ApplicationContext
        //  ApplicationContext 表示Spring的容器，通过容器对象就能使用对象
        //ClassPathXmlApplicationContext从类路径中加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取对象
        ServiceTest st = (ServiceTest)ac.getBean("service");//常用方法参数是配置文件中的ID值
        //使用Spring创建好的对象
        st.test();
    }
}
