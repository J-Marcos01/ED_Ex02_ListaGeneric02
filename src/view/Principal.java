package view;

import controller.ListaController;

public class Principal {
	public static void main(String[] args)throws Exception {
		
		int [] vet={10,5,8,1,9,2,4,7,3,6};//criando vetor com valores da lista 
		
		ListaController op = new ListaController();//instanciando a classe ListaController

		op.ordenacao(vet);//chamando operação que ira gerar lista e classificala 
		
	}
}
