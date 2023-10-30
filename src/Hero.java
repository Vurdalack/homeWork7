public abstract class Hero implements HavingSuperAbility{
     int health;
     int damage;

    String type0fSuperAbilitty;

    @Override
    public void applySuperAbility() {
        System.out.println("Magic cats Fire ball");
    }
}
