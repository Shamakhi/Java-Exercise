

package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class myview {
    public myview() {
        initComponents();
       form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        form.setVisible(true);

    }

    private void namefieldMouseClicked(MouseEvent e) {
        if(namefield.getText().equals("name:")){
namefield.setText("");
        }
    }

    private void agefieldMouseClicked(MouseEvent e) {
        if(agefield.getText().equals("age:")){
            agefield.setText("");
        }
        // TODO add your code here
    }

    private void fathernameFieldMouseClicked(MouseEvent e) {
        if(fathernameField.getText().equals("fathername:")){
            fathernameField.setText("");
        }
        // TODO add your code here
    }

    private void CityFieldMouseClicked(MouseEvent e) {
        if(CityField.getText().equals("city:")){
            CityField.setText("");
        }
    }

    private void TakhasosFieldMouseClicked(MouseEvent e) {
        if(TakhasosField.getText().equals("Skill:")){
            TakhasosField.setText("");
        }
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void DoneButtonMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void SuccessButtonMouseClicked(MouseEvent e) { System.exit(0);}

    private void formButtonMouseClicked(MouseEvent e) {
if(namefield.getText().equals("")||namefield.getText().equals("name:")){
    error("name please");
}
else if(agefield.getText().equals("")||agefield.getText().equals("age")){
    error("age please");
}
else if(fathernameField.getText().equals("")||fathernameField.getText().equals("age")){
    error("fathername please");
}
else if(CityField.getText().equals("")||CityField.getText().equals("fathername")){
    error("cityfield please");
}
else if(TakhasosField.getText().equals("")||TakhasosField.getText().equals("Skill")){
    error("Takhasos please");
}
else{
try{
Service.getInstance().save(new Entity().setId(1).setName(namefield.getText()).setFathername(fathernameField.getText()).setAge(Integer.parseInt(agefield.getText())).setCity(CityField.getText()).setTakhasos(TakhasosField.getText()));
}catch (Exception ez){
    System.out.println("couldnt save"+ez.getMessage());
}
form.setVisible(false);
errordialog.setVisible(true);
}


    }

    private void error(String s) {
        errortext.setText("this cannot be empty"+s);
        errordialog.setVisible(true);
    }






    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Abolfazl
        form = new JFrame();
        namefield = new JTextField();
        agefield = new JTextField();
        fathernameField = new JTextField();
        CityField = new JTextField();
        TakhasosField = new JTextField();
        formButton = new JButton();
        PhoneField1 = new JTextField();
        errordialog = new JDialog();
        errortext = new JLabel();
        button1 = new JButton();

        //======== form ========
        {
            var formContentPane = form.getContentPane();
            formContentPane.setLayout(null);

            //---- namefield ----
            namefield.setText("name:");
            namefield.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    namefieldMouseClicked(e);
                }
            });
            formContentPane.add(namefield);
            namefield.setBounds(30, 10, 140, 40);

            //---- agefield ----
            agefield.setText("age:");
            agefield.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    agefieldMouseClicked(e);
                }
            });
            formContentPane.add(agefield);
            agefield.setBounds(30, 60, 140, 35);

            //---- fathernameField ----
            fathernameField.setText("fathername:");
            fathernameField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    fathernameFieldMouseClicked(e);
                }
            });
            formContentPane.add(fathernameField);
            fathernameField.setBounds(30, 100, 140, fathernameField.getPreferredSize().height);

            //---- CityField ----
            CityField.setText("city:");
            CityField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    CityFieldMouseClicked(e);
                }
            });
            formContentPane.add(CityField);
            CityField.setBounds(30, 135, 140, CityField.getPreferredSize().height);

            //---- TakhasosField ----
            TakhasosField.setText("Skill:");
            TakhasosField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    TakhasosFieldMouseClicked(e);
                }
            });
            formContentPane.add(TakhasosField);
            TakhasosField.setBounds(30, 170, 145, TakhasosField.getPreferredSize().height);
            PhoneField1.setText("Phone:");
            //---- formButton ----
            formButton.setText("Done");
            formButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                    DoneButtonMouseClicked(e);
                    formButtonMouseClicked(e);
                }
            });
            formContentPane.add(formButton);
            formButton.setBounds(245, 65, 113, 105);
            formContentPane.add(PhoneField1);
            PhoneField1.setBounds(30, 205, 145, PhoneField1.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < formContentPane.getComponentCount(); i++) {
                    Rectangle bounds = formContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = formContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                formContentPane.setMinimumSize(preferredSize);
                formContentPane.setPreferredSize(preferredSize);
            }
            form.pack();
            form.setLocationRelativeTo(form.getOwner());
        }

        //======== errordialog ========
        {
            var errordialogContentPane = errordialog.getContentPane();
            errordialogContentPane.setLayout(null);

            //---- errortext ----
            errortext.setText("«با شما تماس خواهیم گرفت» ");
            errordialogContentPane.add(errortext);
            errortext.setBounds(70, 25, 390, 65);

            //---- button1 ----
            button1.setText("OK");
            errordialogContentPane.add(button1);
            button1.setBounds(new Rectangle(new Point(365, 100), button1.getPreferredSize()));

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < errordialogContentPane.getComponentCount(); i++) {
                    Rectangle bounds = errordialogContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = errordialogContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                errordialogContentPane.setMinimumSize(preferredSize);
                errordialogContentPane.setPreferredSize(preferredSize);
            }
            errordialog.pack();
            errordialog.setLocationRelativeTo(errordialog.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Abolfazl
    private JFrame form;
    private JTextField namefield;
    private JTextField agefield;
    private JTextField fathernameField;
    private JTextField CityField;
    private JTextField TakhasosField;
    private JButton formButton;
    private JTextField PhoneField1;
    private JDialog errordialog;
    private JLabel errortext;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
