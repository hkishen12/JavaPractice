
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
 
public class RemoveduplicateList {
 
    public static void main(String a[]){
        String[] strArr = {"one","two","three","four","four","five"};
        //convert string array to list
        List<String> tmpList = Arrays.asList(strArr);
        //create a treeset with the list, which eliminates duplicates
        TreeSet<String> unique = new TreeSet<String>(tmpList);
        System.out.println(unique);
        
        LinkedHashSet<String> uniqueorder = new LinkedHashSet<String> (tmpList);
        System.out.println(uniqueorder);
    }
}
