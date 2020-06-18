# mybatis3-note

## 内容
* Mybatis的基本使用及扩展
* Mybatis源码分析

## 介绍
MyBatis 是一款优秀的持久层框架，它支持自定义 SQL、存储过程以及高级映射。

如果想学习Mybatis的基本使用，推荐阅读[Mybatis官网中文文档](https://mybatis.org/mybatis-3/zh/configuration.html#properties)，官方文档认真为我们介绍了Mybatis的使用并且给出了大量的示例。如果你阅读过，一定会觉得写得非常好，是每个人学习Mybatis的首选资料。我们可以看到Mybatis的功能非常强大，我们也可以自定义扩展一些东西，如：typeHandlers、objectFactory、Interceptor等。如果你是Spring用户，那么推荐你阅读[Mybatis-Spring](http://mybatis.org/spring/zh/getting-started.html)，基于注解的方式有时使我们的内容更清晰，在Mybatis中也提供了很多好用的注解。

为了方便掌握重点，我将Mybatis官网的文档选择性的进行了截取整理，详细内容见[有道云笔记。](http://note.youdao.com/noteshare?id=403a5a842f0751d825e19d4d8381b895&sub=2C6BC21BB2E74D1695002B219D9290B2)

## 示例

在[mybatis-demo](mybatis-demo)示例中，主要演示了Mybatis的基本使用，Mybatis的执行流程。为了方便了解Mybatis的实现原理和过程，方便源码阅读，我们可以将Mybatis的日志开启。示例中所用到的数据库脚本在[script/test.sql](script/test.sql)

在[mybatis-spring-demo](mybatis-spring-demo)示例中，为了方便，我们使用Spring注解的方法，而不是XML的方式，在Mapper中我们也是使用Mybatis注解的方式。

在[mybatis-source](mybatis-source)示例中，这一部分则为源码阅读。

## 阅读

* [Mybatis官网中文文档](https://mybatis.org/mybatis-3/zh/configuration.html#properties)
* [Mybatis-Spring](http://mybatis.org/spring/zh/getting-started.html)
