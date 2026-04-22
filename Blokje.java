public class Blokje {
    private int nummer;
    private Kleur kleur;
    private boolean isJoker;

    public Blokje(int nummer, Kleur kleur, boolean isJoker)
    {
        this.nummer = nummer;
        this.kleur = kleur;
        this.isJoker = isJoker;
    }

    public boolean getIsJoker()
    {
        return isJoker;
    }
    
    public int getNummer()
    {
        return nummer;
    }
    
    public Kleur getKleur()
    {
        return kleur;
    }
}