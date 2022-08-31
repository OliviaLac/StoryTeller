
package Forms;

import Game.MainApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LemurienAgileForm extends MainApplication {
    static JTextArea textResult;
    public LemurienAgileForm(){
        leLemurienAgileWindow();
    }
    public static void leLemurienAgileWindow(){

        JFrame f = new JFrame("Le lémurien agile");
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

        JLabel labelNameFP = new JLabel("Nom (f.pl) : ");
        labelNameFP.setForeground(Color.white);
        labelNameFP.setBounds(50, 20, 200, 30);
        JTextField nameFP = new JTextField();
        //set size of the text box
        nameFP.setBounds(165, 20, 200, 30);

        JLabel labelAdjectiveFP = new JLabel("Adj. (f.pl) : ");
        labelAdjectiveFP.setForeground(Color.white);
        labelAdjectiveFP.setBounds(50, 70, 200, 30);
        JTextField adjectiveFP = new JTextField();
        adjectiveFP.setBounds(165, 70, 200, 30);

        JLabel labelNumber = new JLabel("Nombre : ");
        labelNumber.setForeground(Color.white);
        labelNumber.setBounds(50, 120, 200, 30);
        JTextField number = new JTextField();
        number.setBounds(165, 120, 200, 30);

        JLabel labelVerb = new JLabel("V. inf. : ");
        labelVerb.setForeground(Color.white);
        labelVerb.setBounds(50, 170, 200, 30);
        JTextField verb = new JTextField();
        verb.setBounds(165, 170, 200, 30);

        JLabel labelNameS = new JLabel("Nom (s.) : ");
        labelNameS.setForeground(Color.white);
        labelNameS.setBounds(50, 220, 200, 30);
        JTextField nameS = new JTextField();
        nameS.setBounds(165, 220, 200, 30);

        JLabel labelClotheS = new JLabel("Vêtement (s.) : ");
        labelClotheS.setForeground(Color.white);
        labelClotheS.setBounds(50, 270, 200, 30);
        JTextField clotheS = new JTextField();
        clotheS.setBounds(165, 270, 200, 30);

        JLabel labelAnimalMS = new JLabel("Animal (m.s.) : ");
        labelAnimalMS.setForeground(Color.white);
        labelAnimalMS.setBounds(50, 320, 200, 30);
        JTextField animalMS = new JTextField();
        animalMS.setBounds(165, 320, 200, 30);

        JLabel labelPartOfBodyP = new JLabel("Partie du corps (pl.) : ");
        labelPartOfBodyP.setForeground(Color.white);
        labelPartOfBodyP.setBounds(50, 370, 200, 30);
        JTextField partOfBodyP = new JTextField();
        partOfBodyP.setBounds(165, 370, 200, 30);

        JLabel labelNamePerson = new JLabel("Prénom (m.) : ");
        labelNamePerson.setForeground(Color.white);
        labelNamePerson.setBounds(50, 420, 200, 30);
        JTextField namePerson = new JTextField();
        namePerson.setBounds(165, 420, 200, 30);

        JLabel labelAdverb_MENT = new JLabel("Adv. [-ment] : ");
        labelAdverb_MENT.setForeground(Color.white);
        labelAdverb_MENT.setBounds(50, 470, 200, 30);
        JTextField adverb_MENT = new JTextField();
        adverb_MENT.setBounds(165, 470, 200, 30);

        JLabel labelAdjectiveMS = new JLabel("Adj. (m.s.) : ");
        labelAdjectiveMS.setForeground(Color.white);
        labelAdjectiveMS.setBounds(50, 520, 200, 30);
        JTextField adjectiveMS = new JTextField();
        adjectiveMS.setBounds(165, 520, 200, 30);

        JLabel labelNameOtherPerson = new JLabel("Prénom (m.) : ");
        labelNameOtherPerson.setForeground(Color.white);
        labelNameOtherPerson.setBounds(50, 570, 200, 30);
        JTextField nameOtherPerson = new JTextField();
        nameOtherPerson.setBounds(165, 570, 200, 30);

        JLabel labelUglyAnimalMS = new JLabel("Animal laid (m.s.) : ");
        labelUglyAnimalMS.setForeground(Color.white);
        labelUglyAnimalMS.setBounds(50, 620, 200, 30);
        JTextField uglyAnimalMS = new JTextField();
        uglyAnimalMS.setBounds(165, 620, 200, 30);

        JLabel labelPejorativeAdjectiveMS = new JLabel("Adj. péjoratif (m.s.) : ");
        labelPejorativeAdjectiveMS.setForeground(Color.white);
        labelPejorativeAdjectiveMS.setBounds(50, 670, 200, 30);
        JTextField pejorativeAdjectiveMS = new JTextField();
        pejorativeAdjectiveMS.setBounds(165, 670, 200, 30);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(130, 730, 70, 50);
        submitButton.setBackground(Color.black);
        submitButton.setForeground(Color.white);
        submitButton.setSize(150, 50);
        submitButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));

        JLabel label1 = new JLabel();
        label1.setBounds(10, 110, 200, 100);

        //add elements to the frame
        f.add(labelNameFP);
        f.add(nameFP);
        f.add(labelAdjectiveFP);
        f.add(adjectiveFP);
        f.add(labelNumber);
        f.add(number);
        f.add(labelVerb);
        f.add(verb);
        f.add(labelNameS);
        f.add(nameS);
        f.add(labelClotheS);
        f.add(clotheS);
        f.add(labelAnimalMS);
        f.add(animalMS);
        f.add(labelPartOfBodyP);
        f.add(partOfBodyP);
        f.add(labelNamePerson);
        f.add(namePerson);
        f.add(labelAdverb_MENT);
        f.add(adverb_MENT);
        f.add(labelAdjectiveMS);
        f.add(adjectiveMS);
        f.add(labelNameOtherPerson);
        f.add(nameOtherPerson);
        f.add(labelUglyAnimalMS);
        f.add(uglyAnimalMS);
        f.add(labelPejorativeAdjectiveMS);
        f.add(pejorativeAdjectiveMS);
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
                   result = "LE LEMURIEN AGILE \n" + "\nAujourd'hui, les enfants de la colonie ont passé des " + nameFP.getText() + " plus " + adjectiveFP.getText() + " les unes que les autres.\n Ils sont restés plus de " +  number.getText() +
                   " heures dans la forêt. Le but de la première étape était d'arriver à " + verb.getText() + " sans les mains. \n Ensuite, au cours d'une chasse au "
                   + nameS.getText() + " , ils devaient retrouver leur " + clotheS.getText() + " dans la nuit. \n La dernière étape, avant de reçevoir leur surnom, consistait à attraper un "
                   + animalMS.getText() + " avec les " + partOfBodyP.getText() + ". " + namePerson.getText() + " s'est très bien débrouillé. Il a été nommé 'petit lémurien agile', parce qu'il a remporté "
                   + adverb_MENT.getText() + " les " + nameFP.getText() + " et qu'il a été très " + adjectiveMS.getText() + ". Bienvenue petit lémurien agile ! \n"
                   + nameOtherPerson.getText() + ", quant à lui, a tout raté. Du coup, il a été baptisé '" + uglyAnimalMS.getText() + " " + pejorativeAdjectiveMS.getText() + "'."
                   ;
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

