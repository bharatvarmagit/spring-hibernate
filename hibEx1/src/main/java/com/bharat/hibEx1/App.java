package com.bharat.hibEx1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bharat.hibEx1.dao.EmpDao;
import com.bharat.hibEx1.dao.EmpDaoImpl;
import com.bharat.hibEx1.model.Emp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] argEmps )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("BeanConfig.xml");
        EmpDao dao=context.getBean(EmpDaoImpl.class);
        dao.add(new Emp(6,"Jefferson Airplane","San Francisco"));
    }
}
