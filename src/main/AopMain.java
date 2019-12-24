package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Calculator;

public class AopMain {
    public static void main(String[] args) {
        BeanFactory context = new ClassPathXmlApplicationContext("config/aop-config.xml");
        Calculator calculator = (Calculator)context.getBean("calculator");
        calculator.add(1,2);
    }
}
