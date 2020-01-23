/**
 * These are all the imports that will help in the execution of this coding challenge.
 * They are all generated from the Java.io API and they help with dealing with input
 * and output.
 */
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;


/**
 *
 * @author TR3P0L3M
 */
/**
 * 
 * @author Matia Mukasa Class of 2022 Intermidiet Computer Programming.
 * Here is where the class starts and the instance variables are:
 * Item name, Item Price and ITem Quantity.
 */
public class Matia_Mukasa_Input_Output_ICP_Final {

    public String Item_name;
    public double Item_price;
    public int Item_quantity;

    
/**
 * Here is where I have instantiate the instance variables. The instance variables
 * are synonymous with the public variables.
 */
    public Matia_Mukasa_Input_Output_ICP_Final(){
        this.Item_name = Item_name;
        this.Item_price = Item_price;
        this.Item_quantity = Item_quantity;
    }
    /**
     * I designed this method to reduce code duplication.
     * I will call this method whenever i need to take user input.
     * The Scanner class is used to take in user input.
     * @return returns the value of the user input.
     */
    public String userdatainput(){
        Scanner userinput = new Scanner(System.in);
        String input =  userinput.nextLine();
        return input;
    }
    /**
     * This is a setter for the item name that is to be stored
     * This method calls the userdatainput method in order to take the user input.
     */
    public void setItem_name(){
        System.out.println("ITEM: ");
        this.Item_name = userdatainput();
    }
    
    /**
     * This is a setter for the item price that is to be stored
     * This method calls the userdatainput method in order to take the user input.
     * In this method, Since the input is inform of a string, the method makes use of the 
     * extension ParseDouble to be able to transform the string into a Double.
     */
    public void setItem_price(){
        System.out.println("PRICE: ");
        double Pricee = Double.parseDouble(userdatainput());
        this.Item_price = Pricee;
    }
    
    /**
     * This is a setter for the item quantity that is to be stored
     * This method calls the userdatainput method in order to take the user input.
     * In this method, Since the input is inform of a string, the method makes use of the 
     * extension ParseInt to be able to transform the string into int.
     */
    public void setItem_quantity(){
        System.out.println("QUANTITY: ");
        int quantityy = Integer.parseInt(userdatainput());
        this.Item_quantity= quantityy;
    }

    /**
     * This method return the value gotten from the setter method
     * @return Item_name in String format
     */
    public String get_ItemName(){
        return this.Item_name;
    }
    
    /**
     * This method return the value gotten from the price setter method
     * @return Item_Price in Double format
     */
    public Double get_ItemPrice(){
        return this.Item_price;
    }
    
    /**
     * This method return the value gotten from the Item quantity setter method
     * @return Item_name in Integer format
     */
    public Integer get_ItemQuantity(){
        return this.Item_quantity;
    }

    /**
     * This method is a method that is designed to get all the userinput
     * about a given item at once. It calls all the setters one after the other.
     */
    public void getData(){
        setItem_name();
        setItem_price();
        setItem_quantity();
    }
    
    

    /**
     * The printData method below is designed to give users a view of how their
     * input will look like in the file that is created.
     */
    public void printData(){
        System.out.println("Item Name" + "        "+"Item Price" + "        " + "Item Quantity" + "         ");
        System.out.println(get_ItemName() + "          " + get_ItemPrice() + "           " + get_ItemQuantity());

    }

    /**
     * This WriteText2File method is a method that is designed to be able to print 
     * the user input into the file. Here is where we introduce the use of the imports such as the file
     * among the many others. We also make use of the try catch blocks to be able to gracefully catch the 
     * errors that might arise without abruptly stopping the program
     */
    public void WriteText2File(){
        PrintWriter printwriter = null;
        
        try {
            printwriter = new PrintWriter(new FileOutputStream("Essentials_stock.txt", true));
            //printwriter2 = new PrintWriter(new FileOutputStream("backup_Essentials_stock.txt", true));
            
            

        }catch(FileNotFoundException fnfe){

            fnfe.getMessage();

        }
        //printwriter.println("Item Name" + "      "+"Item Price" + "         " + "Item Quantity");
        File file = new File("Essentials_stock.txt");
        if(file.exists()){
            printwriter.println("   " +get_ItemName() + "            " + get_ItemPrice() + "                 " + get_ItemQuantity());//        printwriter.print("   " +get_ItemName() + "            " + get_ItemPrice() + "                 " + get_ItemQuantity());
//        printwriter.println();
            //printwriter.println();

        printwriter.close();
    }
    }






    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Matia_Mukasa_Input_Output_ICP_Final oneitem = new Matia_Mukasa_Input_Output_ICP_Final();
//        for(int i =1; i < 10;i++){
//            System.out.print(i +  "  ");
//             oneitem.getData();
//             oneitem.printData();
//             oneitem.WriteText2File();
//            
//                    
//         }
        File originalFile = new File("C:\\Users\\TR3P0L3M\\Documents\\NetBeansProjects\\LAB-EXERCISES-ICP\\Essentials_stock.txt");
        File backupFile = new File("backup_Essentials_stock.txt");
        try {
            
                Files.copy(originalFile.toPath(), backupFile.toPath());
            
        } catch (IOException e) {
            //TODO: handle exception
            e.printStackTrace();

        }
        
        
        
    }
    
}
