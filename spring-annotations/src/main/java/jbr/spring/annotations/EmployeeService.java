package jbr.spring.annotations;

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
