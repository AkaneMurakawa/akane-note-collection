# Spring Boot使用MySQL数据库的简单实例

首先你需要在`application.properties`配置相应的数据源，sql脚本见`/sql/user.sql`,测试内容见`com.example.mybatis.UserMapperTest`

## 说明

在这里使用的是mybatis的通用插件tkmybatis，无需编写xml文件，在Mapper接口中继承tk.mybatis.mapper.common.Mappe和MysqlMapper，并配置@Mapper注解即可。

当然你也可以继续编写xml文件，创建自己的Mapper.xml，那么你需要在`application.properties`配置文件下配置相应的内容。

## 版本问题
**需要注意的是:**由于不同版本的Spring Boot所引入的mysql-connector-java包不同

```properties
# 对应的是mysql-connector-java 5
spring.datasource.driver-class-name=com.mysql.jdbc.Driver

# 对应的是mysql-connector-java 6 连接需要指定时区
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

## 推荐使用

在这里分页插件选择的是Mybatis的分页插件PageHelper

推荐使用MyBatisCodeHelperPro插件。

## 额外的话题
为了保证安全性，这里用户信息用到了密码加盐哈希的方法，推荐阅读文章：[加盐密码哈希：如何正确使用](https://www.oschina.net/news/49852/salted-password-hash)

