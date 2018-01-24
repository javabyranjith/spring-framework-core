package jbr.prog2impl;

public class DataReaderClient {
  private FileDataReader fileDataReader;
  private String fileName = "testdata/test.txt";

  public DataReaderClient() {
    fileDataReader = new FileDataReader(fileName);
  }

  private String readData() {
    return fileDataReader.readData();
  }

  public static void main(String[] args) {
    DataReaderClient dataReaderClient = new DataReaderClient();

    System.out.println(dataReaderClient.readData());
  }
}
