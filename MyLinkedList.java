
public class MyLinkedList {

    static Node Head;
    static Node Tail;
    static int size = 0;
    
    class Node {
        
        int value;
        Node next;
        
        // public Node(){
        //     MyLinkedList.size = size;
        // }
        
        public Node(int val){
            this.value = val;
        }

        public Node(int val, Node next){
            this.value = val;
            this.next = next;
        }
    }

    public Node InsertFirst(int val, Node next){

        Node newNode = new Node(val);
        
        if(Head == null){
            Head = newNode;
            Tail = Head;
            size++;
        }
        else { 
            newNode.next = Head; 
            // Tail = Head.next;
            Head = newNode;
            size++;
        }
        
        // Node temp = Head;
        // for(int i = 0; i < size; i++){
        //     temp = temp.next;
        //     System.out.println("Temp is : "+ temp.value);
        // }

        // Tail = temp;

        return newNode;
    }

    public void Display(){

        Node temp = Head;

        for(int i = 0; i < size; i++){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("End");
    }


    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        Node a = list.InsertFirst(1, null);
        Node b = list.InsertFirst(2, null);
        Node c = list.InsertFirst(3, null);
        Node d = list.InsertFirst(4, null);
        list.Display();
        // System.out.println("Value is Inserted is : " + a.next);
        System.out.println("Current Size is : " + list.size);
        System.out.println("Value of Head is : " + Head.value);
        // System.out.println("Value of Tail is : " + Tail.value);
    }
}