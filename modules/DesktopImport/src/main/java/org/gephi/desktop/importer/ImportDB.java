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

package org.gephi.desktop.importer;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import org.gephi.desktop.importer.api.ImportControllerUI;
import org.gephi.io.importer.spi.DatabaseImporterBuilder;
import org.gephi.io.importer.spi.ImporterUI;
import org.openide.util.HelpCtx;
import org.openide.util.Lookup;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;

/**
 * @author Mathieu
 */
public class ImportDB extends CallableSystemAction {

    @Override
    public void performAction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getName() {
        return "importDB";
    }

    @Override
    public HelpCtx getHelpCtx() {
        return null;
    }

    @Override
    public JMenuItem getMenuPresenter() {
        JMenu menu = new JMenu(NbBundle.getMessage(ImportDB.class, "CTL_ImportDB"));

        final ImportControllerUI importController = Lookup.getDefault().lookup(ImportControllerUI.class);
        if (importController != null) {
            for (final DatabaseImporterBuilder dbb : Lookup.getDefault().lookupAll(DatabaseImporterBuilder.class)) {
                ImporterUI ui = importController.getImportController().getUI(dbb.buildImporter());
                String menuName = dbb.getName();
                if (ui != null) {
                    menuName = ui.getDisplayName();
                }
                JMenuItem menuItem = new JMenuItem(new AbstractAction(menuName) {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        importController.importDatabase(dbb.buildImporter());
                    }
                });
                menu.add(menuItem);
            }
        }
        return menu;
    }
}
