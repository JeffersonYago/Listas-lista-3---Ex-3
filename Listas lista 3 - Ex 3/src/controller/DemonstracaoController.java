package controller;

import model.Lista;

public class DemonstracaoController {

	public DemonstracaoController() {
		super();
	}
	
	public void demonstraPassos() {
		Lista<Integer> lista = new Lista<>();
			lista.addFirst(1);
			try {
				lista.addLast(2);
				lista.addLast(6);
				lista.addLast(7);
				lista.addLast(8);
				manipulaLista(lista);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	private void manipulaLista(Lista<Integer> lista) throws Exception {
		int[] vet = {3,3,9,6,9,8,5,7,10,4,8,10,8};
		for(int i:vet) {
				if(estaLa(lista, i)) {
					lista.addLast(i);
				} else if(i % 2 ==0) {
					lista.add(i, 2);
				} else {
					lista.add(i, 1);
				}
			}
		int cont = 0;
		do {
			System.out.print("["+lista.get(cont)+"] "+"--> ");
			cont++;
		} while(cont < lista.size());
	}

	private boolean estaLa(Lista<Integer> lista, int aux) throws Exception {
		int tamanho = lista.size();
		int contador = 0;
		 while(contador < tamanho) {
			if(lista.get(contador) == aux) {
				return true;
			   }
			contador++;
			}
		return false;
	}
}