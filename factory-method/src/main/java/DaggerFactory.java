public class DaggerFactory extends WeaponFactory{

    @Override
    public Weapon get() {
        return new Dagger();
    }
}
