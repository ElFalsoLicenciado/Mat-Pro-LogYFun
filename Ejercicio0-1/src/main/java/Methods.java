public class Methods {

    public Node proc(Node root, char i){
        Node node = new Node(i);

        if(root==null) return node;

        if(i == '(') return push(root, node);
        return pop(root, node);
    }

    private Node push(Node root, Node node) {
        Node aux = root;
        while (true) {
            if (aux.next == null) {
                aux.next = node;
                break;
            }
            aux = aux.next;
        }
        return root;
    }

    private Node pop(Node root, Node node) {
        Node aux = root;
        Node prev = null;

        while(true) {
            if(aux.c == '(' && prev == null) {
                root = aux.next;
                break;
            }
            if (aux.c == '(') {
                prev.next = aux.next;
                break;
            }

            if(aux.next == null) return push(root, node);

            prev = aux;
            aux = aux.next;
        }
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
