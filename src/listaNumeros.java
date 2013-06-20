import java.util.ArrayList;
import java.util.List;

public class listaNumeros{
	
	private List<Integer> list;
	private final int size=10;
	
	public listaNumeros(){
		
		list = new ArrayList<Integer>(size);
		for(int i = 0; i < 10; i++){
			list.add(new Integer(i));
		}
	}
	
	public void imprimirLista(){
		try{
			for(int i = 0; i < 20; i++){
				System.out.println("Valor: "+ list.get(i));
			}
		}catch(IndexOutOfBoundsException e){
			System.out.println("\nFINALIZAR");
			
		}
		
	}
}
