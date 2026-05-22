package Teste;

import DevJuliaExercicio.LinkedList;

public class Teste1 {

    public static void main(String[] args) {
        LinkedList<Integer> listA = new LinkedList<>();
        listA.addLast(3);
        listA.addLast(5);
        listA.addLast(6);

        LinkedList<Integer> listB = new LinkedList<>();
        listB.addLast(2);
        listB.addLast(4);
        listB.addLast(6);

        LinkedList<Integer> listC = new LinkedList<>();
        listC.addLast(20);
        listC.addLast(4);
        listC.addLast(5);
        listC.addLast(19);
        listC.addLast(47);

        // ---- ATIVIDADE 1 ----
        System.out.println("--- REALIZANDO ATIVIDADE 1 DA PROVA ---");
        System.out.println("INSERINDO ELEMENTO EM ORDEM CRESCENTE EM UMA LISTA ORDENADA");
        System.out.print("LISTA ATUAL: ");
        listA.imprimirLista();
        listA.addSorted(4);
        System.out.print("LISTA APÓS A INSERÇÃO DO NUMERO 4: ");
        listA.imprimirLista();
        System.out.println("-----------------------------------------");

        // ---- ATIVIDADE 2 ----
        System.out.println("--- REALIZANDO ATIVIDADE 2 DA PROVA ---");
        System.out.println("REMOVENDO ELEMENTO 5 SEM TER A REFERENCIA DO TAIL");
        System.out.print("LISTA ATUAL: ");
        listC.imprimirLista();
        listC.Remove5();
        System.out.print("LISTA APÓS REMOVER O NUMERO 5: ");
        listC.imprimirLista();
        System.out.println("-----------------------------------------");

        // ---- ATIVIDADE 3 ----
        System.out.println("--- REALIZANDO ATIVIDADE 3 DA PROVA ---");
        System.out.println("INVERTENDO A LISTA C");
        System.out.print("LISTA ATUAL: ");
        listC.imprimirLista();
        listC.reverse();
        System.out.print("LISTA APÓS O REVERSE: ");
        listC.imprimirLista();
        System.out.println("-----------------------------------------");

        // ---- ATIVIDADE 4 ----
        System.out.println("--- REALIZANDO ATIVIDADE 4 ---");
        System.out.println("JUNTANDO E ORDENANDO AS LISTAS A E B");
        System.out.print("LISTA A: ");
        listA.imprimirLista();
        System.out.print("LISTA B: ");
        listB.imprimirLista();
        LinkedList<Integer> juntas = LinkedList.juntar(listA, listB);
        System.out.print("LISTA APÓS A JUNÇÃO ORDENADA: ");
        juntas.imprimirLista();
        System.out.println("-----------------------------------------");

        // ---- ATIVIDADE 5 ----
        System.out.println("--- REALIZANDO ATIVIDADE 5  ---");
        System.out.println("REMOVENDO O 2º ELEMENTO A PARTIR DO FIM DA LISTA C");
        System.out.print("LISTA C ATUAL: ");
        listC.imprimirLista();
        listC.removeN(2);
        System.out.print("LISTA C APÓS REMOVER N=2 DO FIM: ");
        listC.imprimirLista();
        System.out.println("-----------------------------------------");
    }
}
