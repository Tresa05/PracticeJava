package Discount;

public class MainClassPromo 
{
	public static void main(String[] args) 
	{
		Promo purchase = new Promo();
		purchase.amount = 250;
		purchase.PromoCode = "Promo5";
	
	    if(purchase.PromoCode== purchase.discount5) 
		{
			purchase.bill = (purchase.amount*0.5)*0.95;
		}
		else if(purchase.PromoCode== purchase.discount10) 
		{
			purchase.bill = (purchase.amount*0.5)*0.90;
		}
		else if (purchase.PromoCode== purchase.discount20) 
		{
			purchase.bill = (purchase.amount*0.5)*0.80;
		}
		else 
		{
			purchase.bill = purchase.amount*0.5;
		}
		
	    {
	    	System.out.println("Discounted Bill Amount ="+ purchase.bill);
	    }
		

	}
}


 