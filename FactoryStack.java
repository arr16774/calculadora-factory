
public class FactoryStack {

	public FactoryStack(){
		
	}
	
	public iPila choose(String comp, String lista){
		switch(comp){
		case "1":
			return new StackVector();
		case "2":
			return new StackArrayList();
		case "3":
			return new listStack(lista);
		}
		return null;

	}
}
