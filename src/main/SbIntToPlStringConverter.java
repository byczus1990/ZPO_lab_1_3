package main;

import java.util.HashMap;

import javax.management.InvalidAttributeValueException;

public class SbIntToPlStringConverter {
	
	private String liczba;
	HashMap<String, String> unityDigitDic = new HashMap<String, String>();
	HashMap<String, String> tensDigitDic = new HashMap<String, String>();
	HashMap<String, String> hundredsDigitDic = new HashMap<String, String>();
	HashMap<String, String> exceptionDigitDic = new HashMap<String, String>();

	

	public SbIntToPlStringConverter(int nr) throws InvalidAttributeValueException
	{
		if (nr < 0 || nr/100 == 0 || nr == 0)
		{
			throw new InvalidAttributeValueException("PODANA LICZBA JEST UJEMNA LUB MNIEJSZA NI� 100");
		}else
		{
			liczba = String.valueOf(nr);
		}
	}
	
	public String convertIntToPlString()
	{
		String result = null;
		char a = liczba.charAt(0);
		switch(a)
		{
		case '1' : result = hundredsDigitDic.get("1");break;
		case '2' : result = hundredsDigitDic.get("2");break;
		case '3' : result = hundredsDigitDic.get("3");break;
		case '4' : result = hundredsDigitDic.get("4");break;
		case '5' : result = hundredsDigitDic.get("5");break;
		case '6' : result = hundredsDigitDic.get("6");break;
		case '7' : result = hundredsDigitDic.get("8");break;
		case '8' : result = hundredsDigitDic.get("8");break;
		case '9' : result = hundredsDigitDic.get("9");break;
		}
		a = liczba.charAt(1);
		switch(a)
		{
		case '1' :
			{
				a = liczba.charAt(2);
				switch(a)
				{
				case '0' : result += " " + exceptionDigitDic.get("0");break;
				case '1' : result += " " + exceptionDigitDic.get("1");break;
				case '2' : result += " " + exceptionDigitDic.get("2");break;
				case '3' : result += " " + exceptionDigitDic.get("3");break;
				case '4' : result += " " + exceptionDigitDic.get("4");break;
				case '5' : result += " " + exceptionDigitDic.get("5");break;
				case '6' : result += " " + exceptionDigitDic.get("6");break;
				case '7' : result += " " + exceptionDigitDic.get("7");break;
				case '8' : result += " " + exceptionDigitDic.get("8");break;
				case '9' : result += " " + exceptionDigitDic.get("9");break;
				}
				return result;
			}
		case '2' : result += " " + tensDigitDic.get("2");break;
		case '3' : result += " " + tensDigitDic.get("3");break;
		case '4' : result += " " + tensDigitDic.get("4");break;
		case '5' : result += " " + tensDigitDic.get("5");break;
		case '6' : result += " " + tensDigitDic.get("6");break;
		case '7' : result += " " + tensDigitDic.get("7");break;
		case '8' : result += " " + tensDigitDic.get("8");break;
		case '9' : result += " " + tensDigitDic.get("9");break;
		}
		a = liczba.charAt(2);
		switch(a)
		{
		case '1' : result += " " + unityDigitDic.get("1");break;
		case '2' : result += " " + unityDigitDic.get("2");break;
		case '3' : result += " " + unityDigitDic.get("3");break;
		case '4' : result += " " + unityDigitDic.get("4");break;
		case '5' : result += " " + unityDigitDic.get("5");break;
		case '6' : result += " " + unityDigitDic.get("6");break;
		case '7' : result += " " + unityDigitDic.get("7");break;
		case '8' : result += " " + unityDigitDic.get("8");break;
		case '9' : result += " " + unityDigitDic.get("9");break;
		}
		return result;
	}
	public void initializeHashMaps()
	{
		unityDigitDic.put("1", "jeden");
		unityDigitDic.put("2", "dwa");
		unityDigitDic.put("3", "trzy");
		unityDigitDic.put("4", "cztery");
		unityDigitDic.put("5", "pi��");
		unityDigitDic.put("6", "sze��");
		unityDigitDic.put("7", "siedem");
		unityDigitDic.put("8", "osiem");
		unityDigitDic.put("9", "dziewi��");
		
		tensDigitDic.put("2", "dwadzie�cia");
		tensDigitDic.put("3", "trzydzie�ci");
		tensDigitDic.put("4", "czterydzie�ci");
		tensDigitDic.put("5", "pi��dziesi�t");
		tensDigitDic.put("6", "sze��dziesi�t");
		tensDigitDic.put("7", "siedemdziesi�t");
		tensDigitDic.put("8", "osiemdziesi�t");
		tensDigitDic.put("9", "dziewi��dziesi�t");

		hundredsDigitDic.put("1", "sto");
		hundredsDigitDic.put("2", "dwie�cie");
		hundredsDigitDic.put("3", "trzysta");
		hundredsDigitDic.put("4", "czterysta");
		hundredsDigitDic.put("5", "pi��set");
		hundredsDigitDic.put("6", "sze��set");
		hundredsDigitDic.put("7", "siedemset");
		hundredsDigitDic.put("8", "osiemset");
		hundredsDigitDic.put("9", "dziewi��set");

		exceptionDigitDic.put("0","dziesi��");
		exceptionDigitDic.put("1","jedena�cie");
		exceptionDigitDic.put("2","dwana�cie");
		exceptionDigitDic.put("3","trzyna�cie");
		exceptionDigitDic.put("4","czteryna�cie");
		exceptionDigitDic.put("5","pi�tna�cie");
		exceptionDigitDic.put("6","szesna�cie");
		exceptionDigitDic.put("7","siedemna�cie");
		exceptionDigitDic.put("8","osiemna�cie");
		exceptionDigitDic.put("9","dziewi�tna�cie");

	}
}
