/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.geekbang.thinking.in.spring.ioc.dependency.injection;

import org.geekbang.thinking.in.spring.ioc.dependency.injection.annotation.InjectedUser;
import org.geekbang.thinking.in.spring.ioc.dependency.injection.annotation.MyAutowired;
import org.geekbang.thinking.in.spring.ioc.overview.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.*;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import javax.inject.Inject;
import java.util.Map;
import java.util.Optional;

/**
 * 注解驱动的依赖注入处理过程
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @see Qualifier
 * @since
 */
@Configuration
public class AnnotationDependencyInjectionResolutionDemo {

    @Autowired          // 依赖查找（处理） + 延迟
    @Lazy
    private User lazyUser;

    // 对应的属性在类 DependencyDescriptor ->
    // 必须（required=true）
    // 实时注入（eager=true)
    // 通过类型（User.class）
    // 字段名称（"user"）
    // 是否首要（primary = true)
    @Autowired          // 依赖查找（处理）
    private User user;

    @Autowired          // 集合类型依赖注入
    private Map<String, User> users; // user 、superUser

    /**
     * @Autowired 在 java8 后可以包装 Optional（可选的）
     */
    @MyAutowired
    private Optional<User> userOptional; // superUser

    @Inject // 效果与 @Autowired 是类似的，都是由 AutowiredAnnotationBeanPostProcessor 来处理
    private User injectedUser;

    @InjectedUser
    private User myInjectedUser;

//    @Bean(name = AUTOWIRED_ANNOTATION_PROCESSOR_BEAN_NAME)
//    public static AutowiredAnnotationBeanPostProcessor beanPostProcessor() {
//        AutowiredAnnotationBeanPostProcessor beanPostProcessor = new AutowiredAnnotationBeanPostProcessor();
//        // @Autowired + @Inject +  新注解 @InjectedUser 这种方式不安全（如 Inject 不存在）
//        Set<Class<? extends Annotation>> autowiredAnnotationTypes =
//                new LinkedHashSet<>(asList(Autowired.class, Inject.class, InjectedUser.class));
//        beanPostProcessor.setAutowiredAnnotationTypes(autowiredAnnotationTypes);
//        return beanPostProcessor;
//    }

    /**
     * 利用 AutowiredAnnotationBeanPostProcessor 实现自定义的依赖注入注解【非特殊需求不建议这样使用】
     * <p>
     * 注意这里使用的是静态方法: 会提早注册和初始化 bean
     *
     * @return
     */
    @Bean
    @Order(Ordered.LOWEST_PRECEDENCE - 3) // 加载顺序：倒数第三位
    @Scope
    public static AutowiredAnnotationBeanPostProcessor beanPostProcessor() {
        AutowiredAnnotationBeanPostProcessor beanPostProcessor = new AutowiredAnnotationBeanPostProcessor();
        // 替换原有的注解处理，使用新注解 @InjectedUser
        beanPostProcessor.setAutowiredAnnotationType(InjectedUser.class);
        // 方式2：这种方式不安全（如 Inject 不存在）
//        Set<Class<? extends Annotation>> autowiredAnonotationTypes = new LinkedHashSet<>(Arrays.asList(Autowired.class,Inject.class,InjectedUser.class));
//        beanPostProcessor.setAutowiredAnnotationTypes(autowiredAnonotationTypes);
        return beanPostProcessor;
    }

    public static void main(String[] args) {
        // 创建 BeanFactory 容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 注册 Configuration Class（配置类） -> Spring Bean
        applicationContext.register(AnnotationDependencyInjectionResolutionDemo.class);

        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(applicationContext);
        String xmlResourcePath = "classpath:/META-INF/dependency-lookup-context.xml";
        // 加载 XML 资源，解析并且生成 BeanDefinition
        beanDefinitionReader.loadBeanDefinitions(xmlResourcePath);

        applicationContext.refresh();

        // 依赖查找 QualifierAnnotationDependencyInjectionDemo Bean
        AnnotationDependencyInjectionResolutionDemo demo = applicationContext.getBean(AnnotationDependencyInjectionResolutionDemo.class);

        // 期待输出 superUser Bean
        System.out.println("demo.user = " + demo.user);
        System.out.println("demo.injectedUser = " + demo.injectedUser);

        // 期待输出 user superUser
        System.out.println("demo.users = " + demo.users);
        // 期待输出 superUser Bean
        System.out.println("demo.userOptional = " + demo.userOptional);
        // 期待输出 superUser Bean
        System.out.println("demo.myInjectedUser = " + demo.myInjectedUser);

        applicationContext.close();
    }

}
