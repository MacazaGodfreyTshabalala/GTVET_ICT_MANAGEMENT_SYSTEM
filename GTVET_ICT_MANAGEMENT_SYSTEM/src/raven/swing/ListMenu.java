
package raven.swing;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import raven.model.Model_Menu;


public class ListMenu<E extends Object> extends JList<E>{

    private static final long serialVersionUID = 1L;
    
    private final DefaultListModel model;
    private Object data;
    
    @SuppressWarnings("unchecked")
    public ListMenu(){
        model= new DefaultListModel();
        setModel(model);
        
    }
   
    public ListCellRenderer<? super E> getCellRender(){
      return new DefaultListCellRenderer(){
          
          @Override
          public Component getListCellRendererComponent(JList<?> jList,Object o,int i,boolean bln,boolean bln1){
            Model_Menu data;
            
            if(o instanceof Model_Menu){
                data=new Model_Menu("",o+"",Model_Menu.MenuType.EMPTY);
            }
            else{
                data=(Model_Menu) o;
            }
            MenuItem item =new MenuItem(data);
            return item;
             
                
          }
         
          
      };
    }

    private static class DefaulListModel {

        public DefaulListModel() {
        }
    }
    
    @SuppressWarnings("unchecked")
    public void addItem(Model_Menu dat){
      model.addElement(data);
    }
}
