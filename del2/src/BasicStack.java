import java.util.EmptyStackException;

public class BasicStack<T> implements Stack<T> {
    private Node<T> topNode;

    public BasicStack(){
        this.topNode = null;
    }

    // Node class
    private static final class Node<T>{
        private T item;
        private Node<T> nextNode;

        private Node(T nodeData, Node<T> nextNode){
            this.item = nodeData;
            this.nextNode = nextNode;
        }
    }

    @Override
    public Stack<T> push(T item) {
        topNode = new Node<>(item, topNode);
        return this;
    }

    @Override
    public T pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }else{
            T returnData = topNode.item;
            topNode = topNode.nextNode;
            return returnData;
        }
    }

    @Override
    public T peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }else{
            return topNode.item;
        }
    }

    @Override
    public boolean contains(T item){
        Node<T> currentNode = topNode;
        while(currentNode != null){
            if(item.equals(currentNode.item)){
                return true;
            }
            currentNode = currentNode.nextNode;
        }
        return false;
    }

    @Override
    public T access(T item) throws IllegalArgumentException {

        while(!isEmpty()){
            T currentItem = pop();
            if(item.equals(currentItem)){
                return currentItem;
            }
        }
        throw new IllegalArgumentException();
    }


    @Override
    public boolean isEmpty() {
        return topNode == null;
    }
}
