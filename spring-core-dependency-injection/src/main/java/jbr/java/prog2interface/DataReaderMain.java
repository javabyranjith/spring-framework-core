package jbr.java.prog2interface;

/**
 * An Example program to test Reading file Using Program to Interface Concept.
 * 
 * @author Ranjith Sekar
 *
 */
public class DataReaderMain {
  private DataReader dataReader;

  public DataReaderMain(DataReader dataReader) {
    this.dataReader = dataReader;
  }

  public String readData() {
    return dataReader.readData();
  }

  public static void main(String[] args) {
    // Only place to change.
    DataReader dataReader = new FileDataReader("testdata/prog2interface.txt");

    DataReaderMain dataReaderClient = new DataReaderMain(dataReader);
    System.out.println(dataReaderClient.readData());
  }
}
