package EpamAss1.MavenProjectCreation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Chocolates c = new Chocolates();
        Chocolates c1 = new Chocolates(200,60,"DairyMilkSilk");
        Chocolates c2 = new Chocolates(175,40,"DairyMilkCracle");
        Chocolates c3= new Chocolates(50,20,"DairyMilk");
        Chocolates c4 = new Chocolates(150,45,"DairyMilkFruit&Nut");
        Sweets s1 = new Sweets(20,30);
        Sweets s2 = new Sweets(30,40);
        Sweets s3 = new Sweets(40,50);
        Sweets s4 = new Sweets(50,60);
        Gifts g = new Gifts();
        System.out.println("Total Weight: "+g.getWeight());
        System.out.println("Chocolates sorted based on price: ");
        c.sortChocolates();
        c.getChocolatesInRange(15, 50);
        
    }
}
