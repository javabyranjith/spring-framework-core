package jbr.spring.dependency.injection;

public class DataReaderService {
  private DataReader dataReader;

  public DataReaderService(DataReader dataReader) {
    this.dataReader = dataReader;
  }

  public String readData() {
    return dataReader.readData();
  }
}
