package jbr.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataReaderClient {
	private ApplicationContext applicationContext;
	private DataReader dataReader;

	public DataReaderClient() {
		applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
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