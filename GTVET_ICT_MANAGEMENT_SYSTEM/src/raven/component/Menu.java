
package raven.component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
//import java.net.URL;
//import javax.swing.ImageIcon;
import javax.swing.JFrame;
import raven.model.Model_Menu;


public class Menu extends javax.swing.JPanel {

   
    public Menu() {
        initComponents();
        setOpaque(false);
        init();
        
        
    }
   private void init(){
       
       
     /*  URL url = getClass().getResource("/icons/1.PNG");
       System.out.println("Url for icon1:"+url);
       ImageIcon icon = null;
       if(url!=null)
       {
         icon = new ImageIcon(url);
       }
       else
       {
        System.out.println("icon not found:");
       }*/
       
      listMenu1.addItem(new Model_Menu("1","Dashboard",Model_Menu.MenuType.MENU));
      listMenu1.addItem(new Model_Menu("2","Computers & Laptops",Model_Menu.MenuType.MENU));
      listMenu1.addItem(new Model_Menu("3","Hardware Register",Model_Menu.MenuType.MENU));
      listMenu1.addItem(new Model_Menu("4","ICT Assets",Model_Menu.MenuType.MENU));
      listMenu1.addItem(new Model_Menu("5","ICT Policy",Model_Menu.MenuType.MENU));
      listMenu1.addItem(new Model_Menu("6","ICT Specifications",Model_Menu.MenuType.MENU));
      listMenu1.addItem(new Model_Menu("7","Software Register",Model_Menu.MenuType.MENU));
      listMenu1.addItem(new Model_Menu("8","User Access",Model_Menu.MenuType.MENU));
      listMenu1.addItem(new Model_Menu("9","Logout",Model_Menu.MenuType.MENU));
      listMenu1.addItem(new Model_Menu("","",Model_Menu.MenuType.EMPTY));
     
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        listMenu1 = new raven.swing.ListMenu<>();

        panelMoving.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ICTDASH.png"))); // NOI18N

        listMenu1.setBackground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
 protected void paintChildren(Graphics grphcs)
 {
      Graphics2D g2=(Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
       GradientPaint g = new GradientPaint(0,0,Color.decode("#6dd5ed"),0,getHeight(),Color.decode("#2193b0"));
       g2.setPaint(g);
        g2.fillRoundRect(0,0,getWidth(),getHeight(),15,15);
        g2.fillRect(getWidth()-20,0, getWidth(), getHeight());
       super.paintChildren(grphcs);
 }
   private int x;
   private int y;
  
 public void initMoving(JFrame fram)
   {
       panelMoving.addMouseListener(new MouseAdapter()
               {
                 @Override
                 public void mousePressed(MouseEvent me){
                      x=me.getX();
                      y=me.getY();
                 }
                  
               });

       panelMoving.addMouseMotionListener(new MouseMotionAdapter(){
           
           @Override
           public void mouseDragged(MouseEvent me){
             fram.setLocation(me.getXOnScreen()-x,me.getYOnScreen()- y);
           }
       

       });
       
       
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private raven.swing.ListMenu<String> listMenu1;
    private javax.swing.JPanel panelMoving;
    // End of variables declaration//GEN-END:variables
}
