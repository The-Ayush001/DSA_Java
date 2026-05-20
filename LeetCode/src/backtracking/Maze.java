package backtracking;

import java.util.ArrayList;
import java.util.Collection;

public class Maze {
    static void main() {
        System.out.println(count(3,3));
        path("",3,3);
        System.out.println(pathArray("",3,3));
    }
    static int count (int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);

        return left+right;
    }
//    path
    static void path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
        }
        if(r > 1){
            path(p+'D', r-1,c);
        }
        if(c > 1){
            path(p+'R', r, c-1);
        }
    }
//    path in array
    static ArrayList<String> pathArray(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> newList = new ArrayList<>();
            newList.add(p);
            return newList;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r > 1){
            list.addAll(pathArray(p+'D',r-1,c)); // D --> Down
        }
        if(c > 1){
            list.addAll(pathArray(p+'R',r,c-1)); // R --> Right
        }
        // this condition for diagonal
        if(r > 1 && c > 1){
            list.addAll(pathArray(p+'S',r-1,c-1)); // S --> Diagonal
        }
        return list;
    }
}
