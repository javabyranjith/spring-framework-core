package jbr.spring.collections.anno;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jbr.spring.collections.model.Product;

public class AppAnnoMain {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppAnnoConfig.class);

    Product product = (Product) context.getBean(Product.class);
    System.out.println(product.gettProductList());
    System.out.println(product.getPriceMap());
    System.out.println(product.getModelSet());
  }

}