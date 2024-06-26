/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import CONTROL.API;
import MODEL.ListagemDeDados;
import java.awt.CardLayout;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Hashtable;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.Hashtable;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author SYSTEM N.P
 */
public class Frame extends javax.swing.JFrame {

    /*Declaramos as variáveis que serão usadas para que os paineis sejam mostrados e possivelmente trocados se caso necessário*/
    private static JScrollPane painelRolagem;
    private static JPanel painelTroca;

    private static CardLayout baralhoPaineis;
    private static Frame INSTANCE;

    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();

        /*Invocamos o método que configura o processo de troca de painéis*/
        configuraTrocaPaineis();

        /*Inicializamos a variável que se refere à este frame que sera mostrado*/
        INSTANCE = this;

        /*Definimos que o tamanho do frame não poderá ser alterado pelo usuário, a fim de evitar que o layout e a disposição dos itens se mantenha como desejada*/
        setResizable(false);

        /*Invocamos o método que troca os painéis, para que seja mostrado o painel inicial*/
        trocaPainel("Tela Inicial", new Tela());

    }

    /*Método que configura o processo de troca de painéis*/
    private void configuraTrocaPaineis() {

        /*Definimos o layout do frame*/
        this.setLayout(new BorderLayout());

        /*Inicializamos o cardlayout, o JPanel usando o CardLayout como layout e inicializamos o JScrollPane*/
        baralhoPaineis = new CardLayout();
        painelTroca = new JPanel(baralhoPaineis);
        painelRolagem = new JScrollPane();

        /*Adicionamos o JScrollPane ao frame*/
        this.add(painelRolagem);

        /*Definimos que o PainelTroca deverá ser mostrado no JScrollPane*/
        painelRolagem.setViewportView(this.painelTroca);

    }

    /*Invocamos o método que troca os painéis, que passa o nome do painel e o painel como parâmetros*/
    public static void trocaPainel(String nome, JPanel novoPainel) {

        /*Adicionamos o painel e seu nome no painelTroca*/
        painelTroca.add(novoPainel, nome);

        /*Mostramos o painelTroca*/
        baralhoPaineis.show(painelTroca, nome);

        /*Definimos o tamanho do painel a ser mostrado como sendo igual ao tamanho do painel passado como parâmetro*/
        painelTroca.setPreferredSize(novoPainel.getPreferredSize());
        painelTroca.setSize(novoPainel.getSize());

        /*Definimos o tamanho do Frame INSTANCE, referente à esse respectivo frame, como o tamanho do painelTroca, o qual recebeu os tmaanhos do painel passado por parâmetro, somados com 23 e 48 para que seja ajustado com o tamanho do painelTroca e a estrutura do Frame*/
        INSTANCE.setSize(new Dimension(painelTroca.getPreferredSize().width + 23, painelTroca.getPreferredSize().height + 48));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 376));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 813, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
