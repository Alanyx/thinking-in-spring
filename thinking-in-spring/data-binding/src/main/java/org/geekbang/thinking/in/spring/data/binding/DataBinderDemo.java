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
package org.geekbang.thinking.in.spring.data.binding;

import org.geekbang.thinking.in.spring.ioc.overview.domain.User;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValues;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link DataBinder} 示例
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @see DataBinder
 * @since
 */
public class DataBinderDemo {

    public static void main(String[] args) {

        // 创建空白对象
        User user = new User();
        // 1. 创建 DataBinder
        DataBinder binder = new DataBinder(user, "");

        // 2. 创建 PropertyValues
        Map<String, Object> source = new HashMap<>();
        source.put("id", 1);
        source.put("name", "小马哥");

        // 2a. PropertyValues 存在 User 中不存在属性值
        // todo DataBinder 特性一 : 忽略未知的属性（不会报错）
        source.put("age", 18);

        // 2b. PropertyValues 存在一个嵌套属性，比如 company.name
        // todo DataBinder 特性二：支持嵌套属性
        // Company company = new Company();
        // company.setName("geekbang");
        // user.setCompany(compay)

//        source.put("company", new Company());
        source.put("company.name", "geekbang"); //  效果同上 new Company() ：框架内部自动完成

        PropertyValues propertyValues = new MutablePropertyValues(source);

        // 2-1. 调整 IgnoreUnknownFields true（默认） -> false（抛出 NotWritablePropertyException 异常，age 字段不存在于 User 类）
        // binder.setIgnoreUnknownFields(false);

        // 2-2. 调整自动增加嵌套路径 true（默认） —> false
        binder.setAutoGrowNestedPaths(false); // ignoreInvalidFields 为 false,AutoGrowNestedPaths 为 false 时： company.name 不能嵌套生效

        // 2-3. 调整 ignoreInvalidFields false(默认） -> true（默认情况调整不变化，需要调增 AutoGrowNestedPaths 为 false）
        binder.setIgnoreInvalidFields(true);

        // 2-4.设置必须绑定字段
        binder.setRequiredFields("id", "name", "city"); // city 不存在，不会抛出异常，但 BindingResult 结果包含错误文案 code

        // 3.绑定属性
        binder.bind(propertyValues);

        // 4. 输出 User 内容
        System.out.println(user);

        // 5. 获取绑定结果（结果包含错误文案 code，不会抛出异常）
        BindingResult result = binder.getBindingResult();
        System.out.println(result);
    }

}
