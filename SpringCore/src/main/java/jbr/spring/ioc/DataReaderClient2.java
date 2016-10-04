package jbr.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataReaderClient2 {
  private ApplicationContext applicationContext;
  private DataReaderService dataReaderService;

  public DataReaderClient2() {
    applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
  }

  public String readData() {
    dataReaderService = (DataReaderService) applicationContext.getBean("dataReaderService");
    return dataReaderService.readData();
  }

  public static void main(String[] args) {
    DataReaderClient2 dataReaderClient = new DataReaderClient2();
    System.out.println(dataReaderClient.readData());
  }
}