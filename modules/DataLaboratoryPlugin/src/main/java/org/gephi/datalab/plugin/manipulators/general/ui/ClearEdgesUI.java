/*
Copyright 2008-2010 Gephi
Authors : Eduardo Ramos <eduramiba@gmail.com>
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

package org.gephi.datalab.plugin.manipulators.general.ui;

import javax.swing.JPanel;
import org.gephi.datalab.plugin.manipulators.general.ClearEdges;
import org.gephi.datalab.spi.DialogControls;
import org.gephi.datalab.spi.Manipulator;
import org.gephi.datalab.spi.ManipulatorUI;
import org.openide.util.NbPreferences;

/**
 * UI for ClearEdges GeneralActionsManipulator
 *
 * @author Eduardo Ramos
 */
public class ClearEdgesUI extends javax.swing.JPanel implements ManipulatorUI {
    ClearEdges manipulator;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox deleteDirectedCheckbox;
    private javax.swing.JCheckBox deleteUndirectedChekbox;
    private javax.swing.JLabel descriptionLabel;

    /**
     * Creates new form ClearEdgesUI
     */
    public ClearEdgesUI() {
        initComponents();
    }

    @Override
    public void setup(Manipulator m, DialogControls dialogControls) {
        manipulator = (ClearEdges) m;
        deleteDirectedCheckbox.setSelected(manipulator.isDeleteDirected());
        deleteUndirectedChekbox.setSelected(manipulator.isDeleteUndirected());
    }

    @Override
    public void unSetup() {
        manipulator.setDeleteDirected(deleteDirectedCheckbox.isSelected());
        manipulator.setDeleteUndirected(deleteUndirectedChekbox.isSelected());
        NbPreferences.forModule(ClearEdges.class)
            .putBoolean(ClearEdges.DELETE_DIRECTED_SAVED_PREFERENCES, deleteDirectedCheckbox.isSelected());
        NbPreferences.forModule(ClearEdges.class)
            .putBoolean(ClearEdges.DELETE_UNDIRECTED_SAVED_PREFERENCES, deleteUndirectedChekbox.isSelected());
    }

    @Override
    public String getDisplayName() {
        return manipulator.getName();
    }

    @Override
    public JPanel getSettingsPanel() {
        return this;
    }

    @Override
    public boolean isModal() {
        return true;
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleteDirectedCheckbox = new javax.swing.JCheckBox();
        deleteUndirectedChekbox = new javax.swing.JCheckBox();
        descriptionLabel = new javax.swing.JLabel();

        deleteDirectedCheckbox.setText(org.openide.util.NbBundle
            .getMessage(ClearEdgesUI.class, "ClearEdgesUI.deleteDirectedCheckbox.text")); // NOI18N

        deleteUndirectedChekbox.setText(org.openide.util.NbBundle
            .getMessage(ClearEdgesUI.class, "ClearEdgesUI.deleteUndirectedChekbox.text")); // NOI18N

        descriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descriptionLabel.setText(
            org.openide.util.NbBundle.getMessage(ClearEdgesUI.class, "ClearEdgesUI.descriptionLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(deleteDirectedCheckbox)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deleteUndirectedChekbox))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(descriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(descriptionLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteUndirectedChekbox)
                        .addComponent(deleteDirectedCheckbox))
                    .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // End of variables declaration//GEN-END:variables
}
