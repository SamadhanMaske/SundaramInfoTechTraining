package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class Restaurant {
    private String name;
    private String location;
    private String cuisine;
    private String rating;

    public Restaurant(String name, String location, String cuisine, String rating) {
        this.name = name;
        this.location = location;
        this.cuisine = cuisine;
        this.rating = rating;
    }

    public String getName() { 
    	return name; 
    }
    public void setName(String name) { 
    	this.name = name; 
    }

    public String getLocation() { 
    	return location; 
    }
    public void setLocation(String location) { 
    	this.location = location; 
    }

    public String getCuisine() { 
    	return cuisine; 
    }
    
    public void setCuisine(String cuisine) { 
    	this.cuisine = cuisine; 
    }

    public String getRating() { 
    	return rating; 
    }
    
    public void setRating(String rating) { 
    	this.rating = rating; 
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nLocation: " + location + "\nCuisine: " + cuisine + "\nRating: " + rating;
    }
}

class DAOLayer {
    public Restaurant searchRestaurant(ArrayList<Restaurant> restaurants, String info) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getName().equalsIgnoreCase(info)) {
                return restaurant;
            }
        }
        return null;
    }

    public void addRestaurant(ArrayList<Restaurant> al) {
        Iterator<Restaurant> iterator = al.iterator();
        while (iterator.hasNext()) {
            Restaurant restaurant = iterator.next();
            System.out.println(restaurant);
        }
    }
}
public class RestaurantMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        DAOLayer daoLayer = new DAOLayer();

        restaurants.add(new Restaurant("NH8", "Indiranagar", "Indian", "3"));
        restaurants.add(new Restaurant("Adigas", "Indiranagar", "Indian", "4"));

        daoLayer.addRestaurant(restaurants);

        System.out.println("Enter restaurant name to search:");
        String searchName = sc.nextLine();
        Restaurant foundRestaurant = daoLayer.searchRestaurant(restaurants, searchName);

        if (foundRestaurant != null) {
            System.out.println("Found: " + foundRestaurant);
        } else {
            System.out.println("Restaurant not found.");
        }
        
        sc.close();

	}

}
