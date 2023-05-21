public class TankFactory extends WeaponFactory{
    @Override
    public Weapon get() {
        return new Tank();
    }
}
