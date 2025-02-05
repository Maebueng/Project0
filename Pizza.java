import java.util.Scanner;

public class Pizza
{
    public static void main(String[] args)
    {
	Scanner scnr = new Scanner(System.in);
	int people; //Number of people
	double avgSlices; //Avg slices per person, a pizza has 8 slices
	double costPizza; //Cost of ONE pizza
	double amountPizzas; //Amount of pizzas needed, rounded whole #
	double amountPizzaCost; //Total cost of pizzas needed
	double pizzaTax; //7 percent of totalPizzaCost
	double pizzaDelivery; //20 percent of totalPiizaCost+Tax
	double totalCost; //price of everything (tax and delivery included)

	int peopleSaturday;
	double avgSlicesSaturday; 
	double costPizzaSaturday; 
	double amountPizzasSaturday; 
	double amountPizzaCostSaturday; 
	double pizzaTaxSaturday;
	double pizzaDeliverySaturday; 
	double totalCostSaturday;
	double weekendTotal;

	int peopleSunday;
	double avgSlicesSunday;
	double costPizzaSunday;
	double amountPizzasSunday;
	double amountPizzaCostSunday;
	double pizzaTaxSunday;
	double pizzaDeliverySunday;
	double totalCostSunday;

	people = scnr.nextInt();
	avgSlices = scnr.nextDouble();
	costPizza = scnr.nextDouble();
	
	peopleSaturday = scnr.nextInt();
	avgSlicesSaturday = scnr.nextDouble();
	costPizzaSaturday = scnr.nextDouble();

	peopleSunday = scnr.nextInt();
	avgSlicesSunday = scnr.nextDouble();
	costPizzaSunday = scnr.nextDouble();	

	amountPizzas = Math.ceil(people * (avgSlices/8)); //Rounds to whole #
	amountPizzaCost = amountPizzas * costPizza;
        
	int amountPizzasInt = (int)amountPizzas;
	pizzaTax = amountPizzaCost * 0.07;
	pizzaDelivery = (amountPizzaCost + pizzaTax) * 0.20;
	totalCost = amountPizzaCost + pizzaTax + pizzaDelivery;

        System.out.print("Friday Night Party\n" + amountPizzasInt);
	System.out.printf(" Pizzas: $%.2f\n", amountPizzaCost);
	System.out.printf("Tax: $%.2f\n", pizzaTax);
	System.out.printf("Delivery: $%.2f\n", pizzaDelivery);
	System.out.printf("Total: $%.2f\n", totalCost);

	amountPizzasSaturday = Math.ceil(peopleSaturday * (avgSlicesSaturday/8));
	amountPizzaCostSaturday = amountPizzasSaturday * costPizzaSaturday;
	
	int amountPizzasIntSaturday = (int)amountPizzasSaturday;
	pizzaTaxSaturday = amountPizzaCostSaturday * 0.07;
	pizzaDeliverySaturday = (amountPizzaCostSaturday + pizzaTaxSaturday) * 0.20;
	totalCostSaturday = amountPizzaCostSaturday + pizzaTaxSaturday + pizzaDeliverySaturday;
	

	System.out.print("\nSaturday Night Party\n" + amountPizzasIntSaturday);
	System.out.printf(" Pizzas: $%.2f\n", amountPizzaCostSaturday);
	System.out.printf("Tax: $%.2f\n", pizzaTaxSaturday);
	System.out.printf("Delivery: $%.2f\n", pizzaDeliverySaturday);
	System.out.printf("Total: $%.2f\n", totalCostSaturday);

	amountPizzasSunday = Math.ceil(peopleSunday * (avgSlicesSunday/8));
	amountPizzaCostSunday = amountPizzasSunday * costPizzaSunday;

	int amountPizzasIntSunday = (int)amountPizzasSunday;
	pizzaTaxSunday = amountPizzaCostSunday * 0.07;
	pizzaDeliverySunday = (amountPizzaCostSunday + pizzaTaxSunday) * 0.20;
	totalCostSunday = amountPizzaCostSunday + pizzaTaxSunday + pizzaDeliverySunday;
	weekendTotal = totalCost + totalCostSaturday + totalCostSunday;	

	System.out.print("\nSunday Night Party\n" + amountPizzasIntSunday);
	System.out.printf(" Pizzas: $%.2f\n", amountPizzaCostSunday);
	System.out.printf("Tax: $%.2f\n", pizzaTaxSunday);
	System.out.printf("Delivery: $%.2f\n", pizzaDeliverySunday);
	System.out.printf("Total: $%.2f\n", totalCostSunday);
	System.out.printf("\nWeekend Total: $%.2f\n", weekendTotal);	
    }
}
	