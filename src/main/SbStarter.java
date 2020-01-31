package main;

import java.util.Scanner;

import javax.management.InvalidAttributeValueException;

import main.SbIntToPlStringConverter;

public class SbStarter {

	public static void main(String[] args) throws InvalidAttributeValueException, NumberFormatException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Witaj!!!!!\nPodaj trzycyfrow� liczb�,\na ja zamieni� j� na posta� s�own�");
		String answear = sc.nextLine();
		
		if(answear.isEmpty())
		{
			sc.close();
			throw new NumberFormatException("NIE PODA�E� LICZBY");
		}
		
		SbIntToPlStringConverter iTs = new SbIntToPlStringConverter(Integer.valueOf(answear));
		iTs.initializeHashMaps();
		
		System.out.println("Twoja liczba to:\n\n" + iTs.convertIntToPlString()+"\n");

		System.out.println("DZIEKUJ� ZA INTERAKCJ�!!!!\nDO WIDZENIA");
		sc.close();
	}

}
