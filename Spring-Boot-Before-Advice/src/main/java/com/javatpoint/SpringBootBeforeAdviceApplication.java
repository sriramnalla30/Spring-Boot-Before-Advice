package com.javatpoint;  

import org.springframework.boot.SpringApplication;  

import org.springframework.boot.autoconfigure.SpringBootApplication;  

import org.springframework.context.annotation.EnableAspectJAutoProxy;  

@SpringBootApplication  
@EnableAspectJAutoProxy(proxyTargetClass=true)  
public class SpringBootBeforeAdviceApplication   
{  
public static void main(String[] args) {  
SpringApplication.run(SpringBootBeforeAdviceApplication.class, args);  
}  
} 