package com.baizhi.test;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.Order;
import com.baizhi.entity.Student;
import com.baizhi.entity.User;
import com.baizhi.factorybean.MyConnection;
import com.baizhi.service.UserService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class TestFactory {

    //测试第一个Spring程序
    @Test
    public  void   test1(){
        //创建Spring工厂
        ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        //创建对象
        User user =(User) ac.getBean("user");
        System.out.println(user);
        User user1 =(User) ac.getBean("user");
        System.out.println(user1);
    }

    //创建DAO实现类对象
    @Test
    public  void   test2(){
        //创建Spring工厂
        ApplicationContext ac= new  ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO=(UserDAO)ac.getBean("userDAO");
        userDAO.save();
    }
    //Spring工厂创建对象的原理
    @Test
    public  void  test3() throws Exception {
        //通过反射创建类对象
        Class<?> aClass = Class.forName("com.baizhi.entity.User");
        //通过类对象 创建类的对象
        Object o = aClass.newInstance();
        User  user=(User)o;
        System.out.println(user);
    }
    //测试Service
    @Test
    public   void  test4() throws Exception{
        ApplicationContext ac=  new  ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService) ac.getBean("userService");
        userService.register();
    }
    //测试构造注入
    @Test
    public  void   test5() throws  Exception{
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        //创建Order对象
        Order order=(Order) ac.getBean("order");
        System.out.println(order);
    }
    //测试FactoryBean
    @Test
    public  void   test6() throws Exception{
        ApplicationContext ac=  new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意：如果一个类实现了FactoryBean接口，通过该类的ID 获取到是由该类所创建的复杂对象
        Connection connection=(Connection) ac.getBean("connection");
        System.out.println(connection);
        Connection connection1=(Connection) ac.getBean("connection");
        System.out.println(connection1);
        //如果想要获取改类的对象需要在id之前加&号
        MyConnection myConnection=(MyConnection) ac.getBean("&connection");
        System.out.println(myConnection);
    }
    //测试FactoryBean
    @Test
    public  void   test7() throws  Exception{
        ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory sqlSessionFactory=(SqlSessionFactory) ac.getBean("sqlSessionFactory");
        System.out.println(sqlSessionFactory);
        SqlSessionFactory sqlSessionFactory1=(SqlSessionFactory) ac.getBean("sqlSessionFactory");
        System.out.println(sqlSessionFactory1);
    }

    @Test
    public  void   test8() throws Exception{
     ClassPathXmlApplicationContext  ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student =(Student) ac.getBean("student");
        Student student1 =(Student) ac.getBean("student");
        System.out.println(student);
        System.out.println(student1);
        //关闭工厂
        ac.close();
    }
}
