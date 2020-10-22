package com.mycompany.matriz;



import java.awt.Color;
import java.util.Random;

public class MatrixFilter extends javax.swing.JFrame {
    
    private int[][] matrix = new int[10][10];

    public MatrixFilter() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        
        resetMatrix();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filterSlider = new javax.swing.JSlider();
        appNameLabel = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();
        Info = new javax.swing.JLabel();
        textAreaPane = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        Help = new javax.swing.JButton();
        minField = new javax.swing.JTextField();
        maxField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setMinimumSize(new java.awt.Dimension(420, 0));

        filterSlider.setBackground(new java.awt.Color(199, 163, 199));
        filterSlider.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        filterSlider.setMajorTickSpacing(10);
        filterSlider.setMinorTickSpacing(5);
        filterSlider.setValue(0);
        filterSlider.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.green, null, null));
        filterSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                filterSliderStateChanged(evt);
            }
        });

        appNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        appNameLabel.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        appNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appNameLabel.setText("Filtrado de una Matriz Cuadrada");

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        Info.setBackground(new java.awt.Color(255, 255, 255));
        Info.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Info.setText("Info");

        textArea.setEditable(false);
        textArea.setBackground(new java.awt.Color(204, 255, 204));
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Noto Mono", 0, 14)); // NOI18N
        textArea.setRows(10);
        textArea.setBorder(null);
        textAreaPane.setViewportView(textArea);

        Help.setText("Help");
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });

        minField.setBackground(new java.awt.Color(128, 255, 0));
        minField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        minField.setText("0");
        minField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minFieldActionPerformed(evt);
            }
        });

        maxField.setBackground(new java.awt.Color(255, 0, 0));
        maxField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maxField.setText("100");
        maxField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Javier Santana Álamo - Alberto Corredera Romero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Help)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145)
                .addComponent(textAreaPane, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(minField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(filterSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(maxField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(appNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Help))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(textAreaPane, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(filterSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(minField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        appNameLabel.getAccessibleContext().setAccessibleName("Filtrado de una Matriz Cuadrada");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minFieldActionPerformed(java.awt.event.ActionEvent evt) {
        if(updateFromMinimalField() && updateFromMaximalField())
            resetMatrix();
    }
     
    private void filterSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_filterSliderStateChanged
        setInfo();
        modificaMatriz();
    }//GEN-LAST:event_filterSliderStateChanged

    private void maxFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxFieldActionPerformed
       if (updateFromMaximalField() && updateFromMinimalField()) 
           resetMatrix();
    }//GEN-LAST:event_maxFieldActionPerformed

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        Info.setText("Matriz inicializada con valores entre 0-100 de base, introducir valores deseados y pulsar enter ");
    }//GEN-LAST:event_HelpActionPerformed

    private Boolean updateFromMinimalField() {
        try {
            int min = Integer.parseInt(minField.getText());
            if (min >= filterSlider.getMaximum()) {
                Info.setText("El mínimo debe ser menor que el máximo");
                return false;
            }
            
            filterSlider.setMinimum(min);
            return true;
            
        }catch(NumberFormatException e) {
            Info.setText("Introcude un número válido como valor mínimo");
            return false;
        }
    }
    
    private Boolean updateFromMaximalField() {
         try {
            int max = Integer.parseInt(maxField.getText());
            if (max <= filterSlider.getMinimum()) {
                Info.setText("El máximo debe ser mayor que el mínimo");
                return false;
            }
            
            filterSlider.setMaximum(max);
            return true;
            
         }catch(NumberFormatException e) {
            Info.setText("Introcude un número como valor máximo");
            return false;
        }
    }
    
    private void resetMatrix() {
        deslizante();
        setInfo();
        creaMatriz();
        modificaMatriz();
    }
    
    private void deslizante() {
        int range = filterSlider.getMaximum() - filterSlider.getMinimum() + 1;
        
        filterSlider.setValue(filterSlider.getMinimum());
    }
    private void setInfo() {
        Info.setText("Quitando los valores menores que " + filterSlider.getValue());
    }
    private void creaMatriz() {
        Random rand = new Random();
        int range = filterSlider.getMaximum() - filterSlider.getMinimum() + 1;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = filterSlider.getMinimum() + rand.nextInt(range);
            }
        }
    }
    private void modificaMatriz() {
        String numberOfSpaces = 
            Integer.toString(
                Math.max(
                    Integer.toString(filterSlider.getMaximum()).length(),
                    Integer.toString(filterSlider.getMinimum()).length()
                )
            );
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < filterSlider.getValue()) sb.append(String.format("%" + numberOfSpaces + "s", "-"));
                else sb.append(String.format("%" + numberOfSpaces + "s", matrix[i][j]));
                sb.append(" ");
            }
            
            sb.append("\n");
        }
        
        textArea.setText(sb.toString());
    }
    
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
            java.util.logging.Logger.getLogger(MatrixFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatrixFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatrixFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatrixFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatrixFilter().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Help;
    private javax.swing.JLabel Info;
    private javax.swing.JLabel appNameLabel;
    private javax.swing.JSlider filterSlider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JTextField maxField;
    private javax.swing.JTextField minField;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JTextArea textArea;
    private javax.swing.JScrollPane textAreaPane;
    // End of variables declaration//GEN-END:variables
}
