package classesandobjects;

public enum ModifiedCountry {

    FRANCE("French", "Paris"),
    ITALY("Italian", "Roam"),
    GERMANY("Berlin", "German"),
    UK("English", "London");

    private String language;
    private String capital;

    public String getLanguage() {
        return language;
    }

    public String getCapital() {
        return capital;
    }

    ModifiedCountry(final String language, final String capital) {
        this.language = language;
        this.capital = capital;
    }

}
