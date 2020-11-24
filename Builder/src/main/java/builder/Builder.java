package builder;

public interface Builder<T> {
  public T getPurilainen();
  public Builder<T> addSämpylä();
  public Builder<T> addMajoneesi();
  public Builder<T> addSalaatti();
  public Builder<T> addPihvi();
  public Builder<T> addHampurilaiskastike();
  public Builder<T> addSuolakurkku();
}