package exemplolistaord;

class ListaOrd<E extends Comparable<E>> {

    private Node head; //início da Lista Ordenada

    //Cria uma Lista no estado vazia (construtor)
    public ListaOrd() {
        head = null;
    }

    //Verifica se a lista está vazia
    public boolean isEmpty() {
        return (head == null);
    }

    //Insere um elemento na Lista Ordenada
    public <E extends Comparable<E>> E insert(E x) {
        if(x==null)return null;
        try {
            Node novo = new Node();
            novo.setValue(x); novo.setNext(null); 
            //Se a lista estiver vazia ou o elemento for menor que o primeiro
            if (isEmpty() || x.compareTo((E) head.getValue()) < 0) {
                novo.setNext(head);
                head = novo;
            } else {
                Node aux = head;
                while (aux.getNext() != null && x.compareTo((E) aux.getNext().getValue()) > 0) {
                    aux = aux.getNext();
                }
                novo.setNext(aux.getNext());
                aux.setNext(novo);
            }
        } catch (Exception ex) { //se memória insuficiente
            return null;
        }
        return x;
    }

    //Retorna o conteúdo da Lista
    public String toString() {
        if (!isEmpty()) {
            Node aux;
            aux = head;
            String saida = "";
            while (aux != null) {
                saida += aux.getValue().toString();
                aux = aux.getNext();
                if (aux != null) saida += ", ";  //ou utilizar /n em lugar de , para listas de objetos maiores
            }
            return "ListaOrd: [" + saida + "]";
        } else {
            return "ListaOrd: []";
        }
    }

    //Remover um elemento da lista
    public <E extends Comparable<E>> E remove(E x) {
        if (isEmpty() || x == null || x.compareTo((E) head.getValue()) < 0) { //pré-condições
            return null;  //se lista vazia, ou valor menor que o primeiro, ou x é nulo 
        } else {
            if (x.compareTo((E) head.getValue()) == 0) { //se for o primeiro elemento	
                Node temp = head;
                head = head.getNext();
                return x;
            } else {  //se for maior que o primeiro, então tentar achar a posição:
                Node antes = head, depois = head.getNext();
                while (depois != null && x.compareTo((E) depois.getValue()) > 0) {
                    antes = antes.getNext();  //mover simultaneamente os dois ponteiros
                    depois = depois.getNext();
                }
                if (depois != null && x.compareTo((E) depois.getValue()) == 0) {
                    antes.setNext(depois.getNext());  //encontrou o objeto x, caso geral
                    return x;
                } else {
                    return null;  //não encontrou o objeto x					
                }
            }
        }
    }

    //Buscar um objeto na lista e retornar o nó onde encontrou
    public <E extends Comparable<E>> Node find(E x) {
        if (x==null)return null; //pré-condição
        //navegamos até o nó de interesse:
       Node aux = head;
       while (aux != null && x.compareTo((E) aux.getValue()) > 0) {
            aux = aux.getNext();
        }
        //se achamos o elemento:
        if (aux != null && x.compareTo((E) aux.getValue()) == 0) {
            return aux;
        } else {
            return null; //não encontramos
        }
    }

    //Destrói (limpa) a lista ordenada
    public void clear() {
        Node aux = head;
        while (aux != null) {
            Node tmp = aux;
            aux = aux.getNext();            
            tmp.setNext(null); //opcional, para liberar memória
        }
        head = null;
    }
    
}
