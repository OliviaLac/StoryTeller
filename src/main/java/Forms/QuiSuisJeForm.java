
package Forms;

import Game.MainApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuiSuisJeForm extends MainApplication {
    static JTextArea textResult;
    public QuiSuisJeForm(){
        quiSuisJeWindow();
    }
    public static void quiSuisJeWindow(){

        JFrame f = new JFrame("Qui suis-je ?");
        textResult = new JTextArea();
        textResult.setBounds(500, 50, 580, 700);
        textResult.setEditable(false);
         textResult.setBackground(Color.black);
        textResult.setForeground(Color.white);
        //set size of frame
        f.setSize(1200, 860);
         f.getContentPane().setBackground(Color.black);
        //make sure it quits when x is clicked
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelObject = new JLabel("Objet (pl.) : ");
        labelObject.setForeground(Color.white);
        labelObject.setBounds(50, 50, 200, 30);
        JTextField object = new JTextField();
        //set size of the text box
        object.setBounds(175, 50, 200, 30);

        JLabel labelAdjectiveMP = new JLabel("Adj. (m.pl) : ");
        labelAdjectiveMP.setForeground(Color.white);
        labelAdjectiveMP.setBounds(50, 100, 200, 30);
        JTextField adjectiveMP = new JTextField();
        adjectiveMP.setBounds(175, 100, 200, 30);

        JLabel labelNomMP = new JLabel("Nom. (m.pl) : ");
        labelNomMP.setForeground(Color.white);
        labelNomMP.setBounds(50, 150, 200, 30);
        JTextField nomMP = new JTextField();
        nomMP.setBounds(175, 150, 200, 30);

        JLabel labelPlace = new JLabel("Lieu (f.s.) : ");
        labelPlace.setForeground(Color.white);
        labelPlace.setBounds(50, 200, 200, 30);
        JTextField place = new JTextField();
        place.setBounds(175, 200, 200, 30);

        JLabel labelNameP = new JLabel("Nom (pl.) : ");
        labelNameP.setForeground(Color.white);
        labelNameP.setBounds(50, 250, 200, 30);
        JTextField nameP = new JTextField();
        nameP.setBounds(175, 250, 200, 30);

        JLabel labelNameMS = new JLabel("Nom (m.s.) : ");
        labelNameMS.setForeground(Color.white);
        labelNameMS.setBounds(50, 300, 200, 30);
        JTextField nameMS = new JTextField();
        nameMS.setBounds(175, 300, 200, 30);

        JLabel labelPast = new JLabel("Part. passé (m.s.) : ");
        labelPast.setForeground(Color.white);
        labelPast.setBounds(50, 350, 200, 30);
        JTextField past = new JTextField();
        past.setBounds(175, 350, 200, 30);

        JLabel labelNameFS = new JLabel("Nom (f.s.) : ");
        labelNameFS.setForeground(Color.white);
        labelNameFS.setBounds(50, 400, 200, 30);
        JTextField nameFS = new JTextField();
        nameFS.setBounds(175, 400, 200, 30);

        JLabel labelOtherAdjectiveMP = new JLabel("Adj. (m.pl.) : ");
        labelOtherAdjectiveMP.setForeground(Color.white);
        labelOtherAdjectiveMP.setBounds(50, 450, 200, 30);
        JTextField otherAdjectiveMP = new JTextField();
        otherAdjectiveMP.setBounds(175, 450, 200, 30);

        JLabel labelOtherNameP = new JLabel("Nom (pl.) : ");
        labelOtherNameP.setForeground(Color.white);
        labelOtherNameP.setBounds(50, 500, 200, 30);
        JTextField otherNameP = new JTextField();
        otherNameP.setBounds(175, 500, 200, 30);

        JLabel labelOtherNameMS = new JLabel("Nom (m.s.) : ");
        labelOtherNameMS.setForeground(Color.white);
        labelOtherNameMS.setBounds(50, 550, 200, 30);
        JTextField otherNameMS = new JTextField();
        otherNameMS.setBounds(175, 550, 200, 30);

        JLabel labelBestFriend = new JLabel("Prénom meilleur ami : ");
        labelBestFriend.setForeground(Color.white);
        labelBestFriend.setBounds(50, 600, 200, 30);
        JTextField bestFriend = new JTextField();
        bestFriend.setBounds(175, 600, 200, 30);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(130, 680, 70, 50);
        submitButton.setBackground(Color.black);
        submitButton.setForeground(Color.white);
        submitButton.setSize(150, 50);
        submitButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));

        JLabel label1 = new JLabel();
        label1.setBounds(10, 110, 200, 100);

        //add elements to the frame
        f.add(labelObject);
        f.add(object);
        f.add(labelAdjectiveMP);
        f.add(adjectiveMP);
        f.add(labelNomMP);
        f.add(nomMP);
        f.add(labelPlace);
        f.add(place);
        f.add(labelNameP);
        f.add(nameP);
        f.add(labelNameMS);
        f.add(nameMS);
        f.add(labelPast);
        f.add(past);
        f.add(labelNameFS);
        f.add(nameFS);
        f.add(labelOtherAdjectiveMP);
        f.add(otherAdjectiveMP);
        f.add(labelOtherNameP);
        f.add(otherNameP);
        f.add(labelOtherNameMS);
        f.add(otherNameMS);
        f.add(labelBestFriend);
        f.add(bestFriend);
        f.add(textResult);
        f.add(submitButton);

        f.setLayout(null);
        f.setVisible(true);
        submitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String title = "";
                String result = "";
                if(ae.getSource() == submitButton) {
                    result = "QUI SUIS-JE ? \n" + "\nJe suis un reptile. Mes bras et mes " + object.getText() + " sont " + adjectiveMP.getText() + ", comme chez tous les " + nomMP.getText()
                    + ".\n Normalement, je vis sur la " + place.getText() + " et j'adore prendre des bains dans les " + nameP.getText() + ". \n Je n'ai jamais rencontré un seul " + nameMS.getText() +
                    " car je suis apparu sur la planète il y a 235 millions d'années.\n L'homme n'était pas encore " + past.getText() + ".\nCertains d'entre nous mangent de la " + nameFS.getText() +
                    " fraîche et d'autres des végétaux " + otherAdjectiveMP.getText() + ".\nLes " + otherNameP.getText() + ", les lézards et les crocodiles sont mes lointains cousins.\nMon meilleur "
                    + otherNameMS.getText() + " s'appelle " + bestFriend.getText() + ".\nEh oui, je suis un dinosaure.";
                }
                textResult.setText(result);
                textResult.setLineWrap(true);
                textResult.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                textResult.setWrapStyleWord(true);
                textResult.setMargin(new Insets(10,10,10,10));
            }
        });
    }
}

