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

[done]

> 代码：org.geekbang.thinking.in.spring.ioc.overview.dependency

- ObjectFactory、BeanFactory、FactoryBean 有什么区别？

### 202020914(23-26)

#### 23/24

[done]

>  代码：org.geekbang.thinking.in.spring.ioc.overview.dependency

### 202020915(27-34)

#### 28

[done]

> 代码: org.geekbang.thinking.in.spring.ioc.overview.container

#### 29

[done]

>[源码简要分析(查看概要主体步骤即可)]
>
> applicationContext.refresh();
>
>applicationContext.close();

- 复习 java 的 hook (勾子函数)，并代码实践练习

#### 30

[done]

- 复习工厂方法，最好在代码中去实操练习

- 学习 FactoryBean 的源码，理解"创建 Bean 的一种方式，帮助实现复杂的初始化逻辑"

#### 31

[done]

#### 32

[done]

- 简要浏览 BeanDefinitionBuilder 源码

> 示例代码: org.geekbang.thinking.in.spring.bean.definition.BeanDefinitionCreationDemo

#### 33 

[done]

[done]

- 浏览 BeanNameGenerator 源码，查看默认实现 DefaultBeanNameGenerator

> DefaultBeanNameGenerator 使用了委派的方式实现

#### 34

[done]

> 示例代码: org.geekbang.thinking.in.spring.bean.definition.BeanAliasDemo

### 202020916(35-37)

#### 35

[done]

> 示例代码: org.geekbang.thinking.in.spring.bean.definition.AnnotationBeanDefinitionDemo

#### 36

[done]

> 示例代码:org.geekbang.thinking.in.spring.bean.definition.BeanInstantiationDemo 和 factory 目录下文件

[done]

> 示例代码:org.geekbang.thinking.in.spring.bean.definition.SpecialBeanInstantiationDemo

#### 37

[done]

> 示例代码（@PostConstruct 等注解初始化）:org.geekbang.thinking.in.spring.bean.factory.DefaultUserFactory

### 202020917(38-41)

#### 38

[done]

> 示例代码 org.geekbang.thinking.in.spring.bean.definition.BeanInitializationDemo

#### 39

[done]

> 示例代码（@PostConstruct 等注解初始化）:org.geekbang.thinking.in.spring.bean.factory.DefaultUserFactory

- 阅读 applicationContext.close(); 源码，查看什么时候调用了销毁的方法

- 查看 @PostConstruct 的源码调用，理解工作原理

#### 40

[done]

> 示例代码（org.geekbang.thinking.in.spring.bean.definition.BeanGarbageCollectionDemo + DefaultUserFactory(finalize)

#### 41

[done]

> 示例代码 org.geekbang.thinking.in.spring.bean.definition.SingletonBeanRegistrationDemo

### 202020916(42-45)

#### 42

- 查资料，了解和简要小结 java 的 JNDI、BeanContext

#### 43

[done]

> 示例代码 org.geekbang.thinking.in.spring.dependency.lookup.ObjectProviderDemo#lookupByObjectProvider

#### 44

[done]

- 查资料，了解  org.springframework.beans.factory.ListableBeanFactory 基本源码

#### 45 

[done]

- 查资料，了解 HierarchicalBeanFactory 作用

> 示例代码 org.geekbang.thinking.in.spring.dependency.lookup.HierarchicalDependencyLookupDemo

### 202020920(46-50)

#### 46
 
- 查资料，动手实践 java 8 中的 Lambada 表达式(如 Function、Consumer、Supplier 等)

> 示例代码 org.geekbang.thinking.in.spring.dependency.lookup.ObjectProviderDemo#其他方法

#### 47

[done]

> 示例代码 org.geekbang.thinking.in.spring.dependency.lookup.TypeSafetyDependencyLookupDemo

#### 48

[done]

> 示例代码 无，可以逐一查看 ppt 给定的类了解基本情况

#### 49

[done]

异常分为非检查异常(runtime exception)和检查异常(需要 try catch)

> 示例代码 org.geekbang.thinking.in.spring.dependency.lookup.NoUniqueBeanDefinitionExceptionDemo

> 示例代码 org.geekbang.thinking.in.spring.dependency.lookup.BeanInstantiationExceptionDemo

> 示例代码 org.geekbang.thinking.in.spring.dependency.lookup.BeanCreationExceptionDemo

#### 50

无

### 202020921(51-54)

#### 51

无

#### 52

无

#### 53

> 简单了解代码 org.springframework.beans.factory.annotation.Autowire
> 和 org.springframework.beans.factory.config.AutowireCapableBeanFactory 看看自动绑定的模式

