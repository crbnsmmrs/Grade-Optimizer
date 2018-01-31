package grade.optimizer;

import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;

public class MainGUI extends javax.swing.JFrame {

    static MainGUI instance;
    
    List<ClassPanel> panels = new ArrayList<>();
    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
        instance = this;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddAssignmentDialog = new javax.swing.JDialog();
        nameLBL = new javax.swing.JLabel();
        nameJTF = new javax.swing.JTextField();
        pointsLBL = new javax.swing.JLabel();
        pointsJTF = new javax.swing.JTextField();
        copiesLBL = new javax.swing.JLabel();
        copiesSPN = new javax.swing.JSpinner();
        okBTN = new javax.swing.JButton();
        cancelBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AssignmentPanel = new javax.swing.JPanel();
        BottomPanel = new javax.swing.JPanel();
        lowLBL = new javax.swing.JLabel();
        lowScore = new javax.swing.JLabel();
        midLBL = new javax.swing.JLabel();
        midScore = new javax.swing.JLabel();
        highLBL = new javax.swing.JLabel();
        highScore = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMFile = new javax.swing.JMenu();
        JMIOpen = new javax.swing.JMenuItem();
        JMISaveAs = new javax.swing.JMenuItem();
        JMEdit = new javax.swing.JMenu();
        JMIAdd = new javax.swing.JMenuItem();
        JMIDelete = new javax.swing.JMenuItem();

        AddAssignmentDialog.setLocation(new java.awt.Point(100, 100));
        AddAssignmentDialog.setModalityType(null);
        AddAssignmentDialog.setResizable(false);
        AddAssignmentDialog.setSize(new java.awt.Dimension(350, 140));

        nameLBL.setText("Assignment: ");

        pointsLBL.setText("Points:");

        copiesLBL.setText("Copies:");

        copiesSPN.setModel(new javax.swing.SpinnerNumberModel(1, 1, 8, 1));

