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
public class OperatingSystemPanel extends JPanel {
    /* 
    The following are constants to indicate the cost of 
    each type of Operating System.
    */
    private final double windows8 = 0.00;
    private final double linux = 50.00;
    private final double windows10 = 100.00;

    //To display the total
    private JLabel label;
    //To hold the components
    private JPanel OSPanel;
    private JPanel selectedOSDrive;
    //A list of Operating Systems
    private JComboBox operatingSysBox;
    //Text field showing selected Operating System price
    private JTextField selectedOS;
    //ComboBox selections
    private final String[] operatingSystem = {"Windows 8(Default)", "Linux",
                                                             "Windows 10"};
    
    /*
    Constructor
    */
    public OperatingSystemPanel(){
        //Create a boder layout
        setLayout(new BorderLayout());
        
        //Build the Panels
        buildOSPanel();
        buildSelectedOSPanel();
        
        //Build the Border Layout
        setBorder(BorderFactory.createTitledBorder("Operating System"));
        
        //Add the panels to the content pane
        add(OSPanel, BorderLayout.WEST);
        add(selectedOSDrive, BorderLayout.EAST);
        
        //Display the window
        setVisible(true);
    }
    
    
    /*
    Build the OSPanel method adds a comboBox with the types
    of operating systems to a panel
    */
    private void buildOSPanel(){
        //Create a panel to hold the combo box
        OSPanel = new JPanel();
        
        //Create the comboBox
        operatingSysBox = new JComboBox(operatingSystem);
        
        //Register an action listener
        operatingSysBox.addActionListener(new ComboBoxListener());
        
        //Add the comboBox to the panel
        OSPanel.add(operatingSysBox);
    }
    
    /*
    buildSelectedOSPanel method adds a read-only text field
    in order to display the selected operating system cost
    */
    private void buildSelectedOSPanel(){
        //Create a panel to hold the components
        selectedOSDrive = new JPanel();
        
        //Create the label
        label = new JLabel("Price: ");
        
        //Create the uneditable text field
        selectedOS = new JTextField(5);
        selectedOS.setEditable(false);
        
        //Add the label and text field to the panel
        selectedOSDrive.add(label);
        selectedOSDrive.add(selectedOS);
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
            switch (operatingSysBox.getSelectedIndex()) {
                case 0:
                    selection = Double.toString(windows8);
                    selectedOS.setText(selection);
                    break;
                case 1:
                    selection = Double.toString(linux);
                    selectedOS.setText(selection);
                    break;
                case 2:
                    selection = Double.toString(windows10);
                    selectedOS.setText(selection);
                    break;
                default:
                    selection = Double.toString(windows8);
                    selectedOS.setText(selection);
                    break;
            }
                
            }
        }
    
    /*
    The getOperatingSystemPrice method returns the price of the selected item
    @return The Price of the selected item
    */
        public double getOperatingSystemPrice(){
            //Variable to return to main method.
                double price;           
                
            //Switch Statement to calculate selected Operating System price 
             switch (operatingSysBox.getSelectedIndex()) {
                case 0:
                    price = windows8;
                    break;
                case 1:
                    price = linux;
                    break;
                case 2:
                    price = windows10;
                    break;
                default:
                    price = 0.0;
                    break;
            }
    
                return price;
        }
}
