Part 1:
In GeoLocation.java:

Add a private instance variable called name which is a String. This represents the name of the location.
Update all parameters to match the name of instance variables and take advantage of the keyword this.

Modify the Geolocation class constructor so that it is now of the format

public GeoLocation(String name, double theLatitude, double theLongitude) 
Add a getter method for name called getName().

Update the toString so that it returns a String of the format

San Francisco (37.7833, -122.4167)



-- 

Now, you’ll also need to create a RoadTrip class. RoadTrip stores an ordered list of locations, so you’ll need to have an ArrayList as an instance variable - name it 'stops'. The RoadTrip class constructor should initialize an ArrayList that stores a list of GeoLocations .

You’ll also need to support these methods.

// Create a GeoLocation and add it to the road trip
public void addStop(String name, double latitude, double longitude)

// Get the total number of stops in the trip
public int getNumberOfStops()

// Get the total miles of the trip
public double getTripLength()

// Return a formatted toString of the trip
public String toString()


output

The output from that program would be:

1. San Francisco (37.7833, -122.4167)
2. Los Angeles (34.052235, -118.243683)
3. Las Vegas (36.114647, -115.172813)

Stops: 3
Total Miles: 572.9708850442705