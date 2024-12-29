public class myDLL {

    static Node Head;
    static Node Tail;

    static int size = 0;

    static class Node{

        int Data;
        Node next;
        Node previous;

        public Node(int val){
            this.Data = val;
        }

        public Node(int val, Node next, Node previous){
            this.Data = val;
            this.next = next;
            this.previous = previous;
        }
    }

//----------------------Inserting Node from Head Side-----------------------------------------------------------    

    static void InsertFirst(int val){

        Node new_node = new Node(val);

        if(Head == null){
            Head = new_node;
            Head.previous = null; 
            Tail = Head;
            size++;
        }
        else{
            Head.previous = new_node;
            new_node.next = Head;
            new_node.previous = null;
            Head = new_node;
            size++;

            Node temp = Head;
            while(temp.next != null){
                temp = temp.next;
            }
            Tail = temp;

        }
    }

//----------------------Display Function for Displaying All Nodes -----------------------------------------------------------    

    static void Display(){
        
        Node temp = Head;
        
        for(int i = 0; i < size; i++){
            System.out.print(temp.Data + "-->");
            temp = temp.next;
        }

        System.out.println("End");
    }

//----------------------Function For Inserting Node at last-----------------------------------------------------------    

    static void InsertLast(int val){
        
        Node new_Node = new Node(val);

        if(Head == null){
            InsertFirst(val);
        }
        else{
            Tail.next = new_Node;
            new_Node.previous = Tail;
            new_Node.next = null;
            Tail = new_Node;
            size++;
        }
    }
    
//----------------------Function For Inserting Node at any given Index-----------------------------------------------------------    

    static void Insert(int val, int index){
        
        if(Head == null || index == 1){
            InsertFirst(val);
        }else if(index == size+1){
            InsertLast(val);
        }
        else {
            Node new_Node = new Node(val);
            Node prevNode = Head;
            Node nextNode = Head;
            for(int i = 1; i < index-1; i++){
                prevNode = prevNode.next;
            }
            for(int i = 1; i <= index-1; i++){
                nextNode = nextNode.next;
            }
            prevNode.next = new_Node;
            new_Node.previous = prevNode;
            new_Node.next = nextNode;

            Node temp = Head;
            while(temp.next != null){
                temp = temp.next;
            }
            Tail = temp;

            size++;
        }
    }

//----------------------Function For Deleting Node at given Index-----------------------------------------------------------    

    static void DeleteNodeAt(int index){

        if(Head == null){
            return;
        }
        if(index == 1){
            Head = Head.next;
            Head.previous = null;
            size--;
            return;
        }
        if(index == size){
            Node temp = Head;
            for(int i = 1; i < size-1; i++){
                temp = temp.next;
            }
            Tail = temp;
            temp.next = null;
            size--;
        }
        else {
            Node prevNode = Head;
            Node nextNode = Head;
            for(int i = 1; i < index-1; i++){
                prevNode = prevNode.next;
            }
            for(int i = 1; i <= index; i++){
                nextNode = nextNode.next;
            }
            prevNode.next = nextNode;
            nextNode.previous = prevNode;
            Node temp = Head;
            while(temp.next != null){
                temp = temp.next;
            }
            Tail = temp;
            size--;
        }
    }



    public static void main(String[] args) {

        myDLL list = new myDLL();

        list.InsertLast(10);
        list.InsertLast(11);
        list.InsertLast(12); 
        list.InsertLast(14);
        // list.Insert(13, 5);
        // list.InsertLast(14); 
        // list.InsertLast(15);
        // list.DeleteNodeAt(2);
        list.Display();
        System.out.println("Size is : "+ size);
        System.out.println("Value of Head is : "+ Head.Data);
        System.out.println("Value of Tail is : "+ Tail.Data);
    }
}