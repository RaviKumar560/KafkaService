package in.sp.main.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryBoyLocation {
    private String deliveryBoyId;
    private double latitude;
    private double longitude;

}
