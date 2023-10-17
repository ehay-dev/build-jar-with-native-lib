package dev.ehay.navtive_build;

public class Main {
    public static void main(String[] args) {
        NativeLoader nativeLoader = new NativeLoader();
        nativeLoader.loadLibrary("native_lib-1.0");

        System.out.println("Hello native_lib!");
    }
}