import java.util.Arrays;
import java.util.List;

public class Ex07 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("kirk", "spock", "scott", "mccoy", "sulu");
        int iterador = 0;

        //a) Percorra a lista usando o operador 'for' clássico, usando uma variável para iterar pelos índices, e imprima no console os valores de cada nome;
        System.out.println("For clássico");
        for(int i = 0; i< nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
        System.out.println();

        //b) Percorra a lista usando o operador 'for-each' usando a forma simplificada, e imprima no console os valores de cada nome;
        System.out.println("For Each");
        for(String nome: nomes) {
            System.out.println(nome);
        }
        System.out.println();

        //c) Percorra a lista usando o operador 'while', e imprima no console os valores de cada nome;
        System.out.println("While");
        while(iterador<nomes.size()){
            System.out.println(nomes.get(iterador));
            iterador++;
        }

    }
}
