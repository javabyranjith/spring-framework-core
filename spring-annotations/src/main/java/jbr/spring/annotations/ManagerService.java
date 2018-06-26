package jbr.spring.annotations;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({ "manager" })
public class ManagerService implements AccessService {

	@Override
	public String level() {
		return "Read and Write";
	}

}
