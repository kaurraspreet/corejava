import java.util.*;
class CompareSet{
 public static void main(String[] args) {
	  HashSet<String> hs = new HashSet<String>();
      hs.add("raspreet");
      hs.add("priyanka");
      hs.add("rajni");
      hs.add("shalu");
      hs.add("monika");
      hs.add("purnima");
      HashSet<String> subset = new HashSet<String>();
      subset.add("raspreet");
      subset.add("zoya");
      subset.add("rajni");
      subset.add("vidhi");
      subset.add("monika");
      subset.add("sheetal");
      hs.retainAll(subset);
      System.out.println(hs);

}
}