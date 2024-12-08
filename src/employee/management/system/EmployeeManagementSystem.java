/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee.management.system;

/**
 * 
 *
 * @author ADMIN
 */
public class EmployeeManagementSystem {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Splash ss = new Splash();
        ss.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                ss.perc.setText(Integer.toString(i)+"%");
                Home hh = new Home();
                if (i == 100) {
                    ss.dispose();
                    hh.show();
                }
                
            }
        } catch (Exception e) {
        }
    }
    
}
