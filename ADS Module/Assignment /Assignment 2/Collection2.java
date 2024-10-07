import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Collection2{
        static class Person{
		int age;
		String name;
		Person(String name,int age){	
			this.name=name;
			this.age=age;
		}
		
	}
	//Comparator<Person> ageCompare=(p1,p2)->Integer.compare(p1.age,p2.age)
	static Comparator<Person> ageNameCompare=(p1,p2)->{
		int ageCompare=Integer.compare(p1.age,p2.age);
		if(ageCompare!=0){
			return ageCompare;
		}else{
			return p1.name.compareTo(p2.name);
		}
	};
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		List<Person> list=new ArrayList<>();
		for(int i=0;i<n;i++){
			list.add(new Person(sc.nextLine(),sc.nextInt()));
			sc.nextLine();
		}
		Collections.sort(list,ageNameCompare);
		
		System.out.println();
		for(Person p:list){
			System.out.println(p.name+" "+p.age);
		}
		
	}
}