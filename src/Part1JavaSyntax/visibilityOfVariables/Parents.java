package Part1JavaSyntax.visibilityOfVariables;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parents {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String Name6 = reader.readLine();
    Cat cat6 = new Cat(Name6);

    String Name5 = reader.readLine();
    Cat cat5 = new Cat(Name5);

    String Name4 = reader.readLine();
    Cat cat4 = new Cat(Name4,null,cat6);

    String Name3 = reader.readLine();
    Cat cat3 = new Cat(Name3,cat5,null);

    String Name2 = reader.readLine();
    Cat cat2 = new Cat(Name2,cat3,cat4);

    String Name1 = reader.readLine();
    Cat cat1 = new Cat(Name1,cat3,cat4);

    System.out.println(cat6);
    System.out.println(cat5);
    System.out.println(cat4);
    System.out.println(cat3);
    System.out.println(cat2);
    System.out.println(cat1);
}

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }

        Cat(String name, Cat parent,Cat father) {
            this.name = name;
            this.parent = parent;
            this.father = father;
        }


        @Override
        public String toString() {
            if (parent == null&father==null)
                return "猫的名字为" + name + ",无母亲,无父亲";
            else if (father==null)
                return "猫的名字为" + name + "," + parent.name + "是母亲,无父亲";
            else if (parent==null)
                return "猫的名字为" + name + ",无母亲 ,"+father.name+"是父亲";
            else
                return "猫的名字为" + name + "," + parent.name + "是母亲 ,"+father.name+"是父亲";
        }
    }
}
//Input:
//祖父泰格
//外祖母普斯
//父亲奥斯卡
//母亲米西
//儿子辛巴
//女儿可可

//Output:
//猫的名字为祖父泰格,无母亲,无父亲
//猫的名字为外祖母普斯,无母亲,无父亲
//猫的名字为父亲奥斯卡,无母亲 ,祖父泰格是父亲
//猫的名字为母亲米西,外祖母普斯是母亲,无父亲
//猫的名字为儿子辛巴,母亲米西是母亲 ,父亲奥斯卡是父亲
//猫的名字为女儿可可,母亲米西是母亲 ,父亲奥斯卡是父亲

