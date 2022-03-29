import java.util.ArrayList;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList al=new ArrayList<>();
        al.add("poi");
        al.add("jothi");
        ArrayList al2=new ArrayList<>();
        al2.add(90);
        al2.add(89);
        al2.add(67);
        System.out.println(al.contains("jothi"));
        al.addAll(2,al2);
  
        System.out.println(al);
        System.out.println(al.indexOf(89));
        
        
	}

}
