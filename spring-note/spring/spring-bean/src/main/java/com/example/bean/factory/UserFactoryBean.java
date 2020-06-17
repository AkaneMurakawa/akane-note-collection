package com.example.bean.factory;

import com.example.ioc.dependency.domain.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * FactoryBean 实现
 */
public class UserFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        return User.createUser();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
