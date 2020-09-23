public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list=new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        list.add(2,6);
        System.out.println(list.indexOf(4));
        list.clear();
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

    }
}
