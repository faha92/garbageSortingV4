package dk.itu.garbage;

public class Item {
    public String mWhat = null;
    public String mWhere = null;
    public Item(String what, String where) { mWhat = what;  mWhere = where; }
    @Override
    public String toString() { return oneLine(""," in: "); }
    public String getWhat() { return mWhat; }
    public void setWhat(String what) { mWhat = what; }
    public String getWhere() { return mWhere; }
    public void setWhere(String where) { mWhere = where; }
    public String oneLine(String pre, String post) {
        return pre+mWhat + post + mWhere;
    }
}