
内容概括将以思维导图的方式，具体的细节将在代码里呈现。

## 推荐阅读
[小马哥讲Spring核心编程思想](https://github.com/mercyblitz/geekbang-lessons)

[spring-framework-reference 5.2.6.RELEASE](https://docs.spring.io/spring/docs/5.2.6.RELEASE/spring-framework-reference/core.html#spring-core)


## 思维导图
[Spring Note](http://note.youdao.com/noteshare?id=5d0554fbe0c408c04baed6b2aa68e7fe)


## 准备
构建Maven父子类工程
1. 创建一个Maven项目，然后通过`dependencyManagement`进行依赖管理
2. 把需要依赖的包，通过`dependencies`引入
3. 创建子类工程，例如`spring-ioc`。通过`parent`引入父类，然后选择把需要依赖的包，通过`dependencies`引入
```xml
<parent>
    <artifactId>spring</artifactId>
    <groupId>com.example</groupId>
    <version>0.0.1-SNAPSHOT</version>
    <!-- 父类的相对路径 -->
    <relativePath>../pom.xml</relativePath>
</parent>
<modelVersion>4.0.0</modelVersion>

<artifactId>spring-ioc</artifactId>

<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
    </dependency>
</dependencies>
```








