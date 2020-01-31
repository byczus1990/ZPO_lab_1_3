package main;

import java.util.Scanner;

import javax.management.InvalidAttributeValueException;

import main.SbIntToPlStringConverter;

public class SbStarter {

	public static void main(String[] args) throws InvalidAttributeValueException, NumberFormatException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Witaj!!!!!\nPodaj trzycyfrow¹ liczbê,\na ja zamieniê j¹ na postaæ s³own¹");
		String answear = sc.nextLine();
		
		if(answear.isEmpty())
		{
			sc.close();
			throw new NumberFormatException("NIE PODA£EŒ LICZBY");
		}
		
		SbIntToPlStringConverter iTs = new SbIntToPlStringConverter(Integer.valueOf(answear));
		iTs.initializeHashMaps();
		
		System.out.println("Twoja liczba to:\n\n" + iTs.convertIntToPlString()+"\n");

		System.out.println("DZIEKUJÊ ZA INTERAKCJÊ!!!!\nDO WIDZENIA");
		sc.close();
	}

}
