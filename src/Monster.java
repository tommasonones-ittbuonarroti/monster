public class Monster {
    private String nome;
    private float HP;
    private float danno;

    public Monster(String nome, float HP) {
        this.nome = nome;
        this.HP = HP;
    }

    float damage(){

    }

    void subisci(){

    }

    
    @Override
    public String toString() {
        return "Monster{" +
                "nome='" + nome + '\'' +
                ", HP=" + HP +
                ", danno=" + danno +
                '}';
    }
}
