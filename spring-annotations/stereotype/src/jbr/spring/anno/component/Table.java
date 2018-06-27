package jbr.spring.anno.component;

import org.springframework.stereotype.Component;

@Component("tableBean")
public class Table {

  private String name = "Table Class";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