#### 54

- 阅读官方文档，查看 Autowring 的不足 
https://docs.spring.io/spring/docs/5.2.2.RELEASE/spring-framework- reference/core.html#beans-autowired-exceptions

### 202021012

#### 55

[done]

> org.geekbang.thinking.in.spring.ioc.dependency.injection.setter 目录
>
>org.geekbang.thinking.in.spring.ioc.dependency.injection.UserHolder

### 202021013

#### 56

[done]

> org.geekbang.thinking.in.spring.ioc.dependency.injection.constructor

#### 57

[done]

> org.geekbang.thinking.in.spring.ioc.dependency.injection.field

- 查找资料，了解 AutowiredAnnotationBeanPostProcessor

#### 58

[done]

> org.geekbang.thinking.in.spring.ioc.dependency.injection.method

#### 59

[done]

> org.geekbang.thinking.in.spring.ioc.dependency.injection.interfaceCallback.AwareInterfaceDependencyInjectionDemo

#### 60

无

#### 61

[done]

> org.geekbang.thinking.in.spring.ioc.overview.domain.User 依赖注入的属性（City、Resource）
>
> 和对应的 src/main/resources/META-INF/dependency-lookup-context.xml

#### 62

[done]

> org.geekbang.thinking.in.spring.ioc.overview.domain.User 依赖注入的属性（City[]、List<City>）
>
> 和对应的 src/main/resources/META-INF/dependency-lookup-context.xml

#### 63

[done]

> org.geekbang.thinking.in.spring.ioc.dependency.injection.QualifierAnnotationDependencyInjectionDemo

#### 64

[done]

> org.geekbang.thinking.in.spring.ioc.dependency.injection.LazyAnnotationDependencyInjectionDemo

### 202021014

#### 65

[done]

> org.geekbang.thinking.in.spring.ioc.dependency.injection.AnnotationDependencyInjectionResolutionDemo
>
> 断点查看源码 DefaultListableBeanFactory#resolveDependency 和依赖描述符- DependencyDescriptor

#### 66

> 同上：查找资料了解 DefaultListableBeanFactory 和 AutowiredAnnotationBeanPostProcessor 的基本原理和源码，重点断点查看 @Autowired注入的过程
>
> 借助 idea 的线程堆栈查看

#### 67

> 查找资料了解 AutowiredAnnotationBeanPostProcessor 的基本原理和源码（参见 AutowiredAnnotationBeanPostProcessor 的构造器，支持 @Inject）

#### 68

> 查找资料了解 CommonAnnotationBeanPostProcessor 的基本原理和源码

#### 69

[done]

> org.geekbang.thinking.in.spring.ioc.dependency.injection.AnnotationDependencyInjectionResolutionDemo

#### 70

无

### 202021015

#### 71

[done]

>  org.springframework.context.annotation.AnnotationConfigUtils
>
> 查资料了解 AnnotationConfigUtils#registerAnnotationConfigProcessors

#### 72

> 查资料了解 AbstractApplicationContext#prepareBeanFactory

[done]
> org.geekbang.thinking.in.spring.ioc.dependency.source.DependencySourceDemo

#### 73

> 浏览总体类 org.springframework.beans.factory.support.BeanDefinitionRegistry
>
> 阅读 BeanDefinitionRegistry#registerBeanDefinition 在 DefaultListableBeanFactory 中的实现

#### 74

> 阅读 org.springframework.beans.factory.support.DefaultListableBeanFactory#registerBeanDefinition

#### 75

> SingletonBeanRegistry#registerSingleton
>
>阅读 SingletonBeanRegistry#registerSingleton 在 DefaultListableBeanFactory 中的实现

#### 76

> 查资料了解 ConfigurableListableBeanFactory#registerResolvableDependency


>org.geekbang.thinking.in.spring.ioc.dependency.source.ResolvableDependencySourceDemo

#### 77

> org.geekbang.thinking.in.spring.ioc.dependency.source.ExternalConfigurationDependencySourceDemo

#### 78

无

#### 79

无

#### 80

> DefaultListableBeanFactory#isSingleton

### 202021016

#### 81

> org.geekbang.thinking.in.spring.ioc.bean.scope.BeanScopeDemo

#### 82

> org.geekbang.thinking.in.spring.ioc.bean.scope.web.controller.IndexController

> org.geekbang.thinking.in.spring.ioc.bean.scope.web.WebConfiguration

### 202021018

#### 83

> 阅读了解 SessionScope 实现（SessionScope 源码）

