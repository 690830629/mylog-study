logback是由log4j创始人设计的另一个开源日志组件 性能比log4j要好

logback-core 其他两个模块的基础
logback-classic 它是log4j的一个改良版本 同时它完整实现了slf4j API 
logback-access 访问模块与servlet容器继承提供通过Http来访问日志的功能

logback 会依次读取以下类型配置文件

logback.groovy
logback-test.xml
logback.xml 如果均不存在会采用默认配置

logback组件之间的关系
1、Logger : 日志的记录器 把它关联到应用的对用的context上后，主要用于存放日志对象，也可以定义日志类型
级别
2、Appender:用于指定日志输出的目的地 目的地可以是控制台，文件 ，数据库等
3、Layout:负责把事件转换成字符串，格式化的日志信息的输出，在logback中Layout对象被封装在encoder中