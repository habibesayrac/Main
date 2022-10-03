public class Main {

    public static void main(String[] args) {

        int [] sayilar = new int [] {1,2,7,9,0};
        int aranacak = 8;
        boolean varMi= false;

        for (int i = 0; i<sayilar.length ; i++){
            if (aranacak == sayilar[i]){
                varMi = true;
            }
        }
        if (varMi = true){
            System.out.println("Listede var");

        } else{
            System.out.println("Listede yok");
        }


    }
}
