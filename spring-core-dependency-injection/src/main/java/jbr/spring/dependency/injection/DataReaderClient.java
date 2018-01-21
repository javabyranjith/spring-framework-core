package jbr.spring.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * An Example program for Spring Dependency Injection.
 * 
 * @author Ranjith Sekar
 *
 */
public class DataReaderClient {
  private ApplicationContext applicationContext;
  private DataReader dataReader;

  public DataReaderClient() {
    applicationContext = new ClassPathXmlApplicationContext("dependency-injection-beans.xml");
  }

  public String readData() {
    dataReader = (DataReader) applicationContext.getBean("dataReader");
    return dataReader.readData();
  }

  public static void main(String[] args) {
    DataReaderClient dataReaderClient = new DataReaderClient();
    System.out.println(dataReaderClient.readData());
  }
}