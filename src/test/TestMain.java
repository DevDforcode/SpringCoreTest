package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestMain {

	public static void main(String[] args) {
     
       Resource resource=new ClassPathResource("TestXml.xml");
       BeanFactory b=new XmlBeanFactory(resource);
       
       Test t=(Test)b.getBean("a");
         t.display();
       
       

	}

}
