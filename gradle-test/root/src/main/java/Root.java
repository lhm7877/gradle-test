import com.google.common.collect.Maps;
import root.ClassA;

/**
 * @author : lhm0805
 * @date : 2018-09-17
 **/
public class Root {
    public static void main(String args[]){
        ClassA classA = new ClassA();
        classA.sayHi();
        classA.sayHitoB();

        System.out.println();

//        Maps.newHashMap();
//        ClassB classB = new ClassB();
//        classB.sayHi();
    }
}
