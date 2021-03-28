/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.trixon.pendingtask2;

import org.netbeans.api.progress.ProgressHandle;
import org.openide.windows.OnShowing;

/**
 *
 * @author Patrik Karlström
 */
@OnShowing
public class PendingTask implements Runnable {

    @Override
    public void run() {
        var progressHandle = ProgressHandle.createHandle("BLOCK IT!");

        progressHandle.start();
        progressHandle.switchToIndeterminate();
    }

}
