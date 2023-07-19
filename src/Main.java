import java.util.Scanner;

class Lesser{
    public static void countLesser(int arr[],int size){
        for(int i=0;i<size;i++)
        {
            int count=0;
            for (int j=i+1;j<size;j++)
            {
                if(arr[i]>arr[j])
                {
                    count++;
                }
            }
            System.out.print(count+" ");
        }
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n:");
        int n= scanner.nextInt();
        System.out.println("Enter array Elements:");
        int arr[]=new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        countLesser(arr,n);
    }

}
