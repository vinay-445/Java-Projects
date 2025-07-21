import java.util.*;
public class CurrencyConverter{
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inrToUsd = 0.012;
        double inrToYen = 0.085;
        double inrToPak = 3.30;
        double inrToLkr = 3.48;   
        double inrToEur = 0.011;
        double inrToNzd = 0.019;  
        double inrToAud = 0.018; 
        System.out.println("Enter money : ");
        double amount=sc.nextDouble();
        System.out.println("Enter the country name (Ex: EUR, USD, YEN, PAK, AUD, LKR, NZD): ");
        String countryName=sc.next().toUpperCase();
        double converted_amount;
        switch(countryName){
            case "EUR": converted_amount=amount*inrToEur;
                        System.out.println("The amount in EUR is: "+converted_amount);
                        break;
            case "USD": converted_amount=amount*inrToUsd;
                        System.out.println("The amount in USD is: "+converted_amount);
                        break;
            case "YEN": converted_amount=amount*inrToYen;
                        System.out.println("The amount in YEN is: "+converted_amount);
                        break;
            case "PAK": converted_amount=amount*inrToPak;
                        System.out.println("The amount in PAK is: "+converted_amount);
                        break;  
            case "AUD": converted_amount=amount*inrToAud;
                        System.out.println("The amount in AUD is: "+converted_amount);
                        break;
            case "LKR": converted_amount=amount*inrToLkr;
                        System.out.println("The amount in LKR is: "+converted_amount);
                        break;
            case "NZD": converted_amount=amount*inrToNzd;
                        System.out.println("The amount in NZD is: "+converted_amount);
                        break;
            default:System.out.println("Enter from the above country names only");
        }
        sc.close();
}
}