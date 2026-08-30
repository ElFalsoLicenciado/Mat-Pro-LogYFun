public class Methods {

    public Node proc(Node root, char i){
        Node node = new Node();

        node.c = i;
        node.next = null;

        if(root==null) return node;

        if(i == '(') return push(root, node);
        return pop(root, node);
    }

    private Node push(Node root, Node node) {
        Node aux = root;
        while (true) {
            if (aux.next == null) {
                aux.next = node; break;
            }
            aux = aux.next;
        }

        return root;
    }



    private Node pop(Node root, Node node) {
        Node aux = root;
        Node prev = null;
        boolean found = false;

        if(aux.c == '(' && aux.next == null) {
            return null;
        }

        while(aux != null) {
            if(aux.c == '(' && prev == null) {
                aux = aux.next;
                root = aux;
                found = true;
                break;
            }
            if (aux.c == '(') {
                prev.next = aux.next;
                found = true;
                break;
            }
            prev = aux;
            aux = aux.next;
        }

        if(!found) return push(root, node);

        return root;
    }

    public void show(Node root){
        Node aux = root;
        System.out.println("\nPila: ");
        while(aux != null) {
            System.out.print(aux.c);
            aux = aux.next;
        }
    }

}
