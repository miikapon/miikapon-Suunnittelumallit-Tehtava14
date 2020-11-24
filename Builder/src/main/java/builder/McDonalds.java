package builder;

import java.util.ArrayList;
import java.util.List;

import builder.Ainesosa;
import builder.Majoneesi;
import builder.Hampurilaiskastike;
import builder.Pihvi;
import builder.Salaatti;
import builder.Suolakurkku;
import builder.Sämpylä;


public class McDonalds implements Builder<List<Ainesosa>> {
  private List<Ainesosa> hampurilainen;

  public McDonalds() {
    this.hampurilainen = new ArrayList<>();
  }

  @Override
  public List<Ainesosa> getPurilainen() {
    return this.hampurilainen;
  }

  @Override
  public McDonalds addSämpylä() {
    this.hampurilainen.add(new Sämpylä());
    return this;
  }

  @Override
  public McDonalds addMajoneesi() {
    this.hampurilainen.add(new Majoneesi());
    return this;
  }

  @Override
  public McDonalds addSalaatti() {
    this.hampurilainen.add(new Salaatti());
    return this;
  }

  @Override
  public McDonalds addPihvi() {
    this.hampurilainen.add(new Pihvi());
    return this;
  }

  @Override
  public McDonalds addHampurilaiskastike() {
    this.hampurilainen.add(new Hampurilaiskastike());
    return this;
  }

  @Override
  public McDonalds addSuolakurkku() {
    this.hampurilainen.add(new Suolakurkku());
    return this;
  }
}