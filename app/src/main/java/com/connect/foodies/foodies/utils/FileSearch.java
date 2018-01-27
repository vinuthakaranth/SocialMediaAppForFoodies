package com.connect.foodies.foodies.utils;

import android.support.annotation.Nullable;
import android.util.Log;

import java.io.File;
import java.util.ArrayList;



public class FileSearch {

    private static final String TAG = "FileSearch";
    /**
     * Search a directory and return a list of all **directories** contained inside
     * @param directory
     * @return
     */
    public static ArrayList<String> getDirectoryPaths(String directory){
        ArrayList<String> pathArray = new ArrayList<>();
        File file = new File(directory);
        File[] listfiles = file.listFiles();
        for(int i = 0; i < listfiles.length; i++){
            if(listfiles[i].isDirectory()){
                pathArray.add(listfiles[i].getAbsolutePath());
            }
        }
        return pathArray;
    }

    /**
     * Search a directory and return a list of all **files** contained inside
     * @param directory
     * @return
     */
    @Nullable
    public static ArrayList<String> getFilePaths(String directory){
        ArrayList<String> pathArray = new ArrayList<>();
        File file = new File(directory);
        File[] listfiles = file.listFiles();

        if(listfiles != null)
        {
            for (int i = 0; i < listfiles.length; i++) {
                if (listfiles[i].isFile()) {
                    Log.d(TAG, "getFilePaths: "+listfiles[i].getAbsolutePath());
                    String filepath = listfiles[i].getAbsolutePath();
                    String subs = filepath.substring(filepath.length()-4,filepath.length());
                    if(subs.equals("jpeg") || subs.equals(".jpg") || subs.equals(".png") )
                        pathArray.add(listfiles[i].getAbsolutePath());
                    else
                    {
                        Log.d(TAG, "getFilePaths: Not a jpeg found");
                    }
                }
            }
        }
        else
        {
            Log.d(TAG, "getFilePaths: No Images Present");
            return null;
        }
        return pathArray;
    }
}
