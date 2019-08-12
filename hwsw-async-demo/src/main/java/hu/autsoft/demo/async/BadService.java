package hu.autsoft.demo.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class BadService {

	@Async //ezzel kapcsoljuk be a aszinkront
	void someToDo() {
		
		System.out.println("Thread: " + Thread.currentThread().getId());
		
		
		try {
			Thread.sleep(8000); //8 mp-et várakozik mielőtt visszaadja az eredményt
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
	}
	
}
