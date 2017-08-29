//package AP2005;

/*
 * Created on Nov 28, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author 502641
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
import java.util.*;
public class Reservation 
{
	private String guestName;
	private int roomNumber;
	
	public Reservation(String guest, int room)
	{
		 guestName=guest;
		 roomNumber = room;
	}
	
	public int getRoomNumber()
	{
		return roomNumber;
	}
	
	public String getGuest()
	{
		return guestName;
	}
	
}
