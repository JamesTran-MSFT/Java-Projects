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
public class HardDrivePanel extends JPanel {
    /* 
    The following are constants to indicate the cost of 
    each type of Hard Drive
    */
    private final double GB250 = 50.00;
    private final double GB500 = 100.00;
    private final double GB1TB = 150.00;

    //To display the total
    private JLabel label;
    //To hold the components
    private JPanel hdPanel;
    private JPanel selectedHardDrive;
    //A list of processors
    private JComboBox HardDriveBox;
    //Text field showing selected processors price
    private JTextField selectedHD;
    //ComboBox selections
    private final String[] hardDrives = {"250GB", "500GB", "1TB"};
    
    /*
    Constructor
    */
    public HardDrivePanel(){
        //Create a boder layout
        setLayout(new BorderLayout());
        
        //Build the Panels
        buildHDPanel();
        buildSelectedHDPanel();
        
        //Build the Border Layout
        setBorder(BorderFactory.createTitledBorder("Hard Drive"));
        
        //Add the panels to the content pane
        add(hdPanel, BorderLayout.WEST);
        add(selectedHardDrive, BorderLayout.EAST);
        
        //Display the window
        setVisible(true);
    }
    
    
    /*
    Build the HDPanel method adds a comboBox with the types
    of hard drives to a panel
    */
    private void buildHDPanel(){
        //Create a panel to hold the combo box
        hdPanel = new JPanel();
        
        //Create the comboBox
        HardDriveBox = new JComboBox(hardDrives);
        
        //Register an action listener
        HardDriveBox.addActionListener(new ComboBoxListener());
        
        //Add the comboBox to the panel
        hdPanel.add(HardDriveBox);
    }
    
    /*
    buildSelectedHDPanel method adds a read-only text field
    in order to display the selected hard drives cost
    */
    private void buildSelectedHDPanel(){
        //Create a panel to hold the components
        selectedHardDrive = new JPanel();
        
        //Create the label
        label = new JLabel("Price: ");
        
        //Create the uneditable text field
        selectedHD = new JTextField(5);
        selectedHD.setEditable(false);
        
        //Add the label and text field to the panel
        selectedHardDrive.add(label);
        selectedHardDrive.add(selectedHD);
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
            switch (HardDriveBox.getSelectedIndex()) {
                case 0:
                    selection = Double.toString(GB250);
                    selectedHD.setText(selection);
                    break;
                case 1:
                    selection = Double.toString(GB500);
                    selectedHD.setText(selection);
                    break;
                case 2:
                    selection = Double.toString(GB1TB);
                    selectedHD.setText(selection);
                    break;
                default:
                    selection = Double.toString(GB250);
                    selectedHD.setText(selection);
                    break;
            }
                
            }
        }
    
    /*
    The getHardDrivePrice method returns the price of the selected item
    @return The Price of the selected item
    */
        public double getHardDrivePrice(){
            //Variable to return to main method.
                double price;           
                
            //Switch Statement to calculate selected Hard Drive price 
             switch (HardDriveBox.getSelectedIndex()) {
                case 0:
                    price = GB250;
                    break;
                case 1:
                    price = GB500;
                    break;
                case 2:
                    price = GB1TB;
                    break;
                default:
                    price = 0.0;
                    break;
            }
    
                return price;
        }
}

