/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerconfigurator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author james
 */
public class ComputerConfigurator extends JFrame {
    private final ProcessorPanel  proc;            //Processor Panel
    private final MemoryPanel mem;                 //Memory Panel
    private final HardDrivePanel hd;               //Hard Drive Panel
    private final OpticalDrivePanel op;            //Optical Drive Panel
    private final GraphicsCardPanel gc;            //Graphics Card Panel
    private final OperatingSystemPanel os;         //Operating System Panel
    private final AdditionalOptionsPanel ao;       //Additional Options Panel
    private JPanel buttonPanel;                    //To hold the buttons
    private JButton calcButton;                    //To calculate cost
    private JButton exitButton;                    //To Exit
    private final double tax_Rate = 0.078;         //Tax rate
    private final double shipping = 5.00;          //Shipping rate
    
    
    /*
    Constructor
    */
public ComputerConfigurator(){
    //Display a title
    setTitle("Computer Configurator Tool");
    
    //Close button action
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //Create a border layout
    setLayout(new GridLayout(8,1));
    
    //Create the custom panels
    proc = new ProcessorPanel();
    mem = new MemoryPanel();
    hd = new HardDrivePanel();
    op = new OpticalDrivePanel();
    gc = new GraphicsCardPanel();
    os = new OperatingSystemPanel();
    ao = new AdditionalOptionsPanel();
    
    //Build the button panel
    buildButtonPanel();
   
    //Add the components to the content pane
    add(proc);
    add(mem);
    add(hd);
    add(op);
    add(gc);
    add(os);
    add(ao);
    add(buttonPanel);
    
    //Pack and make visible
    pack();
    setVisible(true);
}    

/*
buildButtonPanel methods build the button panel
*/

private void buildButtonPanel(){
    //Create a panel 
   buttonPanel = new JPanel();
    
    //Create the buttons
    calcButton = new JButton("Order");
    exitButton = new JButton("Exit");
    
    //Register the action Listeners
    calcButton.addActionListener(new CalcButtonListener());
    exitButton.addActionListener(new ExitButtonListener());
    
    //Add the buttons to the button panel
    buttonPanel.add(calcButton);
    buttonPanel.add(exitButton);
    
}

/*
Private inner class that handles the event when 
the user clicks the Calculate Button
*/
private class CalcButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        //Variables to hold the subtotal, tax, and total
        double subtotal, tax, total;
        
        //Calcualte the subtotal
        subtotal = mem.getMemoryPrice() + proc.getProcessorPrice() +
                hd.getHardDrivePrice() + op.getOpticalDrivePrice() +
                gc.getGraphicCardPrice() + os.getOperatingSystemPrice() +
                + ao.getOptionsPrice();
        
        //Calculate the tax
        tax = subtotal * tax_Rate;
        
        //Calcualte the total
        total = subtotal + tax + shipping;
        
        //Display the Charges
        JOptionPane.showMessageDialog(null,
                String.format("Order Submitted\n" + 
                              "Subtotal: $%,.2f\n" +
                              "Tax: $%,.2f\n" +
                              "Shipping: $%,.2f\n" +
                              "Total: $%,.2f\n", subtotal,tax,shipping,total));
        
    }
}

/*
Private inner class that handles the event when the user
clicks the exit button
*/
private class ExitButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}

    
    public static void main(String[] args) {
        new ComputerConfigurator();
    }
    
}