#### 84

> 阅读了解 ApplicationScope 实现（org.springframework.web.context.support.ServletContextScope 源码）

#### 85

> org.geekbang.thinking.in.spring.ioc.bean.scope.ThreadLocalScope

#### 86

> 查资料了解 spring-cloud 的 org.springframework.cloud.context.config.annotation.RefreshScope
>
>简单了解自定义作用域

#### 87

无

#### 88

> org.geekbang.thinking.in.spring.bean.lifecycle.BeanMetadataConfigurationDemo
> [涉及的类：XmlBeanDefinitionReader]

#### 89

> org.geekbang.thinking.in.spring.bean.lifecycle.AnnotatedBeanDefinitionParsingDemo

#### 90

> 简要了解 org.springframework.beans.factory.support.BeanDefinitionRegistry
> 和实现类 org.springframework.beans.factory.support.DefaultListableBeanFactory#registerBeanDefinition()
> 阅读 DefaultListableBeanFactory#registerBeanDefinition() 源码

### 202021019

#### 91

> 合并
> src/main/resources/META-INF/dependency-lookup-context.xml

> org.geekbang.thinking.in.spring.bean.lifecycle.MergedBeanDefinitionDemo
> 断点调试 merge(GenericBeanDefinition) 和 非 merge(RootBeanDefinition)
> 找资料阅读 AbstractBeanFactory#getMergedBeanDefinition(String name)

### 202021021
#### 92 | Spring Bean Class加载阶段：Bean ClassLoader能够被替换吗?

> 查资料断点理解 org.springframework.beans.factory.support.AbstractBeanFactory#createBean(String beanName, RootBeanDefinition mbd, @Nullable Object[] args)
>
> 断点查看其子类实现 org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#createBean

#### 93 | Spring Bean实例化前阶段：Bean的实例化能否被绕开？

> org.geekbang.thinking.in.spring.bean.lifecycle.BeanInstantiationLifecycleDemo
>
> 阅读 postProcessBeforeInstantiation 的源码调用： org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#applyBeanPostProcessorsBeforeInstantiation

> org.geekbang.thinking.in.spring.bean.lifecycle.MyInstantiationAwareBeanPostProcessor

### 202021022
#### 94 | Spring Bean实例化阶段：Bean实例是通过Java反射创建吗？

> 断点调试 AbstractAutowireCapableBeanFactory@doCreateBean 方法源码
>
> org.springframework.beans.factory.support.InstantiationStrategy


> org.geekbang.thinking.in.spring.bean.lifecycle.BeanInstantiationLifecycleDemo
>
> org.geekbang.thinking.in.spring.bean.lifecycle.UserHolder
>
> src/main/resources/META-INF/bean-constructor-dependency-injection.xml

#### 95 | Spring Bean实例化后阶段：Bean实例化后是否一定被是使用吗？

> org.geekbang.thinking.in.spring.bean.lifecycle.BeanInstantiationLifecycleDemo
>
> org.geekbang.thinking.in.spring.bean.lifecycle.MyInstantiationAwareBeanPostProcessor

### 202021025

#### 96 | Spring Bean属性赋值前阶段：配置后的PropertyValues还有机会修改吗？

#### 97 | Aware接口回调阶段：众多Aware接口回调的顺序是安排的？

> org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#invokeAwareMethods
> 回调 org.geekbang.thinking.in.spring.bean.lifecycle.UserHolder的 XXXAware 的实现方法

#### 98 | Spring Bean初始化前阶段：BeanPostProcessor

[todo]  强调 applyBeanPostProcessorsBeforeInitialization 中调用 @PostConstruct 注解方法

> org.geekbang.thinking.in.spring.bean.lifecycle.BeanInitializationLifecycleDemo

> 对应的源码 org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#initializeBean()  内部实现==> applyBeanPostProcessorsBeforeInitialization

#### 99 | Spring Bean初始化阶段：@PostConstruct、InitializingBean以及自定义方法

> org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean  内部实现==> invokeInitMethods

#### 100 | Spring Bean初始化后阶段：BeanPostProcessor

> org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean  内部实现==> applyBeanPostProcessorsAfterInitialization
 
#### 101 | Spring Bean初始化完成阶段：SmartInitializingSingleton

> 查资料了解 org.springframework.beans.factory.SmartInitializingSingleton

#### 102 | Spring Bean销毁前阶段：DestructionAwareBeanPostProcessor 用在怎样的场景?

> org.geekbang.thinking.in.spring.bean.lifecycle.BeanLifecycleDemo

