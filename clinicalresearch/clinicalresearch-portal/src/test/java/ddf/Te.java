package ddf;

public class Te {
public static void main(String[] args) {
   String str="aaa";
   String[] split = str.split(",");
   System.out.println(split.length);
   for(String st:split)
   {
	   System.out.println(st);
   }
}
}
