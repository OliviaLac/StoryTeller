package Game;

import Forms.LemurienAgileForm;
import Forms.PasSiBeteForm;
import Forms.QuiSuisJeForm;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainApplication {

    public static void main(String[] args) {
        LemurienAgileForm leFormulaire = new LemurienAgileForm();
        QuiSuisJeForm formqQui = new QuiSuisJeForm();
        Container con;
        JPanel titleNamePanel;
        JLabel titleNameLabel;
        Font titleFont = new Font("Times New Roman", Font.PLAIN, 75);
        JButton leLemurienAgileButton;
        JButton quiSuisJeButton;
        JButton pasSiBeteButton;

        JFrame window = new JFrame();
        window.setSize(1200, 860);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(300, 100, 600, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("STORYTELLER");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(370, 400, 200, 100);
        buttonPanel.setBackground(Color.black);
        buttonPanel.setSize(450, 250);
        buttonPanel.setFont(new Font("Times New Roman", Font.PLAIN, 95));
        GridLayout buttonLayout = new GridLayout(3,1);
        buttonLayout.setVgap(30);
        buttonPanel.setLayout(buttonLayout);

        leLemurienAgileButton = new JButton("Le lémurien agile");
        leLemurienAgileButton.setBackground(Color.black);
        leLemurienAgileButton.setForeground(Color.white);
        leLemurienAgileButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));

        quiSuisJeButton = new JButton("Qui suis-je ?");
        quiSuisJeButton.setBackground(Color.black);
        quiSuisJeButton.setForeground(Color.white);
        quiSuisJeButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));

        pasSiBeteButton = new JButton("Pas si bêtes");
        pasSiBeteButton.setBackground(Color.black);
        pasSiBeteButton.setForeground(Color.white);
        pasSiBeteButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));

        titleNamePanel.add(titleNameLabel);
        buttonPanel.add(leLemurienAgileButton);
        buttonPanel.add(quiSuisJeButton);
        buttonPanel.add(pasSiBeteButton);

        con.add(titleNamePanel);
        con.add(buttonPanel);

        // ADD NAVIGATION TO BUTTONS
        leLemurienAgileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LemurienAgileForm forms = new LemurienAgileForm();
            }
        });

        quiSuisJeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                QuiSuisJeForm forms = new QuiSuisJeForm();
            }
        });

        pasSiBeteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PasSiBeteForm forms = new PasSiBeteForm();
            }
        });
    }
    }


