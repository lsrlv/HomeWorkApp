package HomeWorkApp;

import java.io.IOException;
import java.util.Scanner;


public class Payment {
    private String name;
    private Product[] prodArray;
    private int cost;

    private class Product {

    private String productName;
    private int productCost;
    public Product() {
        super();
        productName = "";
        productCost = 0;
    }

    public Product(String productName, int productCost) {
            super();
            this.productName = productName; this.productCost = productCost;
        }
    public String getProductName()
        {
            return this.productName;
        }

        public int getProductCost()
        {
            return this.productCost;
        }

    }
    public Payment()
    {
        super();
        this.name = "";
        this.cost = 0;
    }
    public Payment(String name)
    {
        super();
        this.name = name;
    }

    public void setPayment() throws IOException
    {
        this.cost = 0;
        System.out.print("Количество товаров: ");
        Scanner br = new Scanner(System.in);
        int dim = br.nextInt(); prodArray = new Product[dim];
        for(int i = 0; i < dim; i++)
        {
            System.out.println("Товар " + (i+1) + ": ");
            System.out.print("Наименование: ");
            String str_name = br.next();
            System.out.print("Цена: ");
            int prod_cost = br.nextInt();
            prodArray[i] = new Product(str_name, prod_cost);
            this.cost = this.cost + prodArray[i].productCost;
        }
    }
    public void printCheque() throws IOException
    {
            if(this.prodArray.length != 0)
            {
                System.out.println(" " + this.name);
               System.out.print("Общая стоимость: ");
            }
        }

    public static void main(String [] args) throws IOException
{
        Payment pay1 = new Payment("Первая покупка");
        pay1.setPayment();
        Payment pay2 = new Payment("Вторая покупка");
        pay2.setPayment();
        pay1.printCheque();
        pay2.printCheque();
}

}



