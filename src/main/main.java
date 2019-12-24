package main;

import beans.User;
import org.apache.commons.collections.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("xiaoming", 23));
        list.add(new User("xxiaohong", 43));
        list.add(new User("xiaojiang", 12));
        list.add(new User("xiaoluo", 20));
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int age1 = o1.getAge();
                int age2 = o2.getAge();
                if (age1 == age2) {
                    return 0;
                }
                //从小到大排序
                return age1 > age2 ? 1 : -1;
            }
        });
        System.out.println(list);
        ArrayList<User> list2 = new ArrayList<>();
//        CollectionUtils.addAll(list2,new Object[list.size()]);
//        Collections.copy(list2,list);
        for (int i = 0; i < list.size(); ++i) {
            list2.add(new User(list.get(i).getName(), list.get(i).getAge()));
        }
        list.get(2).setAge(10);
        System.out.println(list);
        System.out.println(list2);

        //todo list深度拷贝
        List<Integer> arrayList = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            arrayList.add(j);
        }
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            newList.add(i + 100);
        }
        CollectionUtils.addAll(newList, new Object[arrayList.size()]);
        Collections.copy(newList, arrayList);
        newList.set(0, 10);
        System.out.println("原list值：" + arrayList);
        System.out.println("新list值：" + newList);

        //todo 深拷贝
        List<Integer> arrayList1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arrayList1.add(i);
        }
        List<Integer> newList1 = new ArrayList<Integer>();
        for (int i = 0; i < 15; i++) {
            newList1.add(i + 100);
        }
        System.out.println("---1---newList.size()=" + newList1.size());
        System.out.println("---1---newList值：" + newList1);
        //Collections.copy是覆盖替换，不是追加新增
        Collections.copy(newList1, arrayList1);
        System.out.println("---2---newList.size()=" + newList1.size());
        System.out.println("---2---newList值：" + newList1);
        newList1.set(0, 10);
        System.out.println("原list值：" + arrayList1);
        System.out.println("新list值：" + newList1);
    }


}
