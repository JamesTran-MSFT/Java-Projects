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
public class GraphicsCardPanel extends JPanel {
    /* 
    The following are constants to indicate the cost of 
    each type of Graphics Card.
    */
    private final double G310 = 100.00;
    private final double GT620 = 150.00;
    private final double GT640 = 200.00;

    //To display the total
    private JLabel label;
    //To hold the components
    private JPanel GCPanel;
    private JPanel selectedGCDrive;
    //A list of Graphics Cards
    private JComboBox graphicsBox;
    //Text field showing selected Graphics Card price
    private JTextField selectedGC;
    //ComboBox selections
    private final String[] graphicsCards = {"G310 512MB DDR3", "GT620 1GB DDR3",
                                                             "GT640 1GB GDDR5"};
    
    /*
    Constructor
    */
    public GraphicsCardPanel(){
        //Create a boder layout
        setLayout(new BorderLayout());
        
        //Build the Panels
        buildGCPanel();
        buildSelectedGCPanel();
        
        //Build the Border Layout
        setBorder(BorderFactory.createTitledBorder("Graphics Card - NVIDIA GeForce"));
        
        //Add the panels to the content pane
        add(GCPanel, BorderLayout.WEST);
        add(selectedGCDrive, BorderLayout.EAST);
        
        //Display the window
        setVisible(true);
    }
    
    
    /*
    Build the GCPanel method adds a comboBox with the types
    of graphics cards to a panel
    */
    private void buildGCPanel(){
        //Create a panel to hold the combo box
        GCPanel = new JPanel();
        
        //Create the comboBox
        graphicsBox = new JComboBox(graphicsCards);
        
        //Register an action listener
        graphicsBox.addActionListener(new ComboBoxListener());
        
        //Add the comboBox to the panel
        GCPanel.add(graphicsBox);
    }
    
    /*
    buildSelectedGCPanel method adds a read-only text field
    in order to display the selected Graphics card cost
    */
    private void buildSelectedGCPanel(){
        //Create a panel to hold the components
        selectedGCDrive = new JPanel();
        
        //Create the label
        label = new JLabel("Price: ");
        
        //Create the uneditable text field
        selectedGC = new JTextField(5);
        selectedGC.setEditable(false);
        
        //Add the label and text field to the panel
        selectedGCDrive.add(label);
        selectedGCDrive.add(selectedGC);
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
            switch (graphicsBox.getSelectedIndex()) {
                case 0:
                    selection = Double.toString(G310);
                    selectedGC.setText(selection);
                    break;
                case 1:
                    selection = Double.toString(GT620);
                    selectedGC.setText(selection);
                    break;
                case 2:
                    selection = Double.toString(GT640);
                    selectedGC.setText(selection);
                    break;
                default:
                    selection = Double.toString(G310);
                    selectedGC.setText(selection);
                    break;
            }
                
            }
        }
    
    /*
    The getGraphicCardPrice method returns the price of the selected item
    @return The Price of the selected item
    */
        public double getGraphicCardPrice(){
            //Variable to return to main method.
                double price;           
                
            //Switch Statement to calculate selected Graphics Card price 
             switch (graphicsBox.getSelectedIndex()) {
                case 0:
                    price = G310;
                    break;
                case 1:
                    price = GT620;
                    break;
                case 2:
                    price = GT640;
                    break;
                default:
                    price = 0.0;
                    break;
            }
    
                return price;
        }
}
