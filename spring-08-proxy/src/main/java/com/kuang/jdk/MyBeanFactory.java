package com.kuang.jdk;

import com.kuang.demo1.CustomerDao;
import com.kuang.demo1.CustomerDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanFactory {
    public static CustomerDao getBean() {
        final CustomerDao customerDao = new CustomerDaoImpl();
        final MyAspect myaspect = new MyAspect();

        return (CustomerDao) Proxy.newProxyInstance(MyBeanFactory.class.getClassLoader(),
                new Class[]{CustomerDao.class}, new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        myaspect.myBefore();
                        Object obj = method.invoke(customerDao, args);
                        myaspect.myAfter();
                        return obj;
                    }
                });
    }
}
