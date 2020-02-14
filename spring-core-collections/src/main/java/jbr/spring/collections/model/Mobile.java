package jbr.spring.collections.model;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mobile {

  private List<String> mobileList;
  private Map<String, String> priceMap;
  private Set<String> modelSet;

  public List<String> getMobileList() {
    return mobileList;
  }

  public void setMobileList(List<String> mobileList) {
    this.mobileList = mobileList;
  }

  public Map<String, String> getPriceMap() {
    return priceMap;
  }

  public void setPriceMap(Map<String, String> priceMap) {
    this.priceMap = priceMap;
  }

  public Set<String> getModelSet() {
    return modelSet;
  }

  public void setModelSet(Set<String> modelSet) {
    this.modelSet = modelSet;
  }

  public void printMobileList() {
    System.out.println(mobileList);
  }

  public void printPriceMap() {
    priceMap.forEach((k, v) -> {
      System.out.println(k + " : " + v);
    });
  }

  public void printModelSet() {
    modelSet.forEach(System.out::println);
  }
}