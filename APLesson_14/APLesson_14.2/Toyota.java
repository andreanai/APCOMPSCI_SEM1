import java.util.*;
public class Toyota extends Car
{
	public Toyota(String location)
	{
		super();
		ArrayList<String> loc = new ArrayList<>(Arrays.asList(location.split(", ")));
		Double locationx = Double.parseDouble(loc.get(0)), locationy = Double.parseDouble(loc.get(1));
		super.move(locationx, locationy);
	}
}