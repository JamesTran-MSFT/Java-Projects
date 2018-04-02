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
public class AdditionalOptionsPanel extends JPanel {
    /* 
    The following are constants to indicate the cost of 
    each type of option
    */
    private final double security = 100.00;      //Security package i.e. Norton
    private final double gamePack = 150.00;      //Game package
    private final double MS2017 = 200.00;        //MS office 2017
    private final double MSB2017 = 250.00;       //MS Office Business 2017
    //To display the total
    private JLabel label;
    //To hold the components
    private JPanel AOPanel;
    private JPanel selectedOption;
    //A list of options
    private JComboBox optionBox;
    //Text field showing selected option price
    private JTextField selectedOP;
    //ComboBox selections
    private final String[] addOptions = {"Security Package", "Game Package", 
                "Microsoft Office Student 2017","Microsoft Office Business 2017"};
    
    /*
    Constructor
    */
    public AdditionalOptionsPanel(){
        //Create a boder layout
        setLayout(new BorderLayout());
        
        //Build the Panels
        buildOptionsPanel();
        buildSelectedOptionPanel();
        
        //Build the Border Layout
        setBorder(BorderFactory.createTitledBorder("Memory"));
        
        //Add the panels to the content pane
        add(AOPanel, BorderLayout.WEST);
        add(selectedOption, BorderLayout.EAST);

        setVisible(true);
    }
    
    
    /*
    Builf the OptionsPanel method adds a comboBox with the types
    of Options to a panel
    */
    private void buildOptionsPanel(){
        //Create a panel to hold the combo box
        AOPanel = new JPanel();
        
        //Create the comboBox
        optionBox = new JComboBox(addOptions);
        
        //Register an action listener
        optionBox.addActionListener(new ComboBoxListener());
        
        //Add the comboBox to the panel
        AOPanel.add(optionBox);
    }
    
    /*
    buildSelectedOptionPanel method adds a read-only text field
    in order to display the selected option cost
    */
    private void buildSelectedOptionPanel(){
        //Create a panel to hold the components
        selectedOption = new JPanel();
        
        //Create the label
        label = new JLabel("Price: ");
        
        //Create the uneditable text field
        selectedOP = new JTextField(5);
        selectedOP.setEditable(false);
        
        //Add the label and text field to the panel
        selectedOption.add(label);
        selectedOption.add(selectedOP);
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
            switch (optionBox.getSelectedIndex()) {
                case 0:
                    selection = Double.toString(security);
                    selectedOP.setText(selection);
                    break;
                case 1:
                    selection = Double.toString(gamePack);
                    selectedOP.setText(selection);
                    break;
                case 2:
                    selection = Double.toString(MS2017);
                    selectedOP.setText(selection);
                    break;
                case 3:
                    selection = Double.toString(MSB2017);
                    selectedOP.setText(selection);
                    break;
                default:
                    selection = Double.toString(security);
                    selectedOP.setText(selection);
                    break;
            }
                
            }
        }
    
    /*
    The getOptionsPrice method returns the price of the selected item
    @return The Price of the selected item
    */
        public double getOptionsPrice(){
            //Variable to return to main method.
                double price;           
                
            //Switch Statement to calculate selected option price 
             switch (optionBox.getSelectedIndex()) {
                case 0:
                    price = security;
                    break;
                case 1:
                    price = gamePack;
                    break;
                case 2:
                    price = MS2017;
                    break;
                case 3:
                    price = MSB2017;
                    break;
                default:
                    price = 0.0;
                    break;
            }
    
                return price;
        }
}

