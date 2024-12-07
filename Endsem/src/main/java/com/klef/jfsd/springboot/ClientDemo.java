package com.klef.jfsd.springboot;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Employee employee = context.getBean(Employee.class);
        System.out.println("Constructor Injection Example:");
        System.out.println(employee);

        Course course = context.getBean(Course.class);
        System.out.println("\nSetter Injection with Autowiring Example:");
        System.out.println(course);
    }
}


