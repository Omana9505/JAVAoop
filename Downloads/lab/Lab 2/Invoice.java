import java.util.Scanner;

class Data{

        String number;
        String description;
        int quantity;
        double price;

        Data(String number, String description, int quantity, double price){
            this.number = number;
            this.description = description;
            this.quantity = quantity;
            this.price = price;
        }

        //Setter
        void SetNumber(String num){
            number = num;
        }

        void SetDescription(String desc){
            description = desc;
        }
        
        void SetQunatity(int quan){
            quantity = quan;
        }
        
        void SetPrice(double prc){
            price = prc;
        }

        //Getter
        String GetNumber(String num){
            return num;
        }

        String GetDescription(String desc){
            return desc;
        }
        
        int GetQunatity(int quan){
            return quan;
        }
        
        double GetPrice(double prc){
            return prc;
        }

        double getInvoiceAmount(){
            if(quantity<0){
                quantity = 0;
            }
            if(price<0){
                price = 0.0;
            }
            return quantity*price;
        }



}

public class Invoice {

    public static void main(String[] args){
         
        Data d1 = new Data("Shampoo", "Hair Growth", 5, 6.0);
        System.out.println(d1.getInvoiceAmount());
    }
    
}
