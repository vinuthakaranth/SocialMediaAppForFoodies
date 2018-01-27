package com.connect.foodies.foodies.utils;

import android.os.Environment;



public class FilePaths {

    //"storage/emulated/0"
    public String ROOT_DIR = Environment.getExternalStorageDirectory().getPath();

    public String PICTURES = ROOT_DIR + "/Pictures";
    public String CAMERA = ROOT_DIR + "/DCIM/Camera";
    public String DOWNLOAD = ROOT_DIR + "/Download";
    public String FIREBASE_IMAGE_STORAGE = "photos/users/";

}
