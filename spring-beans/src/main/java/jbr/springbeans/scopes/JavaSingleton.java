package jbr.springbeans.scopes;

public class JavaSingleton {

  private static JavaSingleton javaSingleton;

  public static JavaSingleton getInstance() {

    if (null != javaSingleton) {
      return javaSingleton;
    } else {
      javaSingleton = new JavaSingleton();
    }

    return javaSingleton;
  }

  private JavaSingleton() {
  }

}
