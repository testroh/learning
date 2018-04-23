import java.util.*;

/**
 * Created by Rohith on 12/27/2017.
 */
public class mar{

    public static void main(String args[]){
        String duplicates[] = new String[] {"java","spring","hiber","java"};
        Set nonDuplicateSet = new HashSet();
        Set duplicateSet =  new HashSet();
        for (String string : duplicates){
            if (!nonDuplicateSet.contains(string)){
                nonDuplicateSet.add(string);
            }else{
                duplicateSet.add(string);
            }
        }
        System.out.print(nonDuplicateSet);

    }
}
