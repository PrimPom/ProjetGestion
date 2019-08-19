/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appgestion;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

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
       
        //création des sous menus
        menu.MenuItem menuParam1 =new menu.MenuItem(iconSubMenuParametrages, "CATEGORIES");
        menu.MenuItem menuParam2 =new menu.MenuItem(iconSubMenuParametrages, "PRODUITS");
        menu.MenuItem menuParam3 =new menu.MenuItem(iconSubMenuParametrages, "DEPARTEMENT");
        menu.MenuItem menuParam4 =new menu.MenuItem(iconSubMenuParametrages, "MAGASIN");
        menu.MenuItem menuParam5 =new menu.MenuItem(iconSubMenuParametrages, "FOURNISSEURS");
        
        ImageIcon iconSubMenuPlace2 = new ImageIcon(getClass().getResource("/menu/search.png"));
        
        menu.MenuItem menuParame1 =new menu.MenuItem(iconSubMenuPlace2, "VENTE DE PRODUITS");
        menu.MenuItem menuParame2 =new menu.MenuItem(iconSubMenuPlace2, "APPROVISIONNEMENT");
        menu.MenuItem menuParame3 =new menu.MenuItem(iconSubMenuPlace2, "TRANSFERT DE PRODUITS");
        menu.MenuItem menuParame4 =new menu.MenuItem(iconSubMenuPlace2, "RETOUR AUX FOURNISSEURS");
        
        
         ImageIcon iconSubMenuPlace3 = new ImageIcon(getClass().getResource("/menu/search.png"));
        
        menu.MenuItem menuParae1 =new menu.MenuItem(iconSubMenuPlace3, "STOCK PAR MAGASIN");
        menu.MenuItem menuParae2 =new menu.MenuItem(iconSubMenuPlace3, "STOCK DE TOUS LES MAGASINS");
        
         ImageIcon iconSubMenuPlace4 = new ImageIcon(getClass().getResource("/menu/search.png"));
        
        menu.MenuItem menuPara1 =new menu.MenuItem(iconSubMenuPlace4, "RAPPORT DE VENTES");
        menu.MenuItem menuPara2 =new menu.MenuItem(iconSubMenuPlace4, "APPROVISIONNEMENT PAR FOURNISSEUR");
        menu.MenuItem menuPara3 =new menu.MenuItem(iconSubMenuPlace4, "RETOUR PAR FOURNISSEUR");
        menu.MenuItem menuPara4 =new menu.MenuItem(iconSubMenuPlace4, "RECAPITILATIF DES APPROVISIONNEMENTS");
        menu.MenuItem menuPara5 =new menu.MenuItem(iconSubMenuPlace4, "TABLEAU ¨PERIODIQUE GLOBALE");
        menu.MenuItem menuPara6 =new menu.MenuItem(iconSubMenuPlace4, "TABLEAU SYNTHESE MAGASIN");
        menu.MenuItem menuPara7 =new menu.MenuItem(iconSubMenuPlace4, "TABLEAU SYNTHESE GLOBALE");
        menu.MenuItem menuPara8 =new menu.MenuItem(iconSubMenuPlace4, "SYNTHESE ECARTS");
        
        
        ImageIcon iconSubMenuPlace5 = new ImageIcon(getClass().getResource("/menu/search.png"));
        
        menu.MenuItem menuPar1 =new menu.MenuItem(iconSubMenuPlace5, "Parame 001");
        
        
        
        menu.MenuItem menuParametrages=new menu.MenuItem(iconParametrages,"PARAMETRAGES",menuParam1,menuParam2,menuParam3,menuParam4,menuParam5);
        menu.MenuItem menuPlace2=new menu.MenuItem(iconPlace3,"SAISIE DE DONNES",menuParame1,menuParame2,menuParame3,menuParame4);
        menu.MenuItem menuPlace3=new menu.MenuItem(iconPlace4,"CONSULTATION DES STOCKS",menuParae1,menuParae2);
        menu.MenuItem menuPlace4=new menu.MenuItem(iconPlace5,"EDITION DES ETATS",menuPara1,menuPara2,menuPara3,menuPara4,menuPara5,menuPara6,menuPara7,menuPara8);
        menu.MenuItem menuPlace5=new menu.MenuItem(iconPlace5,"OUTILS",menuPar1);
        
        
        
        addMenu(menuParametrages,menuPlace2,menuPlace3,menuPlace4,menuPlace5);
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

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 792, Short.MAX_VALUE)
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );

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