package table;

public class TablePosition {
    public static final TablePosition UTG1 = new TablePosition("UTG1");
    public static final TablePosition UTG2 = new TablePosition("UTG2");
    public static final TablePosition MP1 = new TablePosition("MP1");
    public static final TablePosition MP2 = new TablePosition("MP2");
    public static final TablePosition MP3 = new TablePosition("MP3");
    public static final TablePosition CO = new TablePosition("CO");
    public static final TablePosition BTN = new TablePosition("BTN");
    public static final TablePosition SB = new TablePosition("SB");
    public static final TablePosition BB = new TablePosition("BB");
    
    private final String id;

    private TablePosition(String id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return id;
    }
}