        okBTN.setText("Ok");
        okBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBTNActionPerformed(evt);
            }
        });

        cancelBTN.setText("Cancel");
        cancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddAssignmentDialogLayout = new javax.swing.GroupLayout(AddAssignmentDialog.getContentPane());
        AddAssignmentDialog.getContentPane().setLayout(AddAssignmentDialogLayout);
        AddAssignmentDialogLayout.setHorizontalGroup(
            AddAssignmentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddAssignmentDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddAssignmentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLBL)
                    .addComponent(pointsLBL))
                .addGap(18, 18, 18)
                .addGroup(AddAssignmentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddAssignmentDialogLayout.createSequentialGroup()
                        .addComponent(pointsJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(copiesLBL)
                        .addGap(18, 18, 18)
                        .addComponent(copiesSPN, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(nameJTF)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddAssignmentDialogLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(okBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBTN)))
                .addContainerGap())
        );
        AddAssignmentDialogLayout.setVerticalGroup(
            AddAssignmentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddAssignmentDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddAssignmentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLBL)
                    .addComponent(nameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddAssignmentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pointsLBL)
                    .addComponent(pointsJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copiesLBL)
                    .addComponent(copiesSPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddAssignmentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBTN)
                    .addComponent(okBTN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        setSize(new java.awt.Dimension(500, 500));

        jScrollPane1.setMinimumSize(new java.awt.Dimension(500, 500));

        AssignmentPanel.setMinimumSize(new java.awt.Dimension(23, 23));
        AssignmentPanel.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(AssignmentPanel);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        lowLBL.setText("70:");

        lowScore.setText("##");

        midLBL.setText("80:");

        midScore.setText("##");

        highLBL.setText("90: ");

        highScore.setText("##");

        javax.swing.GroupLayout BottomPanelLayout = new javax.swing.GroupLayout(BottomPanel);
        BottomPanel.setLayout(BottomPanelLayout);
        BottomPanelLayout.setHorizontalGroup(
            BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BottomPanelLayout.createSequentialGroup()
                .addContainerGap(421, Short.MAX_VALUE)
                .addComponent(lowLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lowScore)
                .addGap(18, 18, 18)
                .addComponent(midLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(midScore)
                .addGap(18, 18, 18)
                .addComponent(highLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(highScore)
                .addContainerGap())
        );
        BottomPanelLayout.setVerticalGroup(
            BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BottomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(highLBL)
                    .addComponent(highScore)
                    .addComponent(midLBL)
                    .addComponent(midScore)
                    .addComponent(lowLBL)
                    .addComponent(lowScore)))
        );

        getContentPane().add(BottomPanel, java.awt.BorderLayout.PAGE_END);

        JMFile.setText("File");

        JMIOpen.setText("Open");
        JMIOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIOpenActionPerformed(evt);
            }
        });
        JMFile.add(JMIOpen);

        JMISaveAs.setText("Save As");
        JMISaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMISaveAsActionPerformed(evt);
            }
        });
        JMFile.add(JMISaveAs);

        jMenuBar1.add(JMFile);

        JMEdit.setText("Edit");

        JMIAdd.setText("Add");
        JMIAdd.setToolTipText("");
        JMIAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIAddActionPerformed(evt);
            }
        });
        JMEdit.add(JMIAdd);

        JMIDelete.setText("Delete");
        JMEdit.add(JMIDelete);

        jMenuBar1.add(JMEdit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMIAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIAddActionPerformed
        // TODO add your handling code here:
        nameJTF.setText("");
        pointsJTF.setText("");
        copiesSPN.setValue(1);
        AddAssignmentDialog.setVisible(true);
    }//GEN-LAST:event_JMIAddActionPerformed

    private void okBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBTNActionPerformed
        // TODO add your handling code here:
        addAssignments(nameJTF.getText(),pointsJTF.getText(),Integer.parseInt(copiesSPN.getValue().toString()));
        AddAssignmentDialog.setVisible(false);
        AddAssignmentDialog.dispose();
    }//GEN-LAST:event_okBTNActionPerformed

    private void cancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTNActionPerformed
        // TODO add your handling code here:
        AddAssignmentDialog.dispose();
    }//GEN-LAST:event_cancelBTNActionPerformed

    private void JMISaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMISaveAsActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser(".");
        BufferedWriter writer = null;
        if(chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                File file = chooser.getSelectedFile();
                if(!file.exists())
                    file.createNewFile();
                writer = new BufferedWriter(new FileWriter(file));
                List<Grades> grades = getGrades();
                for(Grades g: grades){
                    System.out.println("Writing the next assignment: " + g);
                    writer.write(g.toString());
                    writer.newLine();
                }
            }catch(IOException i){i.printStackTrace();}
            finally{try{writer.close();}catch(IOException i){i.printStackTrace();}}
        }
    }//GEN-LAST:event_JMISaveAsActionPerformed

    private void JMIOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIOpenActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser(".");
        BufferedReader reader = null;
        if(chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                reader = new BufferedReader(new FileReader(chooser.getSelectedFile()));
                List<Grades> grades = new ArrayList<Grades>();
                while(reader.ready()){
                    grades.add(new Grades(reader.readLine()));
                }
                for(Grades g: grades){
                    addAssignment(g.getTitle(),g.getPoints(),g.getGrade());
                }
                revalidate();
            }catch(IOException i){i.printStackTrace();}
            finally{try{reader.close();}catch(IOException i){i.printStackTrace();}}
        }
    }//GEN-LAST:event_JMIOpenActionPerformed

    // This is a ping that the grades have changed
    void updateGrades(){
        List<Grades> grades = getGrades();
        lowScore.setText(Integer.toString(projectedGrade(grades, 70)));
        midScore.setText(Integer.toString(projectedGrade(grades, 80)));
        highScore.setText(Integer.toString(projectedGrade(grades, 90)));
    }
    
    int projectedGrade(List<Grades> grades, int mark){
        for(int i=100; i>0; i--){
            float max = 0, value = 0;
            for(Grades g: grades){
                max += g.max();
                value += g.value(i);
            }
            if((value/max)*100 < mark)
                return i+1;
        }
        return 0;
    }
    
    void addAssignments(String name, String points, int count){
        for(int i=0; i<count; i++)
            addAssignment(name,Float.parseFloat(points),-1);
        revalidate();
    }
    
    void addAssignment(String name, float points, int grade){
        ClassPanel tempPanel = new ClassPanel(name,points,grade);
        if(tempPanel.updateScore());
            updateGrades();
        AssignmentPanel.add(tempPanel);
    }
    
    List<Grades> getGrades(){
        List<Grades> grades = new ArrayList<>();
        for(java.awt.Component c: AssignmentPanel.getComponents())
            if(c instanceof ClassPanel){
                ClassPanel temp = (ClassPanel)c;
                grades.add(new Grades(temp.points,temp.getGrade(),temp.title));
            }
        return grades;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AddAssignmentDialog;
    private javax.swing.JPanel AssignmentPanel;
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JMenu JMEdit;
    private javax.swing.JMenu JMFile;
    private javax.swing.JMenuItem JMIAdd;
    private javax.swing.JMenuItem JMIDelete;
    private javax.swing.JMenuItem JMIOpen;
    private javax.swing.JMenuItem JMISaveAs;
    private javax.swing.JButton cancelBTN;
    private javax.swing.JLabel copiesLBL;
    private javax.swing.JSpinner copiesSPN;
    private javax.swing.JLabel highLBL;
    private javax.swing.JLabel highScore;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lowLBL;
    private javax.swing.JLabel lowScore;
    private javax.swing.JLabel midLBL;
    private javax.swing.JLabel midScore;
    private javax.swing.JTextField nameJTF;
    private javax.swing.JLabel nameLBL;
    private javax.swing.JButton okBTN;
    private javax.swing.JTextField pointsJTF;
    private javax.swing.JLabel pointsLBL;
    // End of variables declaration//GEN-END:variables

    private class Grades{
        private final String title;
        private final float pointValue;
        private final float pointGiven;
        private final float grade;
        
        public Grades(float points, int grade){
            this(points,grade,"");
        }
        
        public Grades(float points, int grade, String name){
            pointValue = points;
            this.grade = (float)grade / 100;
            pointGiven = pointValue * this.grade;
            this.title = name;
        }
        
        public Grades(String str){
            String[] strArray = str.split(";");
            title = strArray[0];
            pointValue = Float.parseFloat(strArray[1]);
            grade = Float.parseFloat(strArray[2]);
            pointGiven = pointValue * this.grade;
        }
        
        float value(int grade){
            if(this.grade >= 0)
                return pointGiven;
            else
                return pointValue * ((float)grade / 100);
        }
        
        float max(){
            return pointValue;
        }
        
        public String toString(){
            return title + ";" + pointValue + ";" + grade;
        }
        
        public String getTitle(){return title;}
        public float getPoints(){return pointValue;}
        public int getGrade(){return (grade<0?-1:(int)grade);}
    }
}
