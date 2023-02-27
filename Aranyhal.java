package main;

public class Aranyhal {

    private static final int KIVANSAGOKSZAMA = 3;
    private int kor;
    private String kivansagok;
    private String kifogta;

    public Aranyhal(String kifogta) {
        this.kifogta = kifogta;
    }

    public Aranyhal(int kor, String kifogta) {
        this.kor = kor;
        this.kifogta = kifogta;
    }

    public int getKor() {
        return kor;
    }

    public void setKifogta(String kifogta) {
        this.kifogta = kifogta;
    }

    public int KivansagokSzama(String kifogta) {
        this.kifogta = kifogta;
        return 0;
    }

    public String kikkelTalkozott() {
        return null;
    }

    public boolean kivansagotTeljesit(String kivansag) {
        return true;
    }

    @Override
    public String toString() {
        return "Aranyhal{" + "kor=" + kor + ", kivansagok=" + kivansagok + ", kifogta=" + kifogta + '}';
    }

}
