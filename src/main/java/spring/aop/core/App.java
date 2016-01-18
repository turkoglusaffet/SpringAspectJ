package spring.aop.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.person.bo.PersonBo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Person.xml");

        PersonBo person = (PersonBo) appContext.getBean("personBo");
     //   person.addPerson();
     //   person.addPersonReturnValue();
     //   person.addPersonThrowException();
        person.addPersonAround("turkmen");
    }
}
