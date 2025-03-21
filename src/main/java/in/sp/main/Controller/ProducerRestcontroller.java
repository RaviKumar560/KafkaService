package in.sp.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.Entity.DeliveryBoyLocation;
import in.sp.main.Service.ProducerService;

@RestController
public class ProducerRestcontroller {
	
	@Autowired
	private ProducerService proService;
	
	@PostMapping("/location")
	public String Getlocation(@RequestBody DeliveryBoyLocation location) {
		proService.sendLocationUpdate(location);
		return "Location Updated";
	}

}
