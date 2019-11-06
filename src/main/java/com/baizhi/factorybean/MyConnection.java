package com.baizhi.factorybean;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

//创建Connection对象
public class MyConnection implements FactoryBean<Connection> {
     /*
     * 作用：书写创建复杂对象的步骤
     *
     * */
    @Override
    public Connection getObject() throws Exception {
        //加载驱动
        Class.forName("oracle.jdbc.OracleDriver");
        //获取连接
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
        return connection;
    }

    /*
    * 作用:返回复杂对象的类型
    *
    * */
    @Override
    public Class<?> getObjectType() {
        return Connection.class;
    }

    /*
    * 作用：控制创建复杂对象的次数
    * false: 每次创建新的对象
    * true:  只创建一次
    * 返回值根据实际情况定
    * */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
