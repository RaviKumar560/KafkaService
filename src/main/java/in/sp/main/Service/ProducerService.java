package in.sp.main.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import in.sp.main.Entity.DeliveryBoyLocation;

@Service
public class ProducerService {
private static final String Topic= "deliveryboylocation";

@Autowired
private KafkaTemplate<String,String>kafkaTemplete;
public void sendLocationUpdate(DeliveryBoyLocation location) {
	
    String message = location.getDeliveryBoyId() + "," + location.getLatitude() + "," + location.getLongitude();
    kafkaTemplete.send(Topic, message);
    System.out.println("Sent Location: " + message);
}
}
