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

public class Hotel {

	private Reservation[] rooms;
	private ArrayList <String> waitList;
	
	public Hotel(int numberRooms)
	{
		waitList = new ArrayList <String>();
		rooms = new Reservation[numberRooms];
	}
	
	public Reservation[] getRes()
	{
		return rooms;
	}
	
	public Reservation requestRoom(String guestName)
	{
		for ( int k = 0; k < rooms.length; k++)
		{
			if (rooms[k]==null)
			{
				rooms[k] = new Reservation(guestName, k);
				return rooms[k];
			}
		}
		
		     waitList.add(guestName);
		     return null;
	}
	
	public Reservation cancelAndReassign(Reservation res)
	{
		rooms[res.getRoomNumber()]=null;
		
		if (waitList.size() > 0 )
		{
			return requestRoom (waitList.remove(0));
		}
		
		else 
			return null;
	}
	
	public void Print ()
	{
		System.out.println("Reservations *********************************************");
		for ( int i = 0; i<rooms.length; i++)
		{
			System.out.print(rooms[i].getGuest() + " " + rooms[i].getRoomNumber());
			System.out.println();
		}
	}
	
	public void PrintWaitList ()
	{
		System.out.println("WaitList *********************************************");
		for ( int i = 0; i<waitList.size(); i++)
		{
			System.out.println(waitList.get(i));
		}
	}
	
	public static void main(String[] args) {
		
		Hotel Cali = new Hotel (3);
		
		Cali.requestRoom("Dave");
		Cali.requestRoom("Sherry");
		Cali.requestRoom("Emmy");
		Cali.requestRoom("Andrew");
		Cali.requestRoom("Sadie");
		Cali.requestRoom("Shirley");
		Cali.requestRoom("Bob");
		Cali.requestRoom("Raymond");
		
		Cali.cancelAndReassign(Cali.getRes()[1]);
		Cali.cancelAndReassign(Cali.getRes()[2]);
		
		Cali.Print();
		Cali.PrintWaitList();
		
		
		
	}
}
