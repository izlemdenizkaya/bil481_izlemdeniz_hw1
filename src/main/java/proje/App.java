/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package proje;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }

    public static boolean hasMean(ArrayList<Integer> array,Integer i1,Integer i2,Integer i3){

        if(array==null || i1==null || i2==null || i3==null)
            return false;
        
        int mean=(i1+i2+i3)/3;

        for(Integer e:array)
            if(e==mean)
                return true;

        return false;

    }
}
