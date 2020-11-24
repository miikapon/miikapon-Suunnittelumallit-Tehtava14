package builder;

public class Hesburger implements Builder<StringBuilder> {

    private StringBuilder hampurilainen;

    public Hesburger() {
        this.hampurilainen = new StringBuilder();
    }

    @Override
    public StringBuilder getPurilainen() {
        return this.hampurilainen;
    }

    @Override
    public Hesburger addSämpylä() {
        this.hampurilainen.append("sämpylä").append(", ");
        return this;
    }

    @Override
    public Hesburger addMajoneesi() {
        this.hampurilainen.append("majoneesi").append(", ");
        return this;
    }

    @Override
    public Hesburger addSalaatti() {
        this.hampurilainen.append("salaatti").append(", ");
        return this;
    }

    @Override
    public Hesburger addPihvi() {
        this.hampurilainen.append("pihvi").append(", ");
        return this;
    }

    @Override
    public Hesburger addHampurilaiskastike() {
        this.hampurilainen.append("hampurilaiskastike").append(", ");
        return this;
    }

    @Override
    public Hesburger addSuolakurkku() {
        this.hampurilainen.append("suolakurkku").append(", ");
        return this;
    }
}
