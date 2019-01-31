/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import javax.swing.JOptionPane;
import mb_version_3.IncludePanel;
import entidad.Plan;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author JAVIER
 */
public class InsertarPlan {
    private Plan plan;

    public InsertarPlan(String GB, String secont, String messages, String cost, String operator) throws IOException {
        this.saveplan( GB,  secont,  messages,  cost, operator);
    }
    public InsertarPlan(){
        
    }
    private void saveplan (String GB, String secont, String messages, String cost, String operator) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("plans.db", true));
        String tosave = GB + " " + secont + " " + messages + " " + cost + " " + operator;
        writer.append(tosave);
        writer.newLine();
        writer.close();
    }
    public ArrayList returnPlans() throws FileNotFoundException, IOException{
        // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader("plans.db");

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // This will reference one line at a time
            String line = null;
            ArrayList<String[]> plans = new ArrayList<>();
            while((line = bufferedReader.readLine()) != null) {
                plans.add(line.split(" "));
            }  
            return plans;
    }
    
    //for git
}
 