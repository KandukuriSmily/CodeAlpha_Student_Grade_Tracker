import java.util.*;

class task1{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("enter no of students data you want to post:");
        int n = sc.nextInt();
        //for(int i=0;i<n;i++){
            System.out.println("enter student grade:");
            for(int i=0;i<n;i++){
             list.add(sc.nextInt());
        }
        int high=0,sum=0,low=1000;
        for(int i=0;i<list.size();i++){
           if(list.get(i)>high)
           high=list.get(i);

           if(list.get(i)<low)
           low=list.get(i);
           sum+=list.get(i);

        }
        float avg=sum/n;
        System.out.println("highest score:"+high);
        System.out.println("lowest score:"+low);
        System.out.println("average score:"+avg);
        sc.close();
           
    }
}
