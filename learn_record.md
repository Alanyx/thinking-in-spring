# geekbang-lessons

#### 202020907(01-04)

#### 20202097-08(05-08)

#### 202020909(13-16)

- 17 课练习: JavaBeansDemo、

#### 202020910(17-21)

- 有机会阅读《Expert One-on-OneTM J2EETM Development without EJBTM》

### 第 3 章

代码目录： ioc-container-overview

#### 202020910(22)

#### 22

> 代码：org.geekbang.thinking.in.spring.ioc.overview.dependency

- ObjectFactory、BeanFactory、FactoryBean 有什么区别？

### 202020914(23-26)

#### 23/24

>  代码：org.geekbang.thinking.in.spring.ioc.overview.dependency

### 202020915(27-34)

#### 28

> 代码: org.geekbang.thinking.in.spring.ioc.overview.container

#### 29

>[源码简要分析(查看概要主体步骤即可)]
>
> applicationContext.refresh();
>
>applicationContext.close();

- 复习 java 的 hook (勾子函数)，并代码实践练习

#### 30

- 复习工厂方法，最好在代码中去实操练习

- 学习 FactoryBean 的源码，理解"创建 Bean 的一种方式，帮助实现复杂的初始化逻辑"

#### 31

#### 32

- 简要浏览 BeanDefinitionBuilder 源码

> 示例代码: org.geekbang.thinking.in.spring.bean.definition.BeanDefinitionCreationDemo

#### 33 

- 浏览 BeanNameGenerator 源码，查看默认实现 DefaultBeanNameGenerator

> DefaultBeanNameGenerator 使用了委派的方式实现

#### 34

> 示例代码: org.geekbang.thinking.in.spring.bean.definition.BeanAliasDemo

### 202020916(35-37)

#### 35

> 示例代码: org.geekbang.thinking.in.spring.bean.definition.AnnotationBeanDefinitionDemo

#### 36

> 示例代码:org.geekbang.thinking.in.spring.bean.definition.BeanInstantiationDemo 和 factory 目录下文件


> 示例代码:org.geekbang.thinking.in.spring.bean.definition.SpecialBeanInstantiationDemo

#### 37

> 示例代码（@PostConstruct 等注解初始化）:org.geekbang.thinking.in.spring.bean.factory.DefaultUserFactory

### 202020917(38-)

#### 38

> 示例代码 org.geekbang.thinking.in.spring.bean.definition.BeanInitializationDemo

#### 39

> 示例代码（@PostConstruct 等注解初始化）:org.geekbang.thinking.in.spring.bean.factory.DefaultUserFactory

- 阅读 applicationContext.close(); 源码，查看什么时候调用了销毁的方法

- 查看 @PostConstruct 的源码调用，理解工作原理

#### 40

> 示例代码（org.geekbang.thinking.in.spring.bean.definition.BeanGarbageCollectionDemo + DefaultUserFactory(finalize)

#### 41

> 示例代码 org.geekbang.thinking.in.spring.bean.definition.SingletonBeanRegistrationDemo
