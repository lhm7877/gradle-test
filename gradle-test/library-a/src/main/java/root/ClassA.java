package root;

import com.google.common.collect.Maps;

import java.util.HashMap;

/**
 * @author : lhm0805
 * @date : 2018-09-17
 **/
public class ClassA {
    public void sayHi(){
        System.out.println(this.toString() + " HI!");
    }
    public void sayHitoB(){
        ClassB b = new ClassB();
        b.sayHi();
    }

    public void guavaTest(){
        HashMap<String, Integer> hashMap = Maps.newHashMap();
        hashMap.put("key", 0);
        System.out.println(hashMap.get("key"));
    }
}
