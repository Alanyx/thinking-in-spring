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
package org.geekbang.thinking.in.spring.ioc.overview.dependency.injection;

import org.geekbang.thinking.in.spring.ioc.overview.repository.UserRepository;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

/**
 * 依赖注入示例
 * <p>
 * 依赖查找和依赖注入的来源都是bean，但不是同一个 bean
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @since
 */
public class DependencyInjectionDemo {

    public static void main(String[] args) {
        // 配置 XML 配置文件
        // 启动 Spring 应用上下文
//        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-injection-context.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-injection-context.xml");

        // ---------------------------------------------------------------
        // 依赖来源一：自定义 Bean
        UserRepository userRepository = applicationContext.getBean("userRepository", UserRepository.class);
        System.out.println(userRepository.getUsers());

        // ---------------------------------------------------------------
        // 依赖来源二：依赖注入（內建依赖），如 BeanFactory
        System.out.println(userRepository.getBeanFactory());
        ObjectFactory userFactory = userRepository.getObjectFactory();
        System.out.println(userFactory.getObject() == applicationContext);

        // ---------------------------------------------------------------
        // 依赖来源三：容器內建 Bean
        Environment environment = applicationContext.getBean(Environment.class);
        System.out.println("获取 Environment 类型的 Bean：" + environment);

        // ---------------------------------------------------------------
        // 依赖查找（错误）：beanFactory 是內建的非 Bean 对象
//        System.out.println(beanFactory.getBean(BeanFactory.class));

        // false：说明见下面的方法
        whoIsIoCContainer(userRepository, applicationContext);
    }

    /**
     * BeanFactory 和 ApplicationContext 谁才是 Spring IoC 容器? ==> 都是 IOC 容器
     *
     * @param userRepository
     * @param applicationContext
     */
    private static void whoIsIoCContainer(UserRepository userRepository, ApplicationContext applicationContext) {
        // ConfigurableApplicationContext <- ApplicationContext <- BeanFactory
        // 关键的方法: ConfigurableApplicationContext#getBeanFactory()

        // 这个表达式为什么不会成立?
        /// todo  ApplicationContext != BeanFactory,不能直接替换！
        // 需要用 ApplicationContext 的 getBeanFactory() 获取真正的 BeanFactory
        // 具体的源码实现见 AbstractRefreshableApplicationContext#getBeanFactory()：
        // 其中用的是组合方式引入 private DefaultListableBeanFactory beanFactory;所以下面的代码不相等
        System.out.println(userRepository.getBeanFactory() == applicationContext);

        // ApplicationContext 就是 BeanFactory
    }

}
