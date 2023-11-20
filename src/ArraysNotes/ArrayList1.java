package ArraysNotes;

import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("cat");
        list.add("dog");
        list.add("bird");
        list.add("mouse");
        list.add("elephant");
        
        list.add(2, "fish");
        list.set(4, "pig");
        
        //returns mouse
        //list.remove(1);
        
        System.out.println(list.set(1, "mouse"));
        for (int i = 0; i<list.size();i++) {
            System.out.println(list.get(i));
        }
        //list.get 
        
        PEStudents ian = new PEStudents("Ian", 215);
        PEStudents desmond = new PEStudents("Desmond", 100);
        PEStudents connor = new PEStudents("Connor", 185);
        PEStudents jack = new PEStudents("Jack", 155);
        PEStudents weakling = new PEStudents("EdwardG", 0);
        
        ArrayList<PEStudents> pelist = new ArrayList<PEStudents>();
        pelist.add(ian);
        pelist.add(desmond);
        pelist.add(connor);
        pelist.add(jack);
        pelist.add(weakling);
        
        int sum = 0;
        for (int i =0; i<pelist.size();i++) {
            sum += pelist.get(i).getBenchPress();
        }
        
        double avg = (double)sum/pelist.size();
        System.out.println("Average is " + avg);
        
        boolean found = false;
        String search = "Ian";
        int index = 0;
        for (int i =0; i<pelist.size();i++) {
            if (search.equals(pelist.get(i).getName())) {
            found = true;
            index = i;
            }
        }
        
        if (found) System.out.println(pelist.get(index).getName() + " benches " + pelist.get(index).getBenchPress());
        else System.out.println("Not found.");
        
        int sum2 = 0;
        for (int i = 0; i<pelist.size();i++) {
//            pelist.get(i).addFive();
            sum2 += pelist.get(i).getBenchPress();
        }
        System.out.println(sum2);

    }

}