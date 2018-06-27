package jbr.spring.anno.profile;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles("employee")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:context-anno-beans.xml" })
public class ProfileAnnoTest {

  @Autowired
  private AccessService accessService;

  @Test
  public void testEmployee() {
    Assert.assertEquals("Read", accessService.level());
  }
}
