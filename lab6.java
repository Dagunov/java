import java.util.*;

class lab6{
    public static void main(String [] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println("Stack: ");
        for(int i = 1; i <= 10; i++)
            System.out.print(i + " ");
        ArrayList<Integer> parni = new ArrayList<>();
        ArrayList<Integer> neparni = new ArrayList<>();
        while(!stack.empty()){
            Integer num = stack.pop();
            if(num % 2 == 0)
                parni.add(num);
            else
                neparni.add(num);
        }
        System.out.println("\nAll even elements:");
        parni.forEach(num -> System.out.print(num + " "));
        System.out.println("\nSum of odd elements:");
        Integer sum = 0;
        for(Integer num : neparni)
            sum += num;
        System.out.println(sum);


    }
}