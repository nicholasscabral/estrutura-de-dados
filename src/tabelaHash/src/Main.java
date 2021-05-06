public class Main {
    public static void main(String[] args) {
        TabelaHashAberta tabelaHash =  new TabelaHashAberta(8);

        tabelaHash.add(16);
        tabelaHash.add(23);
        tabelaHash.add(41);
        tabelaHash.add(25);
        tabelaHash.add(39);

        tabelaHash.list();
    }
}
