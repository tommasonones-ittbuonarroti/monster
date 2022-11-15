public class Monster {
    private String nome;
    private float HP;
    private float danno;

    public Monster(String nome, float HP, float danno) {
        this.nome = nome;
        this.HP = HP;
        this.danno=danno;
    }

    public void damage(){

    }

    public void subisci(float danno){
        HP -=danno;
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
