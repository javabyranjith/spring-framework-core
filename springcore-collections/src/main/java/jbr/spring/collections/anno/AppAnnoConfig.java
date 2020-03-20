package jbr.spring.collections.anno;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jbr.spring.collections.model.Product;

@Configuration
public class AppAnnoConfig {

  @Bean
  public Product product() {
    return new Product();
  }

  @Bean
  public List<String> productList() {
    return Arrays.asList("Mobile", "Laptop", "Television");
  }

  @Bean
  public Map<String, Integer> priceMap() {
    Map<String, Integer> price = new HashMap<String, Integer>();
    price.put("Mobile", 1000);
    price.put("Laptop", 2000);
    price.put("Television", 2000);

    return price;
  }

  @Bean
  public Set<String> modelSet() {
    Set<String> model = new HashSet<>();
    model.add("X1");
    model.add("X2");
    model.add("X3");

    return model;
  }

}