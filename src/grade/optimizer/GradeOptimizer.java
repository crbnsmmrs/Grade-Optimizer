/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.optimizer;

/**
 *
 * @author User
 */
public class GradeOptimizer {
    
    public GradeOptimizer(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Start it all up
        GradeOptimizer start = new GradeOptimizer();
    }
    
}
