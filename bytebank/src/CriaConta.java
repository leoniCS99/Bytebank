public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta(2424, 2626);
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.getSaldo());

        primeiraConta.deposita(100);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta(36363,83838);
        segundaConta.deposita(50);

        System.out.println("primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("segunda conta tem " + segundaConta.getSaldo());

        System.out.println("referenciar: " + primeiraConta);
    }

}