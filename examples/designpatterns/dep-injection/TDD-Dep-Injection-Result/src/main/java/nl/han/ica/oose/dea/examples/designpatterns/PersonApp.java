package nl.han.ica.oose.dea.examples.designpatterns;

public class PersonApp {
	public static void main(String[] args) {
		DatabaseManager mngr = new DatabaseManagerFactory().create();
		PersonRepository pr = new PersonRepository();
		pr.setMngr(mngr);
		
		pr.add(new Person());
		System.out.println(pr.list().size());
	}

}
