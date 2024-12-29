public class MN {
    public static void main(String[] args) {
        int arr[] = {3,0,1};
        int ans = MissingNum(arr);
        System.out.println(ans);

    }

    static int MissingNum(int arr[]){
        int LP = 0;
        int RP = 0;
        // int ans;

        for(int i = 0; i < arr.length ; i++){
            if(arr[LP] != LP){
                RP++;
                if(arr[RP] == LP){
                    swap(arr, LP, RP);
                }
                else{
                    RP++; 
                }
            }else{
                LP++;   
            }
        }

        

        return 1; 
    }

    static void swap(int arr[], int LP, int RP){

        int temp = arr[LP];
        arr[LP] = arr[RP];
        arr[RP] = temp;
    }

}
