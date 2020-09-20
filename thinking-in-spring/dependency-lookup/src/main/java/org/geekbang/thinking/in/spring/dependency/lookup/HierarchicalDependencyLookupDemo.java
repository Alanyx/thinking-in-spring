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
package org.geekbang.thinking.in.spring.dependency.lookup;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 层次性依赖查找示例
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @since
 */
public class HierarchicalDependencyLookupDemo {

    public static void main(String[] args) {
        // 创建 BeanFactory 容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 将当前类 ObjectProviderDemo 作为配置类（Configuration Class）
        applicationContext.register(ObjectProviderDemo.class);

        // 1. 获取 HierarchicalBeanFactory <- ConfigurableBeanFactory <- ConfigurableListableBeanFactory
        ConfigurableListableBeanFactory beanFactory = applicationContext.getBeanFactory();
        // 此时没有设置 parent BeanFactory,为 null
        System.out.println("1.当前 BeanFactory 的 Parent BeanFactory ： " + beanFactory.getParentBeanFactory());

        // 2. 设置 Parent BeanFactory
        HierarchicalBeanFactory parentBeanFactory = createParentBeanFactory();
        beanFactory.setParentBeanFactory(parentBeanFactory);
        System.out.println("2.当前 BeanFactory 的 Parent BeanFactory ： " + beanFactory.getParentBeanFactory());

        // LocalBean：LocalBean 指当前 BeanFactory 的 Bean,不包含父类的 Bean
        displayContainsLocalBean(beanFactory, "user"); // false
        displayContainsLocalBean(parentBeanFactory, "user");// true

        displayContainsBean(beanFactory, "user");// true
        displayContainsBean(parentBeanFactory, "user");// true

        // 启动应用上下文
        applicationContext.refresh();
        // 关闭应用上下文
        applicationContext.close();

    }

    private static void displayContainsBean(HierarchicalBeanFactory beanFactory, String beanName) {
        System.out.printf("当前 BeanFactory[%s] 是否包含 Bean[name : %s] : %s\n", beanFactory, beanName,
                containsBean(beanFactory, beanName));
    }

    /**
     * 使用递归查询是否包含 Bean
     */
    private static boolean containsBean(HierarchicalBeanFactory beanFactory, String beanName) {
        BeanFactory parentBeanFactory = beanFactory.getParentBeanFactory();
        if (parentBeanFactory instanceof HierarchicalBeanFactory) {
            HierarchicalBeanFactory parentHierarchicalBeanFactory = HierarchicalBeanFactory.class.cast(parentBeanFactory);
            if (containsBean(parentHierarchicalBeanFactory, beanName)) {
                return true;
            }
        }
        // 判断当前的 beanFactory 是否包含本地 Bean
        return beanFactory.containsLocalBean(beanName);
    }

    private static void displayContainsLocalBean(HierarchicalBeanFactory beanFactory, String beanName) {
        System.out.printf("当前 BeanFactory[%s] 是否包含 Local Bean[name : %s] : %s\n", beanFactory, beanName,
                beanFactory.containsLocalBean(beanName));
    }

    /**
     * 创建父类 BeanFactory(此处使用 XML 方式创建上下文)
     *
     * @return
     */
    private static ConfigurableListableBeanFactory createParentBeanFactory() {
        // 创建 BeanFactory 容器
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        // XML 配置文件 ClassPath 路径
        String location = "classpath:/META-INF/dependency-lookup-context.xml";
        // 加载配置
        reader.loadBeanDefinitions(location);
        return beanFactory;
    }

}
