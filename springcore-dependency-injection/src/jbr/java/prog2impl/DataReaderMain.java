package jbr.java.prog2impl;

/**
 * An Example program to test Reading file Using Program to Implementation
 * Concept.
 * 
 * @author Ranjith Sekar
 *
 */
public class DataReaderMain {
  private FileDataReader fileDataReader;
  private String fileName = "testdata/prog2impl.txt";

  public DataReaderMain() {
    fileDataReader = new FileDataReader(fileName);
  }

  private String readData() {
    return fileDataReader.readData();
  }

  public static void main(String[] args) {
    DataReaderMain dataReaderClient = new DataReaderMain();

    System.out.println(dataReaderClient.readData());
  }
}
