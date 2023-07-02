/*
Implementeaza o mini aplicatie in care sa simulezi un magazin de produse.Prousele vor fi alese de tine ,trebuie sa aiba un pret si o cantitate.(folositi mostenirea unei clase )
 */


import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        MakeUp makeUpblush = new MakeUp(59.90,2,"blush", "pink","TravelSize");
        MakeUp makeUppbrush = new MakeUp(49.50,10,"EyeBrush","black","medium");
        MakeUp makeUpmascara = new MakeUp(90.50,15,"Mascara","black","Medium");
        MakeUp makeUpconcelear = new MakeUp(85,5,"concelear","porcelain","TravelSize");
        MakeUp makeUpfoundation = new MakeUp(125,7,"foundation","light","FullSize");
        SkinCare skinCarecleanser1 = new SkinCare(50.25,9,"micellarWater1","sensitive");
        SkinCare skinCarecleanser2 = new SkinCare(50.55,5,"MicellarWater2","Acneic");
        SkinCare skinCareserum1 = new SkinCare(89.90,2,"Serum1","oily");
        SkinCare skinCareserum2 = new SkinCare(89.90,5,"Serum2","Normal");


        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your option from MakeUp: ");
        String product = sc.nextLine();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (product){
            case "blush":
                if (quantity <= 2){
                    System.out.println("The product is in stock.Your order will arrive soon");
                }else{
                    System.out.println("The product is not in stock.Please insert a maximum quantity of 2");
                }
                break;
            case "brush":
                if (quantity <= 10){
                    System.out.println("The product is in stock.Your order will arrive soon");
                }else{
                    System.out.println("The product is not in stock.Please insert a maximum quantity of 10");
                }
                break;
            case "mascara":
                if (quantity <= 15){
                    System.out.println("The product is in stock.Your order will arrive soon");
                }else{
                    System.out.println("The product is not in stock.Please insert a maximum quantity of 15");
                }
                break;
            case "concelear":
                if (quantity <= 5){
                    System.out.println("The product is in stock.Your order will arrive soon");
                }else{
                    System.out.println("The product is not in stock.Please insert a maximum quantity of 5");
                }
                break;
            case "foundation":
                if (quantity <= 7){
                    System.out.println("The product is in stock.Your order will arrive soon");
                }else{
                    System.out.println("The product is not in stock.Please insert a maximum quantity of 7");
                }
                break;
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please insert your option from SkinCare: ");
        String product2 = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please insert quantity: ");
        int quantity2 = scanner2.nextInt();

        switch (product2){
            case "cleanser1":
                if (quantity <= 9){
                    System.out.println("The product is in stock.Your order will arrive soon");
                }else{
                    System.out.println("The product is not in stock.Please insert a maximum quantity of 9");
                }
                break;
            case "cleanser2":
                if (quantity <= 5){
                    System.out.println("The product is in stock.Your order will arrive soon");
                }else{
                    System.out.println("The product is not in stock.Please insert a maximum quantity of 5");
                }
                break;
            case "serum1":
                if (quantity <= 2){
                    System.out.println("The product is in stock.Your order will arrive soon");
                }else{
                    System.out.println("The product is not in stock.Please insert a maximum quantity of 2");
                }
                break;
            case "serum2":
                if (quantity <= 5){
                    System.out.println("The product is in stock.Your order will arrive soon");
                }else{
                    System.out.println("The product is not in stock.Please insert a maximum quantity of 5");
                }
                break;



        }
        }
        }











