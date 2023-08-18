//how garbage collector works in case of weak hash map
//garbage collector can work in weak hash map 
//it deletes unreferenced objects

import java.util.*;

class Demo{
        String str;
        Demo(String str){
                this.str=str;
        }
        public String toString(){
                return str;
        }
        public void finalize(){
                System.out.println("Notify");
        }
}

class GarbageCollectorInWeakHashMapDemo{
        public static void main(String [] args){
                Demo obj1 = new Demo("Core2Web");
                Demo obj2 = new Demo("Biencaps");
                Demo obj3 = new Demo("Incubator");
                System.out.println(obj1);
                System.out.println(obj2);
                System.out.println(obj3);
                System.out.println("-------------");
                WeakHashMap hm = new WeakHashMap();
                hm.put(obj1,2016);
                hm.put(obj2,2019);
                hm.put(obj3,2023);
                obj1=null;
                System.gc();
                System.out.println("In main");
        }
}

