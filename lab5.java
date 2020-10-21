import java.util.*;

class lab5{
    public static void main(String[] args){
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(-1);
        list1.add(-2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(-9);
        list1.add(-10);
        list1.add(11);
        list1.add(-12);
        //Task 1
        System.out.println("Task 1");
        list1.forEach(num -> System.out.print(num + " "));
        System.out.println();
        Integer key = 3;
        if(list1.contains(key)){
            int index = list1.indexOf(key);
            swap(list1, index+1, index+2);
            list1.remove(index);
        }
        list1.forEach(num -> System.out.print(num + " "));
        System.out.println();

        //Task 2
        System.out.println("Task 2");

        list1.forEach(num -> System.out.print(num + " "));
        System.out.println();
        for(ListIterator<Integer> iter = list1.listIterator(); iter.hasNext(); ){
            if(iter.next() < 0){
                iter.add(0);
            }
        }
        list1.forEach(num -> System.out.print(num + " "));
        System.out.println();

        //Task 3
        System.out.println("Task 3");
        key = 6;
        for(Iterator<Integer> iter = list1.iterator(); iter.hasNext(); ){
            System.out.print(iter.next() + " ");
        }
        System.out.println();
        for(Iterator<Integer> iter = list1.descendingIterator(); iter.hasNext(); ){
            System.out.print(iter.next() + " ");
        }
        System.out.println("\n");

        for(Iterator<Integer> iter = list1.descendingIterator(); iter.hasNext(); ){
            if(iter.next() == key)
                iter.remove();
        }
        list1.forEach(num -> System.out.print(num + " "));
        System.out.println();

        //Task 4
        System.out.println("Task 4");
        LinkedList<String> string_list = new LinkedList<>();
        String str = "Hellono no world no no";
        String[] words = str.split("[ .,!?]");
        for(String word : words)
            string_list.add(word);
        System.out.println(str);
        for(ListIterator<String> iter = string_list.listIterator(); iter.hasNext(); ){
            if(iter.next().equals("no")){
                iter.add("1");
            }
        }
        words = string_list.toArray(words);
        str = "";
        for(String word : words){
            str += word + " ";
        }
        System.out.println("\n" + str);


    }

    public static <Type> void swap(LinkedList<Type> list, Integer i1, Integer i2){
        if(i1 < 0 || i1 >= list.size() || i2 < 0 || i2 >= list.size())
            return;
        Type temp = list.get(i1);
        list.set(i1, list.get(i2));
        list.set(i2, temp);
    }
}