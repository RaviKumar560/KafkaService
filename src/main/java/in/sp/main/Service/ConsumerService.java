package in.sp.main.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	private static final String Topic="deliveryboylocation";
	private static final String Groupid="group-1";
	
	  @KafkaListener(topics=Topic,groupId=Groupid)
	    public void sendLocationUpdate(String value) {


	        System.out.println(value);

	    }
}