> 查资料了解 DestructionAwareBeanPostProcessor
>
> 回调代码在 CommonAnnotationBeanPostProcessor，注册在其构造方法中

> org.geekbang.thinking.in.spring.bean.lifecycle.MyDestructionAwareBeanPostProcessor

#### 103 | Spring Bean销毁阶段：@PreDestroy、DisposableBean以及自定义方法

> org.geekbang.thinking.in.spring.bean.lifecycle.UserHolder

> org.geekbang.thinking.in.spring.bean.lifecycle.BeanLifecycleDemo ： 需要显示的调用 beanFactory.destroyBean

#### 104 | Spring Bean垃圾收集（GC）：何时需要GC Spring Bean？

> org.geekbang.thinking.in.spring.bean.lifecycle.UserHolder

> org.geekbang.thinking.in.spring.bean.lifecycle.BeanLifecycleDemo

### 202021026    

#### 106 | Spring配置元信息：Spring存在哪些配置元信息？它们分别用在什么场景？

无

#### 107 | Spring Bean配置元信息：BeanDefinition

- 复习 jvm 类加载的过程（深入拆解 JVM）

#### 108 | Spring Bean属性元信息：PropertyValues

> org.geekbang.thinking.in.spring.configuration.metadata.BeanConfigurationMetadataDemo

#### 109 | Spring容器配置元信息

> 查资料了解作用 org.springframework.beans.factory.xml.BeanDefinitionParserDelegate

- 查资料了解 dtd 

#### 110 | 基于XML资源装载Spring Bean配置元信息

- 详见 113

#### 111 | 基于Properties资源装载Spring Bean配置元信息：为什么Spring官方不推荐？

> 查资料掌握 org.springframework.beans.factory.support.PropertiesBeanDefinitionReader

> src/main/resources/META-INF/user-bean-definitions.properties
>
> org.geekbang.thinking.in.spring.configuration.metadata.PropertiesBeanDefinitionReaderDemo

#### 112 | 基于Java注解装载Spring Bean配置元信息

无

> 查资料了解各个注解的源码实现类

#### 113 | Spring Bean配置元信息底层实现之XML资源

> 查资料掌握 XmlBeanDefinitionReader

> 查资料了解 org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader


核心 API - XmlBeanDefinitionReader
• 资源 - Resource
• 底层 - BeanDefinitionDocumentReader
• XML解析-JavaDOMLevel3API
• BeanDefinition 解析 - BeanDefinitionParserDelegate
• BeanDefinition 注册 - BeanDefinitionRegistry

#### 114 | Spring Bean配置元信息底层实现之Properties资源

SpringProperties资源BeanDefinition解析与注册 
• 核心 API - PropertiesBeanDefinitionReader
    • 资源
        • 字节流 - Resource
        • 字符流 - EncodedResouce • 底层
    • 存储 - java.util.Properties
    • BeanDefinition 解析 - API 内部实现
    • BeanDefinition 注册 - BeanDefinitionRegistry

#### 115 | Spring Bean配置元信息底层实现之Java注解

SpringJava注册BeanDefinition解析与注册 
• 核心 API - AnnotatedBeanDefinitionReader
    • 资源
        • 类对象 - java.lang.Class
    • 底层
        • 条件评估 - ConditionEvaluator
        • Bean 范围解析 - ScopeMetadataResolver
        • BeanDefinition 解析 - 内部 API 实现
        • BeanDefinition 处理 - AnnotationConfigUtils.processCommonDefinitionAnnotations
        • BeanDefinition 注册 - BeanDefinitionRegistry

> 温习理解 org.geekbang.thinking.in.spring.bean.lifecycle.AnnotatedBeanDefinitionParsingDemo

### 20201029

#### 116 | 基于XML资源装载Spring IoC容器配置元信息

无

### 20201106
#### 117 | 基于Java注解装载Spring IoC容器配置元信息

> org.geekbang.thinking.in.spring.configuration.metadata.AnnotatedSpringIoCContainerMetadataConfigurationDemo
>
> 实践测试 @ImportResource、@Import

> @PropertySource、、、、
 
#### 118 | 基于Extensible XML authoring 扩展Spring XML元素

[todo] 暂时没学

#### 119 | Extensible XML authoring扩展原理

[todo] 暂时没学

#### 120 | 基于Properties资源装载外部化配置

> org.geekbang.thinking.in.spring.configuration.metadata.PropertySourceDemo

#### 121 | 基于YAML资源装载外部化配置

> src/main/resources/META-INF/user.yaml
>
>src/main/resources/META-INF/yaml-property-source-context.xml

