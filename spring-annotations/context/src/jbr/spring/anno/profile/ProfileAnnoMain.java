package jbr.spring.anno.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
public class ProfileAnnoMain {

  public static void main(String[] args) {

    ProfileAnnoMain main = new ProfileAnnoMain();
    main.annoContext();
    main.appContext();
  }

  public void annoContext() {
    // if nothing specified, 'default' will be picked
    System.setProperty("spring.profiles.active", "manager");
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.register(ProfileAnnoMain.class);
    ctx.refresh();
    System.out.println("Beans Count: " + ctx.getBeanNamesForType(AccessService.class).length);
    System.out.println("Beans Name: " + ctx.getBeanNamesForType(AccessService.class)[0]);
    ctx.close();
  }

  public void appContext() {
    // if nothing specified, 'default' will be picked
    System.setProperty("spring.profiles.active", "employee");

    ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:context-anno-beans.xml");
    System.out.println("Beans Count: " + ctx.getBeanNamesForType(AccessService.class).length);
    System.out.println("Beans Name: " + ctx.getBeanNamesForType(AccessService.class)[0]);
  }
}
