public class Main {
    public static void main(String[] args) {
        StaticStack<Integer> pilha = new StaticStack<>(5);
        DinamicStack<Integer> pilha2 = new DinamicStack<>(2);

        pilha.push(10);
        pilha.push(20);
        pilha.pop();
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);
        pilha.push(60);

        pilha2.push(10);
        pilha2.push(20);
        pilha2.push(30);
        pilha2.push(40);

        pilha2.peek();

        pilha2.pop();
        pilha2.pop();

        pilha.clear();
        pilha2.clear();

        System.out.println("A pilha está vazia? " + pilha.isEmpty());

    }
}
