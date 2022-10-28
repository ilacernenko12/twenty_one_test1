import lombok.Getter;
@Getter
public class DATE_FORMAT {
    int dd; //приват
    int mm;
    int yyyy;

    public DATE_FORMAT(int dd, int mm, int yyyy) {
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
    }
}
