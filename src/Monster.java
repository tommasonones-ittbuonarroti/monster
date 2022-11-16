public class Monster {
    private String nome;
    private float HP;
    private float danno;

    public Monster(String nome, float HP, float danno) {
        this.nome = nome;
        this.HP = HP;
        this.danno=danno;
    }

    public String damage(){
        return "Hai subito un danno di "+danno+"";
    }

    public void subisci(float dannoSubiti){
        HP -= dannoSubiti;
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
