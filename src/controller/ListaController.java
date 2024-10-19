package controller;

import br.edu.fateczl.Lista.Lista;
import br.edu.fateczl.megesort.Operacoes;

public class ListaController {

		public ListaController() {
			super();
		}
		
		public void ordenacao(int [] vet)throws Exception {
			
			Lista<Integer> l = new Lista<>(); //criando uma lista
			
			l.addFirst(vet[0]);//adicionando o primeiro valor a primeiro posição
			
			for(int i=1;i<10;i++) {
				l.addLast(vet[i]);//adicionando demais elementos
			}
			
			System.out.println("Lista com "+l.size() +" elementos ");//conferindo se a lista contem o tamanho certo
			
			for(int i=0;i<10;i++) {
				System.out.println("Elemento #"+i + " -" + l.get(i));//printando elementos da lista
			}
			
			int []aux=new int[l.size()];//criando um vetor aux para receber elementos da lista
			
			for(int i=0;i<10;i++) {
				aux[i]=l.get(i);//subindo valores da lista no vetor com o método get da lista
			}
			
			int tam=aux.length;//carregando tamanho do vetor 
			
			System.out.println(tam );//printando tamanho para conferir
			
			l.clear();//limpando lista
			
			System.out.println("Lista com "+l.size() +" elementos ");//conferindo se limpeza deu certo
			
			Operacoes op = new Operacoes();//instanciando classe operação do merge sort
			
			aux=op.megeSort(vet, 0, tam-1);//chamando merge sort , indice fim = posição do ultimo elemento (tamamho-1)
			
			l.addFirst(aux[0]);//adicionando primeiro elemento do vetor organizado a lista
			
			for(int i=1;i<10;i++) {
				l.addLast(aux[i]);//adicionando demais elementos 
			}
			
			for(int i=0;i<10;i++) {
				System.out.println("Elemento #"+i + " -" + l.get(i));//printando elementos da lista
			}
			
		}
		
}
