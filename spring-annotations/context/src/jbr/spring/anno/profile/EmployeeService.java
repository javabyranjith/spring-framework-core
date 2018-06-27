package jbr.spring.anno.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({ "employee", "default" })
public class EmployeeService implements AccessService {
  @Override
  public String level() {
    return "Read";
  }
}
