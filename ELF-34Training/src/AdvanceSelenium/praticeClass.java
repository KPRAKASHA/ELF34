package AdvanceSelenium;

import org.testng.annotations.Test;

public class praticeClass {
	@Test(groups="smoke")
	public static void food(){
		System.out.println("Biriyani");
		System.out.println("Haleem");
		System.out.println("mutton leg soup");
	}
	@Test(groups="regression")
	public static void sports(){
		System.out.println("kabbadi");
		System.out.println("cricket");
		System.out.println("vallyball");
	}
    @Test(groups="regression")
    public static void colors(){
		System.out.println("Black");
		System.out.println("White");
		System.out.println("Yellow");
    }
    @Test(groups="smoke")
    public static void bike(){
    	System.out.println("Honda");
    	System.out.println("Royal Enfield");
    	System.out.println("Sports City");
    }
}

