import static org.junit.Assert.*;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;



public class TranslationTest {

	@Test
	public void testGerman(){
		PrintBalance german = new PrintBalance(new Locale("de", "DE"));
		Date today = new Date();
		DateFormat date = DateFormat.getDateInstance(DateFormat.LONG, new Locale("de", "DE"));
		
		assertEquals(german.a, "Hallo Welt");
		assertEquals(german.b, "Bitte geben Sie Ihren Namen");
		assertEquals(german.c, "Ich freue mich, Sie kennen zu lernen");
		assertEquals(german.d, "Wie der");
		assertEquals(german.e, "Du schuldest der Schule");
		assertEquals(german.f, "Guuuten Bye");
		assertEquals(german.g, date.format(today));
		assertEquals(german.h, "9.876.543,21 �");
	}
	
	@Test
	public void testFrench(){
		PrintBalance french = new PrintBalance(new Locale("fr", "FR"));
		Date today = new Date();
		DateFormat date = DateFormat.getDateInstance(DateFormat.LONG, new Locale("fr", "FR"));
		
		assertEquals(french.a, "Bonjour tout le monde");
		assertEquals(french.b, "S'il vous pla�t entrer votre nom");
		assertEquals(french.c, "Je suis heureux de vous rencontrer");
		assertEquals(french.d, "Comme des");
		assertEquals(french.e, "Vous devez l'�cole");
		assertEquals(french.f, "Au revoir");
		assertEquals(french.g, date.format(today));
		assertEquals(french.h, "9�876�543,21 �");
	}
	
	@Test
	public void testEnglish(){
		PrintBalance french = new PrintBalance(new Locale("en", "EN"));
		Date today = new Date();
		DateFormat date = DateFormat.getDateInstance(DateFormat.LONG, new Locale("en", "EN"));
		
		assertEquals(french.a, "Hello World");
		assertEquals(french.b, "Please enter your name");
		assertEquals(french.c, "I am pleased to meet you");
		assertEquals(french.d, "As of");
		assertEquals(french.e, "You owe the school");
		assertEquals(french.f, "Good Bye");
		assertEquals(french.g, date.format(today));
		assertEquals(french.h, "�9,876,543.21");
	}
}
