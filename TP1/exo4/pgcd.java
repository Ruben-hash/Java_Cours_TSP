class pgcd {
    public static void main (String[] args) {
        int p = 243;
        int q = 576;
        System.out.println("pgcd("+p +','+ q+") = ");
        while (p*q != 0) {
            if (p > q) {
                p = p - q;
            }
            else if (p < q) {
                q = q - p;
            }
            else {
                break;
            }
        }
        if (p == 0) {
            System.out.println(q);
        }
        else {
            System.out.println(p);

        }
    }
}