public class pairSum {
    public static void main(String[] args) {
        int[] num = {2,5,9,11};
        int i=0, j=num.length-1, target = 14;
        while(i<j){
            if(num[i] + num[j] == target){
                break;
            }else if(num[i] + num[j] < target){
                i++;
            }else{
                j--;
            }
        }

        if(i == j){
            System.out.println("No pair found");
        }else{
            System.out.println("Pair of "+num[i]+" and "+num[j]+" found");
        }       

    }    
}
