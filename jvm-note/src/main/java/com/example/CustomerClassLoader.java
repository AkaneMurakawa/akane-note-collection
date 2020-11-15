package com.example;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 自定义类加载器
 */
public class CustomerClassLoader extends ClassLoader{

    public CustomerClassLoader() {
    }

    /**
     * 自定义父类
     * @param parent
     */
    public CustomerClassLoader(ClassLoader parent) {
        super(parent);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        File f = new File("D:\\project\\akane-note-collection\\jvm-note\\src\\main\\java\\", name.replace(".", "/").concat(".class"));
        FileInputStream fis = null;
        ByteArrayOutputStream baos = null;
        try {
            fis = new FileInputStream(f);
            baos = new ByteArrayOutputStream();
            int b = 0;

            while ((b=fis.read()) != 0){
                baos.write(b);
            }
            byte[] bytes = baos.toByteArray();
            return defineClass(name, bytes, 0, bytes.length);
        }catch (Exception e){
        }finally {
            if (baos != null){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return super.findClass(name);
    }

//    @Override
//    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
//        return super.loadClass(name, resolve);
//    }

    public static void main(String[] args) throws Exception{
        CustomerClassLoader classLoader = new CustomerClassLoader();
        Class<?> loadClass = classLoader.loadClass("com.example.Hello");
        Hello instance = (Hello)loadClass.newInstance();
        instance.say();

        System.out.println(classLoader.getClass().getClassLoader());
        System.out.println(classLoader.getParent());
    }
}
