package jbr.spring.anno.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Room {

  @Autowired
  private Chair chair;

  @Autowired
  private Table table;
  
  private Light light;

  public Chair getChair() {
    return chair;
  }

  public void setChair(Chair chair) {
    this.chair = chair;
  }

  public Table getTable() {
    return table;
  }

  public void setTable(Table table) {
    this.table = table;
  }
  
  @Bean
  public Light getLight() {
    return new Light();
  }

}
