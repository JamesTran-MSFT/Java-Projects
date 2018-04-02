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
public class MemoryPanel extends JPanel {
    /* 
    The following are constants to indicate the cost of 
    each type of memory
    */
    private final double GB6 = 25.00;
    private final double GB8 = 50.00;
    private final double GB12 = 100.00;
    private final double GB16 = 150.00;
    //To display the total
    private JLabel label;
    //To hold the components
    private JPanel mPanel;
    private JPanel selectedMemory;
    //A list of memory drives
    private JComboBox memoryBox;
    //Text field showing selected memory price
    private JTextField selectedMem;
    //ComboBox selections
    private final String[] memoryDrives = {"6GB", "8GB", "12GB","16GB"};
    
    /*
    Constructor
    */
    public MemoryPanel(){
        //Create a boder layout
        setLayout(new BorderLayout());
        
        //Build the Panels
        buildMemoryPanel();
        buildSelectedMemoryPanel();
        
        //Build the Border Layout
        setBorder(BorderFactory.createTitledBorder("Memory"));
        
        //Add the panels to the content pane
        add(mPanel, BorderLayout.WEST);
        add(selectedMemory, BorderLayout.EAST);

        setVisible(true);
    }
    
    
    /*
    Build the MemoryPanel method adds a comboBox with the types
    of memory devices to a panel
    */
    private void buildMemoryPanel(){
        //Create a panel to hold the combo box
        mPanel = new JPanel();
        
        //Create the comboBox
        memoryBox = new JComboBox(memoryDrives);
        
        //Register an action listener
        memoryBox.addActionListener(new ComboBoxListener());
        
        //Add the comboBox to the panel
        mPanel.add(memoryBox);
    }
    
    /*
    buildSelectedMemoryPanel method adds a read-only text field
    in order to display the selected memories cost
    */
    private void buildSelectedMemoryPanel(){
        //Create a panel to hold the components
        selectedMemory = new JPanel();
        
        //Create the label
        label = new JLabel("Price: ");
        
        //Create the uneditable text field
        selectedMem = new JTextField(5);
        selectedMem.setEditable(false);
        
        //Add the label and text field to the panel
        selectedMemory.add(label);
        selectedMemory.add(selectedMem);
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
            switch (memoryBox.getSelectedIndex()) {
                case 0:
                    selection = Double.toString(GB6);
                    selectedMem.setText(selection);
                    break;
                case 1:
                    selection = Double.toString(GB8);
                    selectedMem.setText(selection);
                    break;
                case 2:
                    selection = Double.toString(GB12);
                    selectedMem.setText(selection);
                    break;
                case 3:
                    selection = Double.toString(GB16);
                    selectedMem.setText(selection);
                    break;
                default:
                    selection = Double.toString(GB6);
                    selectedMem.setText(selection);
                    break;
            }
            }
        }
    /*
    The getMemoryPrice method returns the price of the selected item
    @return The Price of the selected item
    */
        public double getMemoryPrice(){
            //Variable to return to main method.
                double price;           
                
            //Switch Statement to calculate selected memory price 
             switch (memoryBox.getSelectedIndex()) {
                case 0:
                    price = GB6;
                    break;
                case 1:
                    price = GB8;
                    break;
                case 2:
                    price = GB12;
                    break;
                case 3:
                    price = GB16;
                    break;
                default:
                    price = 0.0;
                    break;
            }
    
                return price;
        }
    
}
    

