/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appgestion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author primp
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        execute();
    }

    
    private void execute(){
        
        ImageIcon iconParametrages = new ImageIcon(getClass().getResource("/menu/home.png"));
        ImageIcon iconPlace2 = new ImageIcon(getClass().getResource("/menu/home.png"));
        ImageIcon iconPlace3 = new ImageIcon(getClass().getResource("/menu/home.png"));
        ImageIcon iconPlace4 = new ImageIcon(getClass().getResource("/menu/home.png"));
        ImageIcon iconPlace5 = new ImageIcon(getClass().getResource("/menu/home.png"));
        

        ImageIcon iconSubMenuParametrages = new ImageIcon(getClass().getResource("/menu/search.png"));
       
        //création des sous menus Parametrages
        menu.MenuItem param_Categorie =new menu.MenuItem(iconSubMenuParametrages, "Catégories",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelBody.add(new body.Categories());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        menu.MenuItem param_Produit =new menu.MenuItem(iconSubMenuParametrages, "Produtis",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelBody.repaint();
                panelBody.add(new body.Produits());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        menu.MenuItem param_Departement =new menu.MenuItem(iconSubMenuParametrages, "Departement",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelBody.add(new body.Departement());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        menu.MenuItem param_Magasin =new menu.MenuItem(iconSubMenuParametrages, "Magasin",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelBody.add(new body.Magasin());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        menu.MenuItem param_Fournisseur =new menu.MenuItem(iconSubMenuParametrages, "Fournisseurs",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelBody.add(new body.Fournisseurs());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        
        ImageIcon iconSubMenuPlace2 = new ImageIcon(getClass().getResource("/menu/search.png"));
        
        
        // Sous menus saisies donnees
        menu.MenuItem saisie_Vente =new menu.MenuItem(iconSubMenuPlace2, "VENTE DE PRODUITS".toLowerCase(),null);
        menu.MenuItem saisie_Approvisionnement =new menu.MenuItem(iconSubMenuPlace2, "APPROVISIONNEMENT".toLowerCase(),null);
        menu.MenuItem saisie_Transfert =new menu.MenuItem(iconSubMenuPlace2, "TRANSFERT DE PRODUITS".toLowerCase(),null);
        menu.MenuItem saisie_Retour =new menu.MenuItem(iconSubMenuPlace2, "RETOUR AUX FOURNISSEURS".toLowerCase(),null);
        
        
         ImageIcon iconSubMenuPlace3 = new ImageIcon(getClass().getResource("/menu/search.png"));
        
         
         //Sous menus consultations de stocks
        menu.MenuItem consul_Stock_par_Magasin =new menu.MenuItem(iconSubMenuPlace3, "STOCK PAR MAGASIN".toLowerCase(),null);
        menu.MenuItem consul_Stock_tous_Magasin =new menu.MenuItem(iconSubMenuPlace3, "STOCK DE TOUS LES MAGASINS".toLowerCase(),null);
        
         ImageIcon iconSubMenuPlace4 = new ImageIcon(getClass().getResource("/menu/search.png"));
        
         
         // Sous menus editions etats
        menu.MenuItem edition_Rapport_de_Vente =new menu.MenuItem(iconSubMenuPlace4, "RAPPORT DE VENTES".toLowerCase(),null);
        menu.MenuItem edition_Appro_par_Fournisseur =new menu.MenuItem(iconSubMenuPlace4, "APPROVISIONNEMENT PAR FOURNISSEUR".toLowerCase(),null);
        menu.MenuItem edition_Retour_par_Fournisseur =new menu.MenuItem(iconSubMenuPlace4, "RETOUR PAR FOURNISSEUR".toLowerCase(),null);
        menu.MenuItem edition_Recap_des_Appro =new menu.MenuItem(iconSubMenuPlace4, "RECAPITULATIF DES APPROVISIONNEMENTS".toLowerCase(),null);
        menu.MenuItem edition_Tableau_Periodiq_Globale =new menu.MenuItem(iconSubMenuPlace4, "TABLEAU ¨PERIODIQUE GLOBALE".toLowerCase(),null);
        menu.MenuItem edition_Tableau_Synthese_Magasin =new menu.MenuItem(iconSubMenuPlace4, "TABLEAU SYNTHESE MAGASIN".toLowerCase(),null);
        menu.MenuItem edition_Tableau_Synthese_Globale =new menu.MenuItem(iconSubMenuPlace4, "TABLEAU SYNTHESE GLOBALE".toLowerCase(),null);
        menu.MenuItem edition_Synthese_Ecarts =new menu.MenuItem(iconSubMenuPlace4, "SYNTHESE ECARTS".toLowerCase(),null);
        
        
        ImageIcon iconSubMenuPlace5 = new ImageIcon(getClass().getResource("/menu/search.png"));
        
        menu.MenuItem outilsExemples =new menu.MenuItem(iconSubMenuPlace5, "Parame 001",null);
        
        
        
        menu.MenuItem menuParametrages=new menu.MenuItem(iconParametrages,"PARAMETRAGES",null,param_Categorie ,param_Produit,param_Departement,param_Magasin,param_Fournisseur);
        menuParametrages.setBackground(Color.GREEN);
        
        menu.MenuItem menuSaisieDonne=new menu.MenuItem(iconPlace3,"SAISIE DE DONNES",null,saisie_Vente,saisie_Approvisionnement,saisie_Transfert,saisie_Retour);
        menuSaisieDonne.setBackground(Color.YELLOW);
        menu.MenuItem menuConsultationStock=new menu.MenuItem(iconPlace4,"CONSULTATION DES STOCKS",null,consul_Stock_par_Magasin ,consul_Stock_tous_Magasin);
        menuConsultationStock.setBackground(Color.red);
        menu.MenuItem menuEditionEtat=new menu.MenuItem(iconPlace5,"EDITION DES ETATS",null,edition_Rapport_de_Vente,edition_Appro_par_Fournisseur,edition_Retour_par_Fournisseur,edition_Recap_des_Appro,edition_Tableau_Periodiq_Globale,edition_Tableau_Synthese_Magasin,edition_Tableau_Synthese_Globale,edition_Synthese_Ecarts );
        menuEditionEtat.setBackground(Color.green);
        menu.MenuItem menuOutil=new menu.MenuItem(iconPlace5,"OUTILS",null,outilsExemples);
        menuOutil.setBackground(Color.yellow);
        
        
        
        addMenu(menuParametrages,menuSaisieDonne,menuConsultationStock,menuEditionEtat,menuOutil);
    }
    
    private void addMenu(menu.MenuItem... Menu){
        for(int i=0;i<Menu.length;i++){
            menus.add(Menu[i]);
            ArrayList<menu.MenuItem>subMenu= Menu[i].getSubMenu();
            for(menu.MenuItem m:subMenu){
                addMenu(m);
            }
            
        }
        menus.revalidate();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        panelBody = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        panelHeader.setBackground(new java.awt.Color(51, 51, 255));
        panelHeader.setPreferredSize(new java.awt.Dimension(1042, 50));

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1042, Short.MAX_VALUE)
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(panelHeader, java.awt.BorderLayout.PAGE_START);

        panelMenu.setBackground(new java.awt.Color(102, 102, 255));
        panelMenu.setPreferredSize(new java.awt.Dimension(250, 614));

        jScrollPane1.setBorder(null);

        menus.setBackground(new java.awt.Color(255, 255, 255));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );

        getContentPane().add(panelMenu, java.awt.BorderLayout.LINE_START);

        panelBody.setBackground(new java.awt.Color(255, 255, 255));
        panelBody.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panelBody, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1064, 720));
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
