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
public class OpticalDrivePanel extends JPanel {
    /* 
    The following are constants to indicate the cost of 
    each type of Optical Drive.
    */
    private final double cD = 20.00;
    private final double cDDVD = 50.00;
    private final double cDDVDRW = 100.00;

    //To display the total
    private JLabel label;
    //To hold the components
    private JPanel CDPanel;
    private JPanel selectedCDDrive;
    //A list of Optical Drives
    private JComboBox CDDriveBox;
    //Text field showing selected CD drives price
    private JTextField selectedDrive;
    //ComboBox selections
    private final String[] opticalDrives = {"CD", "CDC/DVD", "CD/DVD/CDRW"};
    
    /*
    Constructor
    */
    public OpticalDrivePanel(){
        //Create a boder layout
        setLayout(new BorderLayout());
        
        //Build the Panels
        buildCDPanel();
        buildSelectedCDPanel();
        
        //Build the Border Layout
        setBorder(BorderFactory.createTitledBorder("Optical Drive"));
        
        //Add the panels to the content pane
        add(CDPanel, BorderLayout.WEST);
        add(selectedCDDrive, BorderLayout.EAST);
        
        //Display the window
        setVisible(true);
    }
    
    
    /*
    Build the CDPanel method adds a comboBox with the types
    of hard drives to a panel
    */
    private void buildCDPanel(){
        //Create a panel to hold the combo box
        CDPanel = new JPanel();
        
        //Create the comboBox
        CDDriveBox = new JComboBox(opticalDrives);
        
        //Register an action listener
        CDDriveBox.addActionListener(new ComboBoxListener());
        
        //Add the comboBox to the panel
        CDPanel.add(CDDriveBox);
    }
    
    /*
    buildSelectedCDPanel method adds a read-only text field
    in order to display the selected hard drives cost
    */
    private void buildSelectedCDPanel(){
        //Create a panel to hold the components
        selectedCDDrive = new JPanel();
        
        //Create the label
        label = new JLabel("Price: ");
        
        //Create the uneditable text field
        selectedDrive = new JTextField(5);
        selectedDrive.setEditable(false);
        
        //Add the label and text field to the panel
        selectedCDDrive.add(label);
        selectedCDDrive.add(selectedDrive);
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
            switch (CDDriveBox.getSelectedIndex()) {
                case 0:
                    selection = Double.toString(cD);
                    selectedDrive.setText(selection);
                    break;
                case 1:
                    selection = Double.toString(cDDVD);
                    selectedDrive.setText(selection);
                    break;
                case 2:
                    selection = Double.toString(cDDVDRW);
                    selectedDrive.setText(selection);
                    break;
                default:
                    selection = Double.toString(cD);
                    selectedDrive.setText(selection);
                    break;
            }
                
            }
        }
    
    /*
    The getOpticalDrivePrice method returns the price of the selected item
    @return The Price of the selected item
    */
        public double getOpticalDrivePrice(){
            //Variable to return to main method.
                double price;           
                
            //Switch Statement to calculate selected Optical Drive price 
             switch (CDDriveBox.getSelectedIndex()) {
                case 0:
                    price = cD;
                    break;
                case 1:
                    price = cDDVD;
                    break;
                case 2:
                    price = cDDVDRW;
                    break;
                default:
                    price = 0.0;
                    break;
            }
    
                return price;
        }
}

