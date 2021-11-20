/*
 Copyright 2008-2010 Gephi
 Authors : Mathieu Bastian <mathieu.bastian@gephi.org>
 Website : http://www.gephi.org

 This file is part of Gephi.

 DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.

 Copyright 2011 Gephi Consortium. All rights reserved.

 The contents of this file are subject to the terms of either the GNU
 General Public License Version 3 only ("GPL") or the Common
 Development and Distribution License("CDDL") (collectively, the
 "License"). You may not use this file except in compliance with the
 License. You can obtain a copy of the License at
 http://gephi.org/about/legal/license-notice/
 or /cddl-1.0.txt and /gpl-3.0.txt. See the License for the
 specific language governing permissions and limitations under the
 License.  When distributing the software, include this License Header
 Notice in each file and include the License files at
 /cddl-1.0.txt and /gpl-3.0.txt. If applicable, add the following below the
 License Header, with the fields enclosed by brackets [] replaced by
 your own identifying information:
 "Portions Copyrighted [year] [name of copyright owner]"

 If you wish your version of this file to be governed by only the CDDL
 or only the GPL Version 3, indicate your decision by adding
 "[Contributor] elects to include this software in this distribution
 under the [CDDL or GPL Version 3] license." If you do not indicate a
 single choice of license, a recipient has the option to distribute
 your version of this file under either the CDDL, the GPL Version 3 or
 to extend the choice of license to its licensees as provided above.
 However, if you add GPL Version 3 code and therefore, elected the GPL
 Version 3 license, then the option applies only if the new code is
 made subject to such option by the copyright holder.

 Contributor(s):

 Portions Copyrighted 2011 Gephi Consortium.
 */

package org.gephi.ui.tools.plugin;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import org.gephi.ui.components.JColorButton;
import org.openide.util.NbBundle;

/**
 * @author Mathieu Bastian
 */
public class EdgePencilPanel extends javax.swing.JPanel {

    public boolean isDirected;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton colorButton;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelType;
    private javax.swing.JLabel labelWeight;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JComboBox typeComboBox;
    private javax.swing.JSpinner weightSpinner;

    /**
     * Creates new form EdgePencilPanel
     */
    public EdgePencilPanel() {
        isDirected = true;
        initComponents();
        typeComboBox.setModel(new DefaultComboBoxModel(new String[] {
            NbBundle.getMessage(EdgePencilPanel.class, "EdgePencilPanel.type.directed"),
            NbBundle.getMessage(EdgePencilPanel.class, "EdgePencilPanel.type.undirected")
        }));
    }

    public void setStatus(String status) {
        statusLabel.setText(status);
    }

    public Color getColor() {
        return ((JColorButton) colorButton).getColor();
    }

    public void setColor(Color color) {
        ((JColorButton) colorButton).setColor(color);
    }

    public float getWeight() {
        return (Float) weightSpinner.getModel().getValue();
    }

    public void setWeight(float weight) {
        weightSpinner.getModel().setValue(new Float(weight));
    }

    public void setType(boolean directed) {
        if (directed) {
            typeComboBox.setSelectedIndex(0);
        } else {
            typeComboBox.setSelectedIndex(1);
        }
    }

    public void enableTypeCombo(boolean enabled) {
        typeComboBox.setEnabled(enabled);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statusLabel = new javax.swing.JLabel();
        weightSpinner = new javax.swing.JSpinner();
        labelWeight = new javax.swing.JLabel();
        colorButton = new JColorButton(Color.BLACK);
        labelColor = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox();
        labelType = new javax.swing.JLabel();

        statusLabel.setFont(statusLabel.getFont().deriveFont((float) 10));
        statusLabel.setText(
            org.openide.util.NbBundle.getMessage(EdgePencilPanel.class, "EdgePencilPanel.statusLabel.text")); // NOI18N

        weightSpinner.setFont(weightSpinner.getFont().deriveFont((float) 10));
        weightSpinner.setModel(
            new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(0.0f), null, Float.valueOf(0.1f)));

        labelWeight.setFont(labelWeight.getFont().deriveFont((float) 10));
        labelWeight.setText(
            org.openide.util.NbBundle.getMessage(EdgePencilPanel.class, "EdgePencilPanel.labelWeight.text")); // NOI18N

        colorButton.setText(
            org.openide.util.NbBundle.getMessage(EdgePencilPanel.class, "EdgePencilPanel.colorButton.text")); // NOI18N
        colorButton.setContentAreaFilled(false);

        labelColor.setFont(labelColor.getFont().deriveFont((float) 10));
        labelColor.setText(
            org.openide.util.NbBundle.getMessage(EdgePencilPanel.class, "EdgePencilPanel.labelColor.text")); // NOI18N

        typeComboBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboBoxActionPerformed(evt);
            }
        });

        labelType.setText(
            org.openide.util.NbBundle.getMessage(EdgePencilPanel.class, "EdgePencilPanel.labelType.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(statusLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                    .addComponent(labelType)
                    .addGap(6, 6, 6)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(labelColor)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(colorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(labelWeight)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(weightSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightSpinner, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelColor, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelType, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void typeComboBoxActionPerformed(
        java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboBoxActionPerformed
        if (typeComboBox.getSelectedIndex() == 0) {
            isDirected = true;
        } else {
            isDirected = false;
        }
    }//GEN-LAST:event_typeComboBoxActionPerformed
    // End of variables declaration//GEN-END:variables
}
