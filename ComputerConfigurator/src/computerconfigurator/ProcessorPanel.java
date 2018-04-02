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
public class ProcessorPanel extends JPanel {
    /* 
    The following are constants to indicate the cost of 
    each type of processor
    */
    private final double G1620 = 50.00;
    private final double G1820 = 100.00;
    private final double G1830 = 150.00;
    private final double FX4100 = 200.00;
    private final double FX4300 = 250.00;
    //To display the total
    private JLabel label;
    //To hold the components
    private JPanel pPanel;
    private JPanel selectedProcessor;
    //A list of processors
    private JComboBox procBox;
    //Text field showing selected processors price
    private JTextField selectedProc;
    //ComboBox selections
    private final String[] processors = {"G1620 2.70GHz", "G1820 2.70GHz", 
                                        "G1830 2.80GHz", "FX-4100", "FX-4300"};
    
    /*
    Constructor
    */
    public ProcessorPanel(){
        //Create a boder layout
        setLayout(new BorderLayout());
        
        //Build the Panels
        buildProcPanel();
        buildSelectedProcessorPanel();
        
        //Build the Border Layout
        setBorder(BorderFactory.createTitledBorder("Processor"));
        
        //Add the panels to the content pane
        add(pPanel, BorderLayout.WEST);
        add(selectedProcessor, BorderLayout.EAST);
        
        //Display the window
        setVisible(true);
    }
    
    
    /*
    Build the ProcPanel method adds a comboBox with the types
    of processors to a panel
    */
    private void buildProcPanel(){
        //Create a panel to hold the combo box
        pPanel = new JPanel();
        
        //Create the comboBox
        procBox = new JComboBox(processors);
        
        //Register an action listener
        procBox.addActionListener(new ComboBoxListener());
        
        //Add the comboBox to the panel
        pPanel.add(procBox);
    }
    
    /*
    buildSelectedProcessorPanel method adds a read-only text field
    in order to display the selected processors cost
    */
    private void buildSelectedProcessorPanel(){
        //Create a panel to hold the components
        selectedProcessor = new JPanel();
        
        //Create the label
        label = new JLabel("Price: ");
        
        //Create the uneditable text field
        selectedProc = new JTextField(5);
        selectedProc.setEditable(false);
        
        //Add the label and text field to the panel
        selectedProcessor.add(label);
        selectedProcessor.add(selectedProc);
    }
    
    /*
    private inner class that handles the event when the user selects
    an item from the combo box
    */
    private class ComboBoxListener
                            implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String selection;       //To display the selection in the TextField
            
            //Switch Statment to display selection
            switch (procBox.getSelectedIndex()) {
                case 0:
                    selection = Double.toString(G1620);
                    selectedProc.setText(selection);
                    break;
                case 1:
                    selection = Double.toString(G1820);
                    selectedProc.setText(selection);
                    break;
                case 2:
                    selection = Double.toString(G1830);
                    selectedProc.setText(selection);
                    break;
                case 3:
                    selection = Double.toString(FX4100);
                    selectedProc.setText(selection);
                    break;
                case 4:
                    selection = Double.toString(FX4300);
                    selectedProc.setText(selection);
                    break;
                default:
                    selection = Double.toString(G1820);
                    selectedProc.setText(selection);
                    break;
            }
                
            }
        }
    
    /*
    The getProcessorPrice method returns the price of the selected item
    @return The Price of the selected item
    */
        public double getProcessorPrice(){
            //Variable to return to main method.
                double price;           
                
            //Switch Statement to calculate selected Processor price 
             switch (procBox.getSelectedIndex()) {
                case 0:
                    price = G1620;
                    break;
                case 1:
                    price = G1820;
                    break;
                case 2:
                    price = G1830;
                    break;
                case 3:
                    price = FX4100;
                    break;
                case 4:
                    price = FX4300;
                    break;
                default:
                    price = 0.0;
                    break;
            }
    
                return price;
        }
}
    

