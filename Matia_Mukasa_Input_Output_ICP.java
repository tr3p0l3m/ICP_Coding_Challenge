import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.LineNumberReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TR3P0L3M
 */
public class Matia_Mukasa_Input_Output_ICP {

    public String Item_name;
    public double Item_price;
    public int Item_quantity;

    public Matia_Mukasa_Input_Output_ICP(){
        this.Item_name = Item_name;
        this.Item_price = Item_price;
        this.Item_quantity = Item_quantity;
    }
    public String userdatainput(){
        System.out.println("Please enter the value below: ");
        Scanner userinput = new Scanner(System.in);
        String input =  userinput.nextLine();
        return input;
    }

    public void setItem_name(){
        this.Item_name = userdatainput();
    }

    public void setItem_price(){
        double Pricee = Double.parseDouble(userdatainput());
        this.Item_price = Pricee;
    }

    public void setItem_quantity(){
        int quantityy = Integer.parseInt(userdatainput());
        this.Item_quantity= quantityy;
    }

    public String get_ItemName(){
        return this.Item_name;
    }

    public Double get_ItemPrice(){
        return this.Item_price;
    }

    public Integer get_ItemQuantity(){
        return this.Item_quantity;
    }

    public void getData(){
        setItem_name();
        setItem_price();
        setItem_quantity();
    }

    public void printData(){
        System.out.println("Item Name" + "        "+"Item Price" + "        " + "Item Quantity" + "         ");
        System.out.println(get_ItemName() + "          " + get_ItemPrice() + "           " + get_ItemQuantity());

    }

    public void WriteText2File(){
        PrintWriter printwriter = null;
        
        try {
            printwriter = new PrintWriter(new FileOutputStream("Written2File.txt", true));
            

        }catch(FileNotFoundException fnfe){

            fnfe.getMessage();

        }
        //printwriter.println("Item Name" + "      "+"Item Price" + "         " + "Item Quantity");
        File file = new File("Written2File.txt");
        if(file.exists()){
            try {
                FileReader fr = new FileReader(file);
                LineNumberReader lr = new LineNumberReader(fr);
                int LineNumberCount = 0;
                if(LineNumberCount > 0){
                    printwriter.println("Item Name" + "      "+"Item Price" + "         " + "Item Quantity");
                    printwriter.print("   " +get_ItemName() + "            " + get_ItemPrice() + "                 " + get_ItemQuantity());
                    printwriter.println();
                } else{
                    printwriter.print("   " +get_ItemName() + "            " + get_ItemPrice() + "                 " + get_ItemQuantity());
                    printwriter.println();
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Matia_Mukasa_Input_Output_ICP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
//        printwriter.print("   " +get_ItemName() + "            " + get_ItemPrice() + "                 " + get_ItemQuantity());
//        printwriter.println();

        printwriter.close();
    }





    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matia_Mukasa_Input_Output_ICP oneitem = new Matia_Mukasa_Input_Output_ICP();
        oneitem.getData();
        oneitem.printData();
        oneitem.WriteText2File();
        
    }
    
}
