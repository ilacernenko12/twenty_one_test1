import lombok.Getter;
@Getter
public class ÒIME_FORMAT {
    private int hh;
    private int mm;
    private int ss;

    public ÒIME_FORMAT(int hh, int mm, int ss) {
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
    }
}
