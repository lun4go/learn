package singleton;


import java.io.*;

public class LazySingletonTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //多线程测试是否有线程安全问题
        new Thread(() -> {
            LazySingleton instants = LazySingleton.getInstants();
            System.err.println(instants);
        }).run();
        new Thread(() -> {
            LazySingleton instants = LazySingleton.getInstants();
            System.err.println(instants);
        }).run();


        LazySingleton instants = LazySingleton.getInstants();
        //写入
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("序列化测试"));
//        oos.writeObject(instants);

        //做反序列化测试返回是否为同一个对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("序列化测试"));
        Object o = ois.readObject();
        LazySingleton o1 = (LazySingleton) o;
        System.out.println(o1 ==instants);


    }
}