
package Forms;

import Game.MainApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasSiBeteForm extends MainApplication {
    static JTextArea textResult;
    public PasSiBeteForm(){
        pasSiBeteWindow();
    }
    public static void pasSiBeteWindow(){

        JFrame f = new JFrame("Pas si bêtes");
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

        JLabel labelTransport = new JLabel("Moyen transport (f.s.) : ");
        labelTransport.setForeground(Color.white);
        labelTransport.setBounds(50, 50, 200, 30);
        JTextField transport = new JTextField();
        //set size of the text box
        transport.setBounds(195, 50, 200, 30);

        JLabel labelBestFriend = new JLabel("Prénom meilleure amie : ");
        labelBestFriend.setForeground(Color.white);
        labelBestFriend.setBounds(50, 100, 200, 30);
        JTextField bestFriend = new JTextField();
        bestFriend.setBounds(195, 100, 200, 30);

        JLabel labelVerb = new JLabel("V. inf. : ");
        labelVerb.setForeground(Color.white);
        labelVerb.setBounds(50, 150, 200, 30);
        JTextField verb = new JTextField();
        verb.setBounds(195, 150, 200, 30);

        JLabel labelNameFS = new JLabel("Nom (f.s.) : ");
        labelNameFS.setForeground(Color.white);
        labelNameFS.setBounds(50, 200, 200, 30);
        JTextField nameFS = new JTextField();
        nameFS.setBounds(195, 200, 200, 30);

        JLabel labelAdjectiveMS = new JLabel("Adj (m.s.) : ");
        labelAdjectiveMS.setForeground(Color.white);
        labelAdjectiveMS.setBounds(50, 250, 200, 30);
        JTextField adjectiveMS = new JTextField();
        adjectiveMS.setBounds(195, 250, 200, 30);

        JLabel labelOtherVerb = new JLabel("V. inf. : ");
        labelOtherVerb.setForeground(Color.white);
        labelOtherVerb.setBounds(50, 300, 200, 30);
        JTextField otherVerb = new JTextField();
        otherVerb.setBounds(195, 300, 200, 30);

        JLabel labelNameFP = new JLabel("Nom (f.pl.) : ");
        labelNameFP.setForeground(Color.white);
        labelNameFP.setBounds(50, 350, 200, 30);
        JTextField nameFP = new JTextField();
        nameFP.setBounds(195, 350, 200, 30);

        JLabel labelNameSV = new JLabel("Nom (s.) (v-) : ");
        labelNameSV.setForeground(Color.white);
        labelNameSV.setBounds(50, 400, 200, 30);
        JTextField nameSV = new JTextField();
        nameSV.setBounds(195, 400, 200, 30);

        JLabel labelOtherAdjectiveMP = new JLabel("Adj. (m.pl.) : ");
        labelOtherAdjectiveMP.setForeground(Color.white);
        labelOtherAdjectiveMP.setBounds(50, 450, 200, 30);
        JTextField otherAdjectiveMP = new JTextField();
        otherAdjectiveMP.setBounds(195, 450, 200, 30);

        JLabel labelMonument = new JLabel("Monument célèbre (f.s.) : ");
        labelMonument.setForeground(Color.white);
        labelMonument.setBounds(50, 500, 200, 30);
        JTextField monument = new JTextField();
        monument.setBounds(195, 500, 200, 30);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(130, 630, 70, 50);
        submitButton.setBackground(Color.black);
        submitButton.setForeground(Color.white);
        submitButton.setSize(150, 50);
        submitButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));

        JLabel label1 = new JLabel();
        label1.setBounds(10, 110, 200, 100);

        //add elements to the frame
        f.add(labelTransport);
        f.add(transport);
        f.add(labelBestFriend);
        f.add(bestFriend);
        f.add(labelVerb);
        f.add(verb);
        f.add(labelNameFS);
        f.add(nameFS);
        f.add(labelAdjectiveMS);
        f.add(adjectiveMS);
        f.add(labelOtherVerb);
        f.add(otherVerb);
        f.add(labelNameFP);
        f.add(nameFP);
        f.add(labelNameSV);
        f.add(nameSV);
        f.add(labelOtherAdjectiveMP);
        f.add(otherAdjectiveMP);
        f.add(labelMonument);
        f.add(monument);
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
                    result = "PAS SI BÊTES \n" + "\nLe cerveau des dinosaures herbivores était très petit par rapport à leur très grande " + transport.getText() + ". Un peu comme celui de ton amie " + bestFriend.getText() +
                    ".\nOn va même jusqu'à " + verb.getText() + " que celui du stégosaure était minuscule.\nPour les carnivores, c'est une autre " + nameFS.getText() + ", car leur cerveau était plus " + adjectiveMS.getText() +
                    ". Serait-ce moins compliqué de " + otherVerb.getText() + " des " + nameFP.getText() + " vertes que de chasser le gros gibier ? En fait, la taille du cerveau n'a rien à voir avec l'" + nameSV.getText() + " du dinosaure."
                    + "\nEn tout cas, une chose est sûre, ces lézards n'étaient pas " + otherAdjectiveMP.getText() + ". La preuve : ils ont réussi à vivre sur la " + monument.getText() + " pendant 170 millions d'années. Pas si bêtes !";
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