> org.geekbang.thinking.in.spring.configuration.metadata.XmlBasedYamlPropertySourceDemo

> org.geekbang.thinking.in.spring.configuration.metadata.YamlPropertySourceFactory
>
> org.geekbang.thinking.in.spring.configuration.metadata.AnnotatedYamlPropertySourceDemo

#### 122 | 面试题

- 查资料熟悉 spring 的模块组成并记忆

### 20201107
#### 123 | 引入动机：为什么Spring不使用Java标准资源管理，而选择重新发明轮子？

无

#### 124 | Java标准资源管理：Java URL资源管理存在哪些潜规则？

> 了解 java.net.URLStreamHandlerFactory + java.net.URLStreamHandler + java.net.URL
 
#### 125 | Spring资源接口：Resource接口有哪些语义？它是否“借鉴”了SUN的实现呢？

> 了解 
> 输入流 org.springframework.core.io.InputStreamSource
 只读资源 org.springframework.core.io.Resource
 可写资源 org.springframework.core.io.WritableResource
 编码资源 org.springframework.core.io.support.EncodedResource
 上下文资源 org.springframework.core.io.ContextResource

#### 126 | Spring内建Resource实现：Spring框架提供了多少种内建的Resource实现呢？

```
了解基本概要
Bean 定义 org.springframework.beans.factory.support.BeanDefinit ionResource
数组 org.springframework.core.io.ByteArrayResource
类路径(classpath:/) org.springframework.core.io.ClassPathResource
文件系统(file:/)org.springframework.core.io.FileSystemResource
URL(URL 支持的协议)org.springframework.core.io.UrlResource
ServletContext org.springframework.web.context.support.ServletConte xtResource
```

#### 127 | Spring Resource接口扩展：Resource能否支持写入以及字符集编码？

> org.geekbang.thinking.in.spring.resource.EncodedFileSystemResourceDemo

#### 128 | Spring资源加载器：为什么说Spring应用上下文也是一种Spring资源加载器？

> org.geekbang.thinking.in.spring.resource.EncodedFileSystemResourceLoaderDemo

#### 129 | Spring通配路径资源加载器：如何理解路径通配Ant模式？

无

#### 130 | Spring通配路径模式扩展：如何扩展路径匹配的规则？

> org.geekbang.thinking.in.spring.resource.CustomizedResourcePatternResolverDemo
>
> org.geekbang.thinking.in.spring.resource.util.ResourceUtils

#### 131 | 依赖注入Spring Resource：如何在XML和Java注解场景注入Resource对象？

> org.geekbang.thinking.in.spring.resource.InjectingResourceDemo

#### 132 | 依赖注入ResourceLoader：除了ResourceLoaderAware回调注入，还有哪些注入方法？

- 复习 ResourceLoaderAware 的加载时期/顺序

> org.geekbang.thinking.in.spring.resource.InjectingResourceLoaderDemo

#### 133 | 面试题精选

> sun.net.www.protocol.x 包路径
>
> org.geekbang.thinking.in.spring.resource.springx
 
 
### 20201108 
#### 143 | Spring校验使用场景：为什么Validator并不只是Bean的校验？

无

#### 144 | Validator接口设计：画虎不成反类犬？

> 了解 org.springframework.validation.Validator + org.springframework.validation.ValidationUtils

#### 145 | Errors接口设计：复杂得没有办法理解？

> org.geekbang.thinking.in.spring.validation.ErrorsMessageDemo

#### 146 | Errors文案来源：Spring国际化充当临时工？

> 了解 org.springframework.validation.Errors（不常用）

#### 147 | 自定义Validator：为什么说Validator容易实现，却难以维护？

> org.geekbang.thinking.in.spring.validation.ValidatorDemo

#### 148 | Validator的救赎：如果没有Bean Validation，Validator将会在哪里吗？

> src/main/resources/META-INF/bean-validation-context.xml
>
> org.geekbang.thinking.in.spring.validation.SpringBeanValidationDemo

#### 149 | 面试题精选

无

#### 
#### 
#### 
#### 
#### 
#### 
#### 
#### 
#### 
####
#### 
#### 
#### 
#### 
#### 
#### 
#### 
#### 
#### 
#### 
#### 
####
#### 
#### 
#### 
#### 
#### 
#### 
#### 
#### 
#### 
#### 
#### 
####
#### 
#### 
#### 
#### 
#### 
#### 
#### 
#### 
#### 
#### 
#### 
####
#### 
#### 
#### 
#### 
#### 
#### 
#### 
#### 
#### 
#### 
#### 
####
