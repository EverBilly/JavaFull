class For {
    int variable;
    public static void main(String[] args) {
        For b;

        for(int i = 0; i < 10; i++) {
            b = new For();              // Aqui quedaran 9 objetos Inaccesibles
            b.variable = 10;                   //Ya que b apuntara a b9

        }
        System.out.println("end");
    }
}