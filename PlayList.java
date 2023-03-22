package sample;

import java.util.Arrays;
import java.util.Scanner;
/* Module Name: Recent Play List
 * Name: Krishnakumar V
 * Date: 22-03-2023
 * Module Description:This module fetch the recently played list songs from store*/

public class PlayList {
	Scanner s=new Scanner(System.in);
	String[] songs,songs_new;
	int count,capacity;
	/*Method used to get the user inputs and print the values*/
	public void getInformation() {
		System.out.println("Enter the songs count:");
		count=s.nextInt();
		System.out.println("Enter the initial capacity:");
		capacity=s.nextInt();
		songs=new String[count];
		songs_new=new String[count];
		System.out.println("Enter the Songs:");
		for(int i=0;i<songs.length;i++) {
			songs[i]=s.next();
		}
		songs_new=Arrays.copyOf(songs,capacity);
		System.out.println("Let's assume that the user has played 3 songs:"+Arrays.toString(songs_new));
	}
	/* Method used to fetch the recently played list*/
	public void playSong() {
		
		try {
			System.out.println("Would you like to play songs:Yes/No");
			String response=s.next();
			switch (response) {
			case "Yes":
				for(int i=0;i<count;i++) {
				System.out.println("Enter the Song number:");
				String song_no=s.next();
				
				
					songs[0]=songs[1];
					songs[1]=songs[2];
					songs[2]=song_no;
				
					songs_new=Arrays.copyOf(songs,capacity);
					System.out.println("Played Songs:"+Arrays.toString(songs_new));		

				}
												
				break;
			case "No":
				System.out.println("Playlist is closed");
				
				break;

			default:
				break;
			}		
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();		
		}
	}

	public static void main(String[] args) {
	try {
	//Create the Object of the Class	
	PlayList playList=new PlayList();
	//Call the method which gets the User Input
	playList.getInformation();
	//Call the Method which will fetch the play list.
	playList.playSong();
	
	}
	catch (Exception e) 
	{
		e.printStackTrace();	
	}
	
}
	
}
