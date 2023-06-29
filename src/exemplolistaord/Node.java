package exemplolistaord;

public class Node {
	private Object value; 	//dado a ser armazenado no nó
	private Node next;	//referência para o próximo nó

	//Retorna o conteúdo do nó
	public Object getValue() {
		return value;
	}

	//Atribui um valor ao conteúdo do nó
	public void setValue(Object novovalor) {
		value = novovalor;
	}

	//Retorna a referência do próximo nó
	public Node getNext() {
		return next;
	}

	//Atribui uma referência para o próximo nó
	public void setNext(Node novoprox) {
		next = novoprox;
	}
}