package collectionAPI;

// testando

import java.util.*;

public class TestingCollection {
    public static void main(String[] args) {

        System.out.println("=== LISTA (permite duplicatas, mantém ordem) ===");
        Collection<String> lista = new ArrayList<>();
        lista.add("Sparrow");
        lista.add("Sparrow");
        System.out.println("Lista: " + lista);

        System.out.println("\n=== CONJUNTO (não permite duplicatas) ===");
        Collection<String> conjunto = new HashSet<>();
        conjunto.add("Sparrow");
        conjunto.add("Sparrow");
        System.out.println("Set: " + conjunto);

        System.out.println("\n=== MÉTODO remove() ===");
        Collection<String> aves = new ArrayList<>();
        aves.add("hawk");
        aves.add("hawk");
        System.out.println("Antes: " + aves);
        aves.remove("cardinal"); // não remove, não existe
        aves.remove("hawk");     // remove um
        System.out.println("Depois: " + aves);

        System.out.println("\n=== isEmpty() e size() ===");
        Collection<String> animais = new ArrayList<>();
        System.out.println("Está vazia? " + animais.isEmpty());
        System.out.println("Tamanho: " + animais.size());
        animais.add("leão");
        animais.add("tigre");
        System.out.println("Está vazia? " + animais.isEmpty());
        System.out.println("Tamanho: " + animais.size());

        System.out.println("\n=== clear() ===");
        animais.clear();
        System.out.println("Limpo. Vazio? " + animais.isEmpty());

        System.out.println("\n=== contains() ===");
        Collection<String> bichos = new ArrayList<>();
        bichos.add("hawk");
        System.out.println("Contém 'hawk'? " + bichos.contains("hawk"));
        System.out.println("Contém 'robin'? " + bichos.contains("robin"));

        System.out.println("\n=== removeIf() com lambda ===");
        Collection<String> listaNomes = new ArrayList<>();
        listaNomes.add("Magician");
        listaNomes.add("Assistant");
        listaNomes.removeIf(s -> s.startsWith("A"));
        System.out.println("Resultado: " + listaNomes);

        System.out.println("\n=== removeIf() com method reference ===");
        Collection<String> palavras = new HashSet<>();
        palavras.add("Wand");
        palavras.add("");
        palavras.removeIf(String::isEmpty);
        System.out.println("Resultado: " + palavras);

        System.out.println("\n=== forEach() com lambda e method reference ===");
        Collection<String> gatos = List.of("Annie", "Ripley");
        gatos.forEach(c -> System.out.println("Lambda: " + c));
        gatos.forEach(System.out::println);

        System.out.println("\n=== equals() com List e Set ===");
        var list1 = List.of(1, 2);
        var list2 = List.of(2, 1);
        var set1 = Set.of(1, 2);
        var set2 = Set.of(2, 1);
        System.out.println("List1 == List2? " + list1.equals(list2));
        System.out.println("Set1 == Set2? " + set1.equals(set2));
        System.out.println("List1 == Set1? " + list1.equals(set1));

        System.out.println("\n=== NullPointerException com unboxing ===");
        var alturas = new ArrayList<Integer>();
        alturas.add(null);
        try {
            int altura = alturas.get(0); // Vai causar NPE
            System.out.println("Altura: " + altura);
        } catch (NullPointerException e) {
            System.out.println("Cuidado: NullPointerException ao fazer unboxing!");
        }
    }
}

