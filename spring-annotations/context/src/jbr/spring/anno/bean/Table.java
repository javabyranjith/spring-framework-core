package jbr.spring.anno.bean;

import org.springframework.stereotype.Component;

@Component()
public class Table {

  private String name = "jbr.spring.anno.bean.Table Class";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
