// LogixLoadAction.java
package jmri.jmrit;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import jmri.InstanceManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provide an action to allow Logixs to be loaded disabled when panel file is
 * loaded
 *
 * @author	Dave Duchamp Copyright (C) 2007
 * @version	$Revision$
 */
public class LogixLoadAction extends AbstractAction {

    /**
     *
     */
    private static final long serialVersionUID = -4280773749053470400L;

    public LogixLoadAction(String s, JPanel who) {
        super(s);
        _who = who;
    }

    JPanel _who;

    public void actionPerformed(ActionEvent e) {
        // Set option to force Logixs to be loaded disabled

        Object[] options = {"Disable",
            "Enable"};

        int retval = JOptionPane.showOptionDialog(_who, Bundle.getMessage("LogixDisabledMessage"), Bundle.getMessage("DebugOption"),
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (retval != 0) {
            InstanceManager.logixManagerInstance().setLoadDisabled(false);
            log.info("Requested load Logixs enabled via Debug menu.");
        } else {
            InstanceManager.logixManagerInstance().setLoadDisabled(true);
            log.info("Requested load Logixs diabled via Debug menu.");
        }

    }

    // initialize logging
    private final static Logger log = LoggerFactory.getLogger(LogixLoadAction.class.getName());
}
