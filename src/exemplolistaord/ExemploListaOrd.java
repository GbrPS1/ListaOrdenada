package exemplolistaord;

public class ExemploListaOrd {

    public static void main(String[] args) {
        ListaOrd list = new ListaOrd();
        System.out.println( list.toString() );
        list.insert(10);
        list.insert(9);
        list.insert(2);
        list.insert(5);
        list.insert(1);
        list.insert(14);
        System.out.println( list.toString() );
        if(list.find(9)!=null) {
            System.out.println( "Encontramos o 9; a lista continua sendo:" );
        }
        System.out.println( list.toString() );
        System.out.println( "Eliminamos o " + list.remove(10) + ":");
        System.out.println( list.toString() );
        System.out.println( "Eliminamos o " + list.remove(2)  + ":");
        System.out.println( list.toString() );
        System.out.println( "Eliminamos o " + list.remove(1)  + ":");
        System.out.println( list.toString() );
        System.out.println( "Eliminamos o " + list.remove(14)  + ":");
        System.out.println( list.toString() );
        list.clear();
        System.out.println( "Esvaziamos a lista (clear) e ficou: \n" + list.toString() );
        
        System.out.println("Agora vamos criar uma lista ordenada de strings...");
        ListaOrd listn = new ListaOrd();
        System.out.println( listn.toString() );
        listn.insert("Julio");
        listn.insert("Ana");
        listn.insert("Lucas");
        listn.insert("Betty");
        listn.insert("Jenildo");
        listn.insert("Amilton");
        System.out.println( listn.toString() );
     }
    
}
