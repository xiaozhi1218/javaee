package com.itheima.demo2_Drivermanager类;

/**
 * @Author：pengzhilin
 * @Date: 2020/10/7 10:11
 */
public class Test {
    public static void main(String[] args) {
        /*
            DriverManager类:
                 public static void registerDriver(Driver driver) ;注册驱动\加载驱动
                    com.mysql.jdbc.Driver类:静态代码块
                        static {
                            try {
                                DriverManager.registerDriver(new Driver());
                            } catch (SQLException var1) {
                                throw new RuntimeException("Can't register driver!");
                            }
                        }
                    通过查询Driver类的静态代码块发现,如果使用API的方式注册驱动,Driver会new两次,所有推荐这种写法:
                        Class.forName("com.mysql.jdbc.Driver");

                public static Connection  getConnection(String url, String user, String password);与数据库建立连接
                    参数1:要连接的数据库的路径  jdbc:mysql://ip地址:3306/数据库名?参数名=参数值
                    参数2:连接数据库的用户名
                    参数3:连接数据库的密码
         */
    }
}
