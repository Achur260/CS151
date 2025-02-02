package doordash;

public class FoodDeliveryAndTrackingService implements DeliveryService, TrackingService {

	@Override
    public void deliverFood(Restaurant restaurant, Customer customer) {
        System.out.println("Food delivered from " + restaurant.getName() + " to " + customer.getName());
    }

    @Override
    public void trackPackage(String trackingNumber) {
        System.out.println("Package with tracking number " + trackingNumber + " is being tracked.");
    }

	@Override
	public void cancelDelivery(Restaurant restaurant, Customer customer) {
		System.out.println("Food delivery canceled: from " + restaurant.getName() + " to " + customer.getName());
		
	}
}
