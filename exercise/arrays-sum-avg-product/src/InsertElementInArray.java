public class InsertElementInArray {
    int count;//default is 0
    public static void main(String[] args){

        InsertElementInArray o=new InsertElementInArray();

        int a[]=new int[5];
        
        for(int j=0;j<a.length;j++){
           o.insert(a,j+1);//we insert j value
        }
        
        o.print(a);
        o.insertAtStart(a, 22);
        o.print(a);
        o.InsertAtPosition(a, 2, 20);
        o.print(a);

    }

    public void InsertAtPosition(int a[],int position,int val){
        for(int i = count-1;i>position;i--){
            a[i]=a[i-1];
        }
        a[position]=val;
    }

    //insert value in back
    public void insert(int a[],int val){
        a[count++]=val;
    }

   public void insertAtStart(int a[],int val){
        for(int i =count-1; i>0; i--){
            a[i]=a[i-1];
        }
        a[0]=val;
   }

    public void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
