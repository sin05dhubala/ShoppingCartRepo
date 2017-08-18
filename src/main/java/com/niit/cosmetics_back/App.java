package com.niit.cosmetics_back;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Configuration.DBConfiguration;
import com.niit.Dao.CustomerDaoImpl;
import com.niit.Dao.ProductDaoImp;
import com.niit.Service.CustomerServiceImpl;
import com.niit.Service.ProductServiceImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class,ProductDaoImp.class,ProductServiceImp.class,CustomerDaoImpl.class,CustomerServiceImpl.class);
    }
}

