class premier{
    public static void main(String[] args){
    int n = 100 ;
    int buffer = 0;
    boolean flag = true;

    for (int i = 2; i < n; i++){
        flag = true;
        for (int j = 2; j < i-1; j++){
            if (i % j == 0){
                flag = false;
            }
        }
            if (flag){
                System.out.print("Il est premier " + i + "\n");
                buffer += 1;
            }
        }

    System.out.print("Compteur de nombre premier: " + buffer);
    }
}