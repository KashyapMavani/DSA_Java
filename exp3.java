public class exp3 {
        public static void main(String[] args) {
            addition add=new addition();
            add.sum(20,30);
            add.sum(12.2f,23.2f);
            add.sum("Ankita","Nimbalkar");
            System.out.println(add.sum(10.20,20.30));
        }
}
    
    class addition{
    
        void sum(){
            int n1=23;
            int n2=40;
            int result=n1+n2;
            System.out.println(result);
    
        }
    
        double sum(double n1, double n2){
            double result=n1+n2;
            return result;
           
        }
        void sum(int n1, int n2){
            int result=n1+n2;
            System.out.println(result);
        }
    
        void sum(float n1, float n2){
            float result=n1+n2;
            System.out.println(result);
        }
    
        void sum(String n1, String n2){
            String result=n1+n2;
            System.out.println(result);
        }
    }

