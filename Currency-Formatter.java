public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    Locale localeUS = Locale.US;
    Locale localeIndia = new Locale("en", "IN");
    Locale localeChina = Locale.CHINA;
    Locale localeFrance = Locale.FRANCE;

    ArrayList<Locale> locales = new ArrayList<>();
    locales.add(Locale.US);
    locales.add(new Locale("en", "IN"));
    locales.add(Locale.CHINA);
    locales.add(Locale.FRANCE);

    String us = "";
    String india = "";
    String china = "";
    String france = "";

    for (Locale locale: locales) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        String formatted = formatter.format(payment);
        if (locale == Locale.US) {
            us = formatted;
        }
        if (locale == Locale.CHINA) {
            china = formatted;
        }
        if (locale == Locale.FRANCE) {
            france = formatted;
        }
        if (locale.getCountry() == (new Locale("en", "IN")).getCountry() ) {
            india = formatted;
        }
    }

    System.out.println("US: " + us);
    System.out.println("India: " + india );
    System.out.println("China: " + china);
    System.out.println("France: " + france);
}
