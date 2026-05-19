public class Main {

    public static void main(String[] args) {
        // Exemplo de uso
        LinkedList<Integer> listA = new LinkedList<>();
        listA.addLast(1);
        listA.addLast(3);
        listA.addLast(5);

        LinkedList<Integer> listB = new LinkedList<>();
        listB.addLast(2);
        listB.addLast(4);
        listB.addLast(6);


    }

    public static class LinkedList<T> {

        public static class Node<T> {

            T element;
            Node<T> next;

            Node(T element) {
                this.element = element;
                this.next = null;
            }

            Node(T element, Node<T> next) {
                this.element = element;
                this.next = next;
            }
        }

        private Node<T> head;
        private Node<T> tail;
        private int size = 0;

        public Node<T> getNode(int index) {
            Node<T> corrente = head;
            for (int i = 0; i < index; i++) {
                corrente = corrente.next;
            }
            return corrente;
        }

        public void addFirst(T element) {
            Node<T> novo = new Node<>(element, head);
            if (size == 0) {
                tail = novo;
            }
            head = novo;
            size++;
        }

        public void addLast(T element) {
            Node<T> newNode = new Node<>(element, null);
            if (size == 0) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
            size++;
        }

        public void addSorted(T element) {
            if (size == 0) {
                addFirst(element);
                return;
            }

            if (((Comparable<T>) element).compareTo(head.element) <= 0) {
                addFirst(element);

            } else if (((Comparable<T>) element).compareTo(tail.element) >= 0) {
                addLast(element);


            } else {
                Node<T> current = head;
                while (current.next != null
                        && ((Comparable<T>) current.next.element).compareTo(element) < 0) {
                    current = current.next;
                }
                Node<T> newNode = new Node<>(element, current.next);
                current.next = newNode;
                size++;
            }
        }


        public void reverse() {
            Node<T> next = null;
            Node<T> prev = null;
            Node<T> current = head;
            tail = head;

            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            head = prev;
        }

        // CORRIGIDO: agora retorna a nova lista em vez de ser void
        @SuppressWarnings("unchecked")
        public static <T> LinkedList<T> juntar(LinkedList<T> listA, LinkedList<T> listB) {
            LinkedList<T> novaList = new LinkedList<>();

            // Une a Lista A
            if (listA.head != null) {
                novaList.head = listA.head;
                novaList.tail = listA.tail;
                novaList.size = listA.size;
            }

            // Une a Lista B no fim da A
            if (listB.head != null) {
                if (novaList.head == null) {
                    novaList.head = listB.head;
                    novaList.tail = listB.tail;
                    novaList.size = listB.size;
                } else {
                    novaList.tail.next = listB.head;
                    novaList.tail = listB.tail;
                    novaList.size += listB.size;
                }
            }

            if (novaList.head == null || novaList.head.next == null) {
                return novaList;
            }

            boolean houveTroca;
            do {
                houveTroca = false;
                LinkedList.Node current = novaList.head;

                while (current != null && current.next != null) {
                    if (((Comparable) current.element).compareTo(current.next.element) > 0) {
                        Object temp = current.element;
                        current.element = current.next.element;
                        current.next.element = temp;
                        houveTroca = true;
                    }
                    current = current.next;
                }
            } while (houveTroca);

            return novaList;
        }
    }
}