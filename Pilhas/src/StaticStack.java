public class StaticStack<T> {
    private int top = -1;
    private T[] data;

    public StaticStack(int capacity) {
        data = (T[]) new Object[capacity];
    }

    //empilhar um elemento
    public void push(T elemento) {
        if (isFull()) {
            System.out.println("A pilha está cheia :D.");
        } else {
            data[++top] = elemento;
            System.out.println("Elemento " + elemento + " empilhado.");
        }
    }

    // desempilha um elemento
    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            T elemento = data[top];
            data[top--] = null;
            System.out.println("Elemento " + elemento + " desempilhado.");
            return elemento;
        }
    }

    // limpa a pilha
    public void clear() {
        for (int i = 0; i <= top; i++) {
            data[i] = null;
        }
        top = -1;
        System.out.println("A pilha foi esvaziada.");
    }

    //verifica se a pilha está cheia
    public boolean isFull() {
        return top == data.length - 1;

    }

    //verifica se a pilha está vazia
    public boolean isEmpty() {
        return top == -1;
    }
}
