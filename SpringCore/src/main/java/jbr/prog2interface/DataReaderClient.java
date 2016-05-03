package jbr.prog2interface;

public class DataReaderClient {
  private DataReader dataReader;

  public DataReaderClient(DataReader dataReader) {
    this.dataReader = dataReader;
  }

  public String readData() {
    return dataReader.readData();
  }

  public static void main(String[] args) {
    // Only place to change.
    DataReader dataReader = new FileDataReader("testdata/test.txt");
    
    DataReaderClient dataReaderClient = new DataReaderClient(dataReader);
    System.out.println(dataReaderClient.readData());
  }
}
