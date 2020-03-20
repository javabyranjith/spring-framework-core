package jbr.spring.collections.model;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {
  @Autowired
  private List<String> productList;

  @Autowired
  private Map<String, Integer> priceMap;

  @Autowired
  private Set<String> modelSet;

  public List<String> gettProductList() {
    return productList;
  }

  public Map<String, Integer> getPriceMap() {
    return priceMap;
  }

  public Set<String> getModelSet() {
    return modelSet;
  }
}