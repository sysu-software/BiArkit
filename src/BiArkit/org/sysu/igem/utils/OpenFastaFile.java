/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sysu.igem.utils;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author hewei
 */
public class OpenFastaFile extends FileFilter {

    private String ends = null;
    private String description = null;

    public OpenFastaFile(String ends, String description) {
        
        this.ends = ends;
        this.description = description;
    }

    @Override
    public boolean accept(File file) {
        if (file.isDirectory()) {
            return true;
        }
        String fileName = file.getName();
        if (fileName.toUpperCase().endsWith(ends.toUpperCase())) {
            return true;
        }
        return false;
    }

    @Override
    public String getDescription() {
        return ".fasta";
    }

    public String getEnds() {
        return ".fasta";
    }

//    public void showSaveDataDialog() throws IOException {
//        JFileChooser jfc = new JFileChooser();
//        jfc.setCurrentDirectory(new File(HistoryFile.getPathFromHistoryFile("history.txt")));
//        jfc.addChoosableFileFilter(new SaveAndOpenFileDialog("*.fasta", null));
//        int ret = jfc.showSaveDialog(null);
//        if (ret == JFileChooser.APPROVE_OPTION) {
//            String filePath = jfc.getSelectedFile().getPath();//            
//            System.out.println(jfc.getFileFilter().getDescription()); // ***
//        }
//    }

    public String showOpenDataDialog() throws IOException {
        JFileChooser jfc = new JFileChooser();
        jfc.setCurrentDirectory(new File(HistoryFile.getPathFromHistoryFile("history.txt")));
        jfc.addChoosableFileFilter(new SaveAndOpenFileDialog(".fasta", null));
        //  jfc.getChoosableFileFilters();
        int ret = jfc.showOpenDialog(null);
        jfc.setVisible(true);
        String filePath = "";
        if (ret == JFileChooser.APPROVE_OPTION) {
            try {
                filePath = jfc.getSelectedFile().getCanonicalPath();
                HistoryFile.setPathToHistoryFile(jfc.getSelectedFile().getParent(), "history.txt");                
                System.out.println(filePath);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        return filePath;
    }
}
