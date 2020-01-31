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
			throw new InvalidAttributeValueException("PODANA LICZBA JEST UJEMNA LUB MNIEJSZA NI¯ 100");
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
		unityDigitDic.put("5", "piêæ");
		unityDigitDic.put("6", "szeœæ");
		unityDigitDic.put("7", "siedem");
		unityDigitDic.put("8", "osiem");
		unityDigitDic.put("9", "dziewiêæ");
		
		tensDigitDic.put("2", "dwadzieœcia");
		tensDigitDic.put("3", "trzydzieœci");
		tensDigitDic.put("4", "czterydzieœci");
		tensDigitDic.put("5", "piêædziesi¹t");
		tensDigitDic.put("6", "szeœædziesi¹t");
		tensDigitDic.put("7", "siedemdziesi¹t");
		tensDigitDic.put("8", "osiemdziesi¹t");
		tensDigitDic.put("9", "dziewiêædziesi¹t");

		hundredsDigitDic.put("1", "sto");
		hundredsDigitDic.put("2", "dwieœcie");
		hundredsDigitDic.put("3", "trzysta");
		hundredsDigitDic.put("4", "czterysta");
		hundredsDigitDic.put("5", "piêæset");
		hundredsDigitDic.put("6", "szeœæset");
		hundredsDigitDic.put("7", "siedemset");
		hundredsDigitDic.put("8", "osiemset");
		hundredsDigitDic.put("9", "dziewiêæset");

		exceptionDigitDic.put("0","dziesiêæ");
		exceptionDigitDic.put("1","jedenaœcie");
		exceptionDigitDic.put("2","dwanaœcie");
		exceptionDigitDic.put("3","trzynaœcie");
		exceptionDigitDic.put("4","czterynaœcie");
		exceptionDigitDic.put("5","piêtnaœcie");
		exceptionDigitDic.put("6","szesnaœcie");
		exceptionDigitDic.put("7","siedemnaœcie");
		exceptionDigitDic.put("8","osiemnaœcie");
		exceptionDigitDic.put("9","dziewiêtnaœcie");

	}
}
