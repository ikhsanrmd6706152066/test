import java.util.Scanner;
class fibonacci{
    public static void main (String args[]){
        int[] bil=new int[100];
        bil[0]=1;
        bil[1]=1;        
        int deret;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Input : \n");
        String data = input.nextLine();
        deret = Integer.parseInt(data);
        System.out.print("Output : \n");
		
        for(int i=0;i<deret;i++){
            System.out.print(bil[i]+" ");
            bil[i+2]=bil[i]+bil[i+1];
        }
    }
} 
