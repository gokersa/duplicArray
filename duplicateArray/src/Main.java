import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] list = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " + Arrays.toString(list));
        int [] frq = new int[list.length];

        for (int i=0; i<list.length; i++){
            frq[i] = 1;
            for (int j=0; j<list.length; j++){
                if (list[i] == list[j]) {
                    frq[i]++;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = i+1; j < list.length; j++) {
                if ((list[i] == list[j])) {
                    list[j] = 0;
                }
            }
        }

        for(int i=0;i<list.length;i++){
            if(frq[i]>1){
                if(list[i] != 0){
                    System.out.println(list[i]+ " sayisi "+ frq[i]+" kere tekrar edildi.");
                }
            }else if(frq[i] ==1) {
                if (list[i] != 0) {
                    System.out.println(list[i] + " sayisi " + frq[i] + " kere tekrar edildi.");
                }

            }
        }
    }
}